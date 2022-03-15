class Solution {
    public int cherryPickup(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        
        int[][][] dp=new int[n][m][m];
        for(int[][] arr:dp)
            for(int[] ar:arr)
                Arrays.fill(ar,-1);
        
        return fun(0,0,m-1,m,n,grid,dp);
    }
    int fun(int i, int j1, int j2,int m, int n, int[][] grid, int[][][] dp){
        if(j1<0||j1>=m||j2<0||j2>=m)return -10000000;
        if(i==n-1){
            if(j1==j2)return grid[i][j1];
            else return grid[i][j1]+grid[i][j2];
        }
        
        if(dp[i][j1][j2]!=-1)return dp[i][j1][j2];
        
        // recursive calls to get down all the paths
        
        int max=0;
        for(int dj1=-1;dj1<=1;dj1++){
            for(int dj2=-1;dj2<=1;dj2++){
                if(j1==j2)
                    max=Math.max(max,grid[i][j1]+fun(i+1,j1+dj1,j2+dj2,m,n,grid,dp));
                else{
                    max=Math.max(max,grid[i][j1]+grid[i][j2]+fun(i+1,j1+dj1,j2+dj2,m,n,grid,dp));
                }
            }
        }
        return dp[i][j1][j2]=max;
    }
}