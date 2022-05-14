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
    public int pseudoPalindromicPaths (TreeNode root) {
        Map<Integer,Integer> map=new HashMap<>();
        return fun(root, map);
    }
    int fun(TreeNode root, Map<Integer,Integer> map){
        if(root==null)return 0;
        if(root.left==null && root.right==null){
            map.put(root.val,map.getOrDefault(root.val,0)+1);
            int c=0;
            for(int v:map.values()){
                c+=v%2;
            }
            map.put(root.val,map.get(root.val)-1);
            
            return c<=1?1:0;
        }
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        int left=fun(root.left,map);
        int right=fun(root.right,map);
        map.put(root.val,map.get(root.val)-1);
        return left+right;
    }
}