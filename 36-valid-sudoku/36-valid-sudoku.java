class Solution {
    public boolean isValidSudoku(char[][] b) {
       HashSet<String> h= new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(b[i][j]!='.')
                {
                    String bs="("+b[i][j]+")";
                    if(!h.add(bs+i)||!h.add(j+bs)||!h.add(i/3+bs+j/3))
                        return false;
                }
            }
        }
        return true;
    }
    
}