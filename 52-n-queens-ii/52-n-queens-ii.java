class Solution {
    int res=0;
    public int totalNQueens(int n) {
        int[][] t=new int[n][n];
        nqueen(t,0);
        return res;
    }
    private void nqueen(int[][] t,int row){
        if(row==t.length){
            res++;
            return;
        }
        for(int i=0;i<t.length;i++)
            if(isQueenSafe(t,row,i)){
                t[row][i]=1;
                nqueen(t,row+1);
                t[row][i]=0;
            }
        
    }
     private boolean isQueenSafe(int[][] t, int row, int col){
         for(int i=row-1,j=col;i>=0;i--)
             if(t[i][j]==1)return false;
         for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--)
             if(t[i][j]==1)return false;
        for(int i=row-1,j=col+1;i>=0&&j<t.length;i--,j++)
             if(t[i][j]==1)return false;
         return true;
     }
}