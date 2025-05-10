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
    ArrayList<Integer> al;
    public void dfs(TreeNode root) {
        if(root == null) return;

        dfs(root.left);
        al.add(root.val);
        dfs(root.right);
    }  

    public int getMinimumDifference(TreeNode root){
        al=new ArrayList<>();
        dfs(root);
        int diff = Integer.MAX_VALUE;
        for(int i=0;i<al.size()-1;i++){
            int currentdiff = al.get(i+1) - al.get(i);
            diff=Math.min(diff,currentdiff);
        }
        return diff;
    }
}