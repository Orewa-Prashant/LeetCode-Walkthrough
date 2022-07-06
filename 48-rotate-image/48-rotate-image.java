class Solution {
    public void rotate(int[][] matrix) {
        
        // First transpose the matrix
        
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[i].length;j++){
                int tmp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tmp;
            }
        }
        
        // Now reverse each row of the image
        
        for(int i=0;i<matrix.length;i++){
            int j=0,k=matrix[i].length-1;
            while(j<k){
                int tmp=matrix[i][j];
                matrix[i][j]=matrix[i][k];
                matrix[i][k]=tmp;
                j++;k--;
            }
        }
        
    }
}