class Solution {
    public int matrixScore(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            if(grid[i][0]==0)
                flipRow(i,grid);
        }
        // These are the kind of solutions that makes me think that I too will be Amazon haha :)
        for(int j=1;j<grid[0].length;j++){
            int numberOfOnesInCol=0;
            for(int i=0;i<grid.length;i++){
                numberOfOnesInCol+=grid[i][j];
            }
            if(numberOfOnesInCol<=grid.length/2)
                flipCol(j,grid);
        }
        
        int res=0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=grid[0].length-1,k=0;j>=0;j--,k++){
                res+=grid[i][j]*(Math.pow(2,k));
            }
        }
        return res;
    }
    void flipRow(int i,int[][] grid){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]==0)grid[i][j]=1;
            else grid[i][j]=0;
        }
    }
    void flipCol(int j,int[][] grid){
        for(int i=0;i<grid.length;i++){
            if(grid[i][j]==0)grid[i][j]=1;
            else grid[i][j]=0;
        }
    }
}