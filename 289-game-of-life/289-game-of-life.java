class Solution {
    public void gameOfLife(int[][] board) {
        int m=board.length,n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int hey=solve(board,i,j);
                if(board[i][j]==1){
                    if(hey<2||hey>3)
                        board[i][j]=-board[i][j];  
                }
                else{
                    board[i][j]=2;
                    if(hey!=3)
                    board[i][j]=-board[i][j];
                }
            }
        }
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                board[i][j]= board[i][j]<0? 0 : 1;
    }
    int solve(int[][] board, int i, int j){
        int ans=0;
        int m=board.length,n=board[0].length;
        if(i-1>=0 && Math.abs(board[i-1][j])==1)
            ans++;
        if(i+1<m && Math.abs(board[i+1][j])==1)
            ans++;
        if(i-1>=0 && j-1>=0 && Math.abs(board[i-1][j-1])==1)
            ans++;
        if(i-1>=0 &&j+1<n && Math.abs(board[i-1][j+1])==1)
            ans++;
        if(j+1<n && Math.abs(board[i][j+1])==1)
            ans++;
        if(i+1<m && j-1>=0 && Math.abs(board[i+1][j-1])==1)
            ans++;
        if(i+1<m && j+1<n && Math.abs(board[i+1][j+1])==1)
            ans++;
        if(j-1>=0 && Math.abs(board[i][j-1])==1)
            ans++;
        return ans;
    }
}