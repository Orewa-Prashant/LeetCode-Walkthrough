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
        List<Double> ans=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int len=queue.size();
            long sum=0;
            for(int i=0;i<len;i++){
                TreeNode curr=queue.poll();
                sum+=curr.val;
                if(curr.left!=null)
                queue.offer(curr.left);
                if(curr.right!=null)
                queue.offer(curr.right);
            }
            ans.add((double)sum/len);
        }
        return ans;
    }
}