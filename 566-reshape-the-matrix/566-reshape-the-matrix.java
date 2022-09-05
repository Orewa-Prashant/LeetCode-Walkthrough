class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length,n=mat[0].length;
        if(m*n!=r*c)return mat;
        int[][] arr=new int[r][c];
        int a=0,b=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[a][b]=mat[i][j];
                if(++b==c){
                    a++;
                    b=0;
                }
            }
        }
        return arr;
    }
}