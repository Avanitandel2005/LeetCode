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

    List<Integer> res = new ArrayList<>();
    
    public void dfs(TreeNode root,int k){
        if(root==null) return;
        if(k==0) {
            res.add(root.val);
            return;
        }
        dfs(root.left,k-1);
        dfs(root.right,k-1);
    }
    public int find(TreeNode root, TreeNode target, int k){
        if(root==null) return -1;
        if(root==target){
            dfs(root,k);
            return 1;
        }

        int left=find(root.left,target,k);

        if(left!=-1){
            if(k==left){
            res.add(root.val);
            return -1;
            }

            dfs(root.right,k-left-1);
            return 1+left;
        }
        int right=find(root.right,target,k);

         if(right!=-1){
            if(k==right){
            res.add(root.val);
            return -1;
            }
            dfs(root.left,k-right-1);
            return 1+right;
        }
        return -1;
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        find(root,target,k);
        return res;
    }
}