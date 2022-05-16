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
    public int deepestLeavesSum(TreeNode root) {
        int ans=0;
        Queue<TreeNode> qu=new LinkedList<>();
        qu.offer(root);
        int currSum=0;
        while(!qu.isEmpty()){
            int size=qu.size();
            currSum=0;
            for(int i=0;i<size;i++){
                TreeNode curr=qu.poll();
                currSum+=curr.val;
                if(curr.left!=null)qu.add(curr.left);
                if(curr.right!=null)qu.add(curr.right);
            }
            ans=currSum;
        }
        return ans;
    }
}