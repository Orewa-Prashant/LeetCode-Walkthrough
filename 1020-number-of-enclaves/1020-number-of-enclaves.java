class Solution {
    public int numEnclaves(int[][] grid) {
        int c=0;
        int[] val=new int[]{0};
        for(int i=1;i<grid.length-1;i++){
            for(int j=1;j<grid[0].length-1;j++){
                if(grid[i][j]==1){
                    val[0]=0;
                    c+=fun(grid,i,j,val)*val[0];
                }
            }
        }
        return c;
    }
    int fun(int[][] grid, int i, int j, int[] val){
        if(i<0||i==grid.length||j<0||j==grid[0].length)
            return 0;
        if(grid[i][j]==0)return 1;
        int a=1,b=1,c=1,d=1;
        grid[i][j]=0;
        val[0]++;
        a=fun(grid,i,j+1,val);
        b=fun(grid,i,j-1,val);
        c=fun(grid,i+1,j,val);
        d=fun(grid,i-1,j,val);
        return (a==0||b==0||c==0||d==0)?0:1;
    }
}