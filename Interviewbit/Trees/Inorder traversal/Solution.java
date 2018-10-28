// Recursive Solution
	public void inOrder(TreeNode root) {
		if(root !=  null) {
			inOrder(root.left);
			//Visit the node by Printing the node data
			System.out.printf("%d ",root.data);
      //or add to res
			inOrder(root.right);
		}
	}

  public ArrayList<Integer> inorder(TreeNode root){

    Stack<TreeNode> stack = new Stack<>();
    ArrayList<Integer> res = new ArrayList<>();

    if(root == null) return res;

    TreeNode curr = root;

    while(!stack.empty() || curr != null){
      if(curr != null){
        stack.push(curr);
        curr = curr.left;
      }
      else{
        curr = curr.pop();
        res.add(curr.val);
        curr = curr.right;
      }
    }

  }

	
