class Solution {
    public int maxProfit(int[] prices) {
        int k=2;
        int n=prices.length;
        int[][][] dp=new int[n+1][2][k+1];
        
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<2;j++){
                for(int p=1;p<=k;p++){
                    if(j==1){
                        dp[i][j][p]=Math.max(-prices[i]+dp[i+1][0][p],dp[i+1][1][p]);
                    }
                    else
                        dp[i][j][p]=Math.max(prices[i]+dp[i+1][1][p-1],dp[i+1][0][p]);
                }
            }
        }
        return dp[0][1][k];
    }
}