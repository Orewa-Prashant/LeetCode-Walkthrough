class Solution {
    public int uniquePathsWithObstacles(int[][] o ){
        
        int m=o.length;
        int n=o[0].length;
        int[][] t= new int[m+1][n+1];
        for(int i=0;i<m+1;i++)
            for(int j=0;j<n+1;j++)
                t[i][j]=-1;
        
        return paths(t,o,m,n);
    }
    private int paths(int[][] t,int[][] o,int m, int n){
        if(m<1||n<1)return 0;
        if(o[m-1][n-1]==1)return 0;
        if(m==1&&n==1)return 1;
        if(t[m][n]!=-1)return t[m][n];
        else return t[m][n]=paths(t,o,m-1,n)+paths(t,o,m,n-1);
    }
}