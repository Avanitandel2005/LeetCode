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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return dfs(root,p,q);
    }

    public TreeNode dfs(TreeNode root, TreeNode p, TreeNode q){

        if(root==null || root==p || root==q){
            return root;
        }

        TreeNode left=dfs(root.left,p,q);
        TreeNode right=dfs(root.right,p,q);

        if(left!=null && right!=null){
            return root;
        }

        if(left!=null){
            return left;
        }

        if(right!=null){
            return right;
        }

        return right;
    }
}