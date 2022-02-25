class Solution {
    public int countSquares(int[][] mat) {
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==0||j==0||mat[i][j]==0){
                    continue;
                }
                else{
                    mat[i][j]+=Math.min(Math.min(mat[i-1][j],mat[i-1][j-1]),mat[i][j-1]);
                }
            }
        }
        int ans=0;
        for(int[] a:mat)
            for(int p:a)
                ans+=p;
        return ans;
    }
}