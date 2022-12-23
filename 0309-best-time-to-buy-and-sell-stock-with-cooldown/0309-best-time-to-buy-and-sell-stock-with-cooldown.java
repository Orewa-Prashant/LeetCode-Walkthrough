class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][] dp=new int[n+2][2];
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<2;j++){
                if(j==0){
                    dp[i][j] = Math.max(dp[i+1][0],dp[i+1][1]-prices[i]);
                }
                else{
                    dp[i][j] = Math.max(dp[i+1][1], prices[i]+dp[i+2][0]);
                }
            }
        }
        return dp[0][0];
        // for(int[] a:dp)
        //     Arrays.fill(a,-1);
        // return fun(prices,0,1,dp);
    }
}