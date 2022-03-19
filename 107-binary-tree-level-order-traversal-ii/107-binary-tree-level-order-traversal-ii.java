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
        List<List<Integer>> ans=new ArrayList<>();
        fun(root,ans,0);
        return ans;
    }
    void fun(TreeNode root,List<List<Integer>> ans,int level){
        if(root==null)return;
        if(level>=ans.size())
            ans.add(0,new ArrayList<Integer>());
        fun(root.left,ans,level+1);
        fun(root.right,ans,level+1);
        
        ans.get(ans.size()-1-level).add(root.val);
        
    }
}