class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int[][] ans=new int[matrix.length][matrix[0].length];
        int min=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                min=Math.max(min,fun(i,j,-1,matrix,ans));
            }
        }
        return min;
    }
    int fun(int row,int col,int prev,int[][] mat,int[][] ans){
        if(row==mat.length||col==mat[0].length||row<0||col<0)
            return 0;
        if(prev!=-1&&mat[row][col]<=prev)return 0;
        
        if(ans[row][col]!=0)return ans[row][col];
        int a=fun(row+1,col,mat[row][col],mat,ans);
        int b=fun(row,col+1,mat[row][col],mat,ans);
        int c=fun(row-1,col,mat[row][col],mat,ans);
        int d=fun(row,col-1,mat[row][col],mat,ans);
        return ans[row][col]=1+Math.max(Math.max(a,b),Math.max(c,d));
    }
}