class Solution {
    List<List<String>> l = new ArrayList<List<String>>();
    public List<List<String>> solveNQueens(int n) {
        int[][] t= new int[n][n];
        nqueen(t,n,0);
        return l;
    }
    
    private void nqueen(int[][] t,int n,int row){
        if(row==n){
            List<String> p= new ArrayList<>();
            for(int[] c:t){
                StringBuilder s= new StringBuilder();
                for(int b: c){
                    if(b==0)s.append(".");
                    else s.append("Q");
                }
            p.add(s.toString());
        }
            l.add(p);
            return;
        }
        
        for(int i=0;i<n;i++){
            if(isQueenSafe(t,row,i)){
                t[row][i]=1;
                nqueen(t,n,row+1);
                t[row][i]=0;
            }
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