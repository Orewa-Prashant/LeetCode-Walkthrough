class Solution {
    public int closedIsland(int[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){  
                    c+=fun(grid,i,j);
                }
            }
        }
        return c;
    }
    int fun(int[][] grid, int i, int j){
        if(i<0||i==grid.length||j<0||j==grid[0].length){
            return 0;
        }
        if(grid[i][j]==1)return 1;
        int a=1,b=1,c=1,d=1;
        grid[i][j]=1;
        a=fun(grid,i,j+1);
        b=fun(grid,i,j-1);
        c=fun(grid,i+1,j);
        d=fun(grid,i-1,j);
        return Math.min(Math.min(a,b),Math.min(c,d));
    }
}