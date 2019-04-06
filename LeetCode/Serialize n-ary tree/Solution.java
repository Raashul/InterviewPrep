import java.util.*;

class Main {

    // Reference: https://www.geeksforgeeks.org/serialize-deserialize-n-ary-tree/
    public static void main(String[] args) {
        Main sol = new Main();

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        Node j = new Node(10);
        Node k = new Node(11);

        a.children.add(b);
        a.children.add(c);
        a.children.add(d);

        b.children.add(e);
        b.children.add(f);

        f.children.add(k);

        d.children.add(g);
        d.children.add(h);
        d.children.add(i);
        d.children.add(j);

        String input = sol.serialize(a);
        System.out.println(input);

        Node res = sol.deserialize(input);
        sol.printTree(res, res);
    }

    String marker = ")"; // marker when scanned all children of one node
    String separator = ";"; // separator for every node's value

    public String serialize(Node root) {
        StringBuilder rst = new StringBuilder();
        buildString(rst, root);
        return rst.toString();
    }

    private void buildString(StringBuilder rst, Node node) {
        if(node == null) return;

        rst.append(node.value);
        rst.append(separator); // separator for node' value with other values
        for(Node child : node.children) {
            buildString(rst, child);
        }
        rst.append(marker);
        rst.append(separator); // separator for ")" marker
    }

    public Node deserialize(String input) {
        Queue<String> queue = new LinkedList<>();
        for(String val : input.split(separator)) {
          System.out.println("val is " + val);
            if(val.length() > 0) queue.offer(val);
        }
        return buildTree(queue);
    }

    private Node buildTree(Queue<String> queue) {
        if(queue.isEmpty()) return null;

        String cur = queue.poll();
        Node node = new Node(Integer.valueOf(cur));

        // 如果queue.peek()不是末尾marker，表示任然在current node的children中遍历
        while(queue.size() > 0 && !queue.peek().equals(marker)) {
            node.children.add(buildTree(queue));
       }
       // 此时表示遍历current node的children结束，遇见marker，所以poll() 出该marker
       if(queue.size() > 0) queue.poll();
        return node;
    }

    public void printTree(Node root, Node parent) {
        if(root == null) return;
        System.out.printf("parent: %d, cur: %d \n", parent.value, root.value);
        for(Node child : root.children) {
            printTree(child, root);
        }
    }
}

class Node {
    int value;
    List<Node> children;

    public Node(int value) {
        this.value = value;
        children = new ArrayList<>();
    }
}