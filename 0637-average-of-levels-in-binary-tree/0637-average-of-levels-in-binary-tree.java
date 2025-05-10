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
    public List<Double> averageOfLevels(TreeNode root) {

        Queue<TreeNode> q = new ArrayDeque<>();
        List<Double> res= new ArrayList<>();
        if(root==null) return res;
        q.add(root);
        while(q.size()>0){
            double level = 0.0;
            int size=q.size();
            for(int i=0; i<size;i++){
            // for(int i=q.size();i>0;i--){
                TreeNode front = q.remove();
                level += front.val;
                if(front.left!=null) q.add(front.left);
                if(front.right!=null) q.add(front.right);
            }
            res.add(level/size);
        }   
        return res;
    }
}