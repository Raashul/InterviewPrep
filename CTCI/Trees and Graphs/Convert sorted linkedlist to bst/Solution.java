/**
* Definition for singly-linked list.
* public class ListNode {
*     int val;
*     ListNode next;
*     ListNode(int x) { val = x; }
* }
*/
/**
* Definition for a binary tree node.
* public class TreeNode {
*     int val;
*     TreeNode left;
*     TreeNode right;
*     TreeNode(int x) { val = x; }
* }
*/
class Solution {
  ListNode h;
  public TreeNode sortedListToBST(ListNode head) {
    if(head == null) return null;
    h = head;
    int len = getLength(head);
    return constructBST(0, len-1);
  }
  public int getLength(ListNode node){
    int len = 0;
    while(node != null){
      node = node.next;
      len++;
    }
    return len;
  }

  public TreeNode constructBST(int start, int end){
    if(start > end) return null;

    int mid = (start + end ) / 2;
    TreeNode left  = constructBST(0, mid-1);
    TreeNode root = new TreeNode(h.val);
    h = h.next;
    TreeNode right = constructBST(mid+1, end);

    root.left = left;
    root.right = right;
    return root;
  }

}
