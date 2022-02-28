class Solution {
    public int countBattleships(char[][] board) {
        int res=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='X'){
                    res+=fun(board,i,j);
                }
            }
        }
        return res;
    }
    int fun(char[][] board, int i, int j){
        if(i==board.length||j==board[0].length||i<0||j<0||board[i][j]=='.')
            return 1;
        board[i][j]='.';
        return Math.max((Math.max(fun(board,i-1,j),fun(board,i+1,j))),Math.max(fun(board,i,j+1),fun(board,i,j-1)));
    }
}