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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans=new ArrayList<Integer>();
        if(root==null)return ans;
        Queue<TreeNode> qu=new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty()){
            int size=qu.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                TreeNode curr=qu.poll();
                max=Math.max(max,curr.val);
                if(curr.left!=null)qu.add(curr.left);
                if(curr.right!=null)qu.add(curr.right);
            }
            ans.add(max);
        }
        return ans;
    }
}
    