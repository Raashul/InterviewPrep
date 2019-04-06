
public class MirrorTree 
{
    class QueueNode 
    {
        TreeNode node;
        int level;
         
        QueueNode(TreeNode node, int level)
        {
            this.node = node;
            this.level = level;
        }
    }
     
    class TreeNode 
    {
        private int data;
        ArrayList<TreeNode> children;
         
        public TreeNode(int data) 
        {
            this.data = data;
            children = new ArrayList();
        }
    }
     
    private TreeNode root;
      
    public void convertToMirror() 
    {
        convertToMirror(root);
    }
      
     private void convertToMirror(TreeNode root) 
    {
        if(root == null) {
            return;
        }
 
        // create mirror images of sub-trees rooted at child nodes
        for (int i = 0; i < root.children.size(); i++)
        {
            convertToMirror(root.children.get(i));
        }
         
        // now reverse the order of child nodes
        Collections.reverse(root.children);
    }
     
    /*
     * Create a sample tree
     *                  1
     *           2      3      4
     *         5  6     7     8  9
     * 
     */
    public void createSampleTree() 
    {
         TreeNode n1 = new TreeNode(1);
         TreeNode n2 = new TreeNode(2);
         TreeNode n3 = new TreeNode(3);
         TreeNode n4 = new TreeNode(4);
          
         TreeNode n5 = new TreeNode(5);
         TreeNode n6 = new TreeNode(6);
         TreeNode n7 = new TreeNode(7);
         TreeNode n8 = new TreeNode(8);
         TreeNode n9 = new TreeNode(9);
 
         root = n1;
          
         root.children.add(n2);
         root.children.add(n3);
         root.children.add(n4);
          
         n2.children.add(n5);
         n2.children.add(n6);
          
         n3.children.add(n7);
          
         n4.children.add(n8);
         n4.children.add(n9);
    }
     
     
    public void printLevelOrder()
    {
        if (root == null) return;
         
        LinkedList<QueueNode> queue = new LinkedList();
         
        queue.add(new QueueNode(root, 0));
         
        int maxLevelVisited = -1;
         
        while (!queue.isEmpty())
        {
            QueueNode currentQueueNode = queue.remove();
             
            if (currentQueueNode.level > maxLevelVisited)
            {
                System.out.print("\n Level-" + currentQueueNode.level + ": ");
                maxLevelVisited = currentQueueNode.level; 
            }
            System.out.print(currentQueueNode.node.data + " ");
             
            for (int i = 0; i < currentQueueNode.node.children.size(); i++)
            {
                queue.add(new QueueNode(currentQueueNode.node.children.get(i),  currentQueueNode.level + 1));
            }
        }
         
    }
     
     
    public static void main(String[] args) {
        MirrorTree tree = new MirrorTree();
      
        /*
         * Create a sample tree
         *                  1
         *           2      3      4
         *         5  6     7     8  9
         * 
        */
        tree.createSampleTree();
        System.out.print("Original tree level order trvaersal:");
        tree.printLevelOrder();
         
        tree.convertToMirror();
 
        /*
         * Converted mirror tree
         *                  1
         *          4       3      2
         *        9  8      7     6  5
         * 
        */       
        System.out.print("\n\nMirror tree level order trvaersal:");
        tree.printLevelOrder();
    }
}
 