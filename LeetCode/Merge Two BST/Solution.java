import java.util.*;

class TreeNode{
  int data;
  TreeNode left, right;
  TreeNode(int d){
    this.data = d;
    left = right = null;
  }
}

class Main{
  TreeNode root;
  public static void main(String[] args){
    Main tree = new Main();
    tree.root = new TreeNode(8);
    tree.root.left = new TreeNode(2);
    tree.root.right= new TreeNode(10);
    tree.root.left.left = new TreeNode(1);
    tree.root.right.left = new TreeNode(9);

    Main tree2 = new Main();

    tree2.root = new TreeNode(5);
    tree2.root.left = new TreeNode(3);
    tree2.root.left.left = new TreeNode(0);

    System.out.println(tree.mergeTwoBST(tree.root, tree2.root));
  }

  public ArrayList<Integer> mergeTwoBST(TreeNode root1, TreeNode root2){
    Stack<TreeNode> st1 = new Stack<>();
    Stack<TreeNode> st2 = new Stack<>();

    ArrayList<Integer> res = new ArrayList<>();

    if(root1 != null){
      addAllLeftNodes(root1, st1);
    }

    if(root2 != null){
      addAllLeftNodes(root2, st2);
    }

    while(st1.size() > 0 && st2.size() > 0){
      TreeNode curr;
      boolean isFirst = false;

      if(st1.peek().data > st2.peek().data){
        curr = st2.pop();
      } else {
        curr = st1.pop();
        isFirst = true;
      }
      res.add(curr.data);

      if(curr.right != null && isFirst){
        addAllLeftNodes(curr.right, st1);
      } else if(curr.right != null && !isFirst){
        addAllLeftNodes(curr.right, st2);
      }

    }

    while(st1.size() > 0){
      TreeNode curr = st1.pop();
      res.add(curr.data);
      if(curr.right != null){
        addAllLeftNodes(curr.right, st1);
      }
    } 
    while(st2.size() > 0){
      TreeNode curr = st2.pop();
      res.add(curr.data);
      if(curr.right != null){
        addAllLeftNodes(curr.right, st2);
      }
    }

    return res;
  }



  public void addAllLeftNodes(TreeNode root, Stack<TreeNode> st){
    while(root != null){
      st.push(root);
      root = root.left;
    }
  }
}