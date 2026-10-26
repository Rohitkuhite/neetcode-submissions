/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  public List<Integer> arrayList = new ArrayList<>();

    public List<Integer> inorder(TreeNode curr){
        if(curr == null){  
            return null;
        }
         
        inorder(curr.left); 
        arrayList.add(curr.val);
        inorder(curr.right);
        
        return arrayList; 
    }
    public List<Integer> inorderTraversal(TreeNode root) {

              inorder(root);

            return arrayList;
    }
}