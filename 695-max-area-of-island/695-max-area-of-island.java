class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    max=Math.max(max,fun(grid,i,j));
                    grid[i][j]=0;
                }
            }
        }
        return max;
    }
    int fun(int[][] grid,int i, int j){
        if(i>=grid.length||i<0||j<0||j>=grid[0].length||grid[i][j]!=1){
            return 0;
        }
        grid[i][j]=2;
        int a=fun(grid,i+1,j);
        int b=fun(grid,i,j+1);
        int c=fun(grid,i-1,j);
        int d=fun(grid,i,j-1);
        return 1+a+b+c+d;
    }
}