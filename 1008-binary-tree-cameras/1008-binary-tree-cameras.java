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
    int camera=0;
    public int minCameraCover(TreeNode root) {
        String res= dfs(root);
        if(res=="need")
            camera++;
        return camera;
        
    }

    public String dfs(TreeNode root){
        if(root==null) return "covered";

        String l=dfs(root.left);
        String r=dfs(root.right);

        if(l=="need" || r=="need"){
            camera++;
            return "camera";
        }

        if(l=="covered" && r=="covered"){
            return "need";
        }
        return "covered";



    } 
}