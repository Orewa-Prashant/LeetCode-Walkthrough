class Solution {
    public int countVowelStrings(int n) {
        int[][] dp=new int[n][5];
        //Base case
        for(int i=0;i<5;i++)
            dp[0][i]=i+1;
        for(int i=1;i<n;i++){
            int presum=0;
            for(int j=0;j<5;j++){
                dp[i][j]=presum+dp[i-1][j];
                presum=dp[i][j];
            }
        }
        return dp[n-1][4];
    }
}