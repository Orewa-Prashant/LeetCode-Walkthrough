class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int ct=0;
        for(int i=0;i<grid2.length;i++){
            for(int j=0;j<grid2[0].length;j++){
                if(grid2[i][j]==1 && fun(grid1,grid2,i,j))
                    ct++;
            }
        }
        return ct;
    }
    boolean fun(int[][] grid, int[][] sub, int i, int j){
        if(i<0||i==sub.length||j<0||j==sub[0].length||sub[i][j]==0)return true;
        if(grid[i][j]==0){
            return sub[i][j]==0?true:false;
        }
        sub[i][j]=0;
        boolean a=fun(grid,sub,i+1,j);
        boolean b=fun(grid,sub,i,j+1);
        boolean c=fun(grid,sub,i-1,j);
        boolean d=fun(grid,sub,i,j-1);
        return a&&b&&c&&d;
    }
}