/*
 
 A brief explaiantin:-
 1. We just have to traverse the tree using dfs, because in dfs we travel the path int which all nodes are kind of descendants so
 the nodes we traverse were just simply their Ancestors.
 2. So using, dfs you just have to keep track of the maximum and minimum value found so far.
 3. When you reach base case, you just have to store the value in the final answer if its greater than the final answer itself.
 That way you will be getting the biggest difference.
Note:- Please don't update the max and min variables int the function body, instead do it in the recursive calls, so that the you
don't have to BACKTRACK these values( Implicit Backtracking).
 */
class Solution {
    int ans;
    public int maxAncestorDiff(TreeNode root) {
        fun(root,1000001,0);
        return ans;
    }
    void fun(TreeNode root,int min,int max){
        if(root==null){
            ans=Math.max(max-min,ans);
            return;
        }
        fun(root.left,Math.min(min,root.val),Math.max(max,root.val));
        fun(root.right,Math.min(min,root.val),Math.max(max,root.val));
    }
}