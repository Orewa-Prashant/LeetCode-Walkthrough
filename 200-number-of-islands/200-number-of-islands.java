class Solution {
    public int numIslands(char[][] grid) {
        int res=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1')
                res+=fun(grid,i,j);
            }
        }
        return res;
    }
    int fun(char[][] grid,int i, int j){
        if(i<0||j<0||i==grid.length||j==grid[0].length||grid[i][j]!='1')
            return 1;
        grid[i][j]='0';
        int a=fun(grid,i+1,j);
        int b=fun(grid,i-1,j);
        int c=fun(grid,i,j+1);
        int d=fun(grid,i,j-1);
        return (a==1||b==1||c==1||d==1)?1:0;
    }
}