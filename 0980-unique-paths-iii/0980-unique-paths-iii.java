class Solution {
    int c=0;
    public int uniquePathsIII(int[][] grid) {
        int e=0;
        for(int[] i:grid){
            for(int j:i)
                if(j==0)e++;
        }
        //System.out.println(e);
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++)
                if(grid[i][j]==1)
                    fun(i,j,grid,e+1);
        }
        return c;
    }
    void fun(int i,int j,int[][] grid,int e){
        if(i==grid.length||i<0||j==grid[0].length||j<0||grid[i][j]==-1)
            return;
        if(grid[i][j]==2){
            if(e==0)
            c++;
            return;
        }
        grid[i][j]=-1;
        fun(i+1,j,grid,e-1);
        fun(i-1,j,grid,e-1);
        fun(i,j+1,grid,e-1);
        fun(i,j-1,grid,e-1);
        grid[i][j]=0;
    }
}