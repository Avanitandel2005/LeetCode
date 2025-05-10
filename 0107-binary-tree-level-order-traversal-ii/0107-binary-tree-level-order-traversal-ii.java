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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        List<List<Integer>> res= new ArrayList<>();

        if(root==null) return res;

        q.add(root);
        while(q.size()>0){
            List<Integer> level = new ArrayList<>();
            int size=q.size();
            for(int i=0; i<size;i++){
            // for(int i=q.size();i>0;i--){
                TreeNode front = q.remove();
                level.add(front.val);
                if(front.left!=null) q.add(front.left);
                if(front.right!=null) q.add(front.right);
            }
            res.add(level);
        }   
        Collections.reverse(res);
        return res;
    }
}