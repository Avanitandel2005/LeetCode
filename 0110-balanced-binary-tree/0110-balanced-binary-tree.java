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
    public boolean isBalanced(TreeNode root) {

        if(root==null) 
            return true;

        int lh= maxDepth(root.left);
        int rh= maxDepth(root.right);

        if(Math.abs(lh-rh)>1) return false;

        boolean lbal=isBalanced(root.left);
        boolean rbal=isBalanced(root.right);

        return lbal && rbal;
        
    }

    public int maxDepth(TreeNode root){
        if(root==null) 
            return 0;

        int lh= maxDepth(root.left);
        int rh= maxDepth(root.right);

        int mans=Math.max(lh,rh)+1;

        return mans;
        


    }
}