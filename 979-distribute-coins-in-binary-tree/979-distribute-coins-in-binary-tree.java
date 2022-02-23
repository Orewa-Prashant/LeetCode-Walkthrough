/*
    I took help for this solution...so I am not able to explain it for now.
    
    1. This is a tricky question and you need to know or somehow come up with the fact that the total or minimum moves required to distribute a coin to each node is abs(left) + abs(right).
    2. Take help from reliable sources....so that you understand this question well.
    
    Good luck :)
 */
class Solution {
    int minMoves=0;
    public int distributeCoins(TreeNode root) {
        fun(root);
        return minMoves;
    }
    int fun(TreeNode root){
        if(root==null)return 0;
        int left=fun(root.left);
        int right=fun(root.right);
        minMoves+=Math.abs(left)+Math.abs(right);
        return root.val+left+right-1;
    }
}