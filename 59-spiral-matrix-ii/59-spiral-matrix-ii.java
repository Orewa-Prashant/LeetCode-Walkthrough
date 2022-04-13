class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans=new int[n][n];
        int sr=0,sc=0,mr=n,mc=n;
        int k=1,i=0,j=0;
        while(k<=n*n){
            for(j=sc;j<mc;j++){
                ans[i][j]=k++;
            }
            sr++;j--;
            if(k>n*n)break;
            for(i=sr;i<mr;i++){
                ans[i][j]=k++;
            }
            mc--;i--;
            if(k>n*n)break;
            for(j=mc-1;j>=sc;j--){
                ans[i][j]=k++;
            }
            mr--;j++;
            if(k>n*n)break;
            for(i=mr-1;i>=sr;i--){
                ans[i][j]=k++;
            }
            sc++;i++;
        }
        return ans;
    }
}