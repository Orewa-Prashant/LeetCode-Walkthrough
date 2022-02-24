/*
    
    A brief explaination:-
    
    1. The basic logic here is that you just have to compute the sum of all the nodes int a subtree. If a tree / subtree is having the sum of 0 then
    the subtree doesn't contains any 1.
    2. Whenever you find a node or root whose originated subtree is having a sum 0, then you just have to assign null in that place.
    3. There is a corner case when the main tree you have been given is made up of all Zeros then its sum will be 0 too. In that case you just have to return
    null for that answer.
    
 */
class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if(prune(root)==0)root=null;
        return root;
    }
    private int prune(TreeNode root){
        if(root==null)return 0;
        int left=prune(root.left);
        int right=prune(root.right);
        if(left==0)root.left=null;
        if(right==0)root.right=null;
        return root.val+left+right;
    }
}