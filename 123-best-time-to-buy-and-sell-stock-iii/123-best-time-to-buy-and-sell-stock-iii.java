class Solution {
    public int maxProfit(int[] prices) {
        int k=2;
        int n=prices.length;
        int[][] after=new int[2][k+1];
        int[][] curr=new int[2][k+1];
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<2;j++){
                for(int p=1;p<=k;p++){
                    if(j==1){
                        curr[j][p]=Math.max(-prices[i]+after[0][p],after[1][p]);
                    }
                    else
                        curr[j][p]=Math.max(prices[i]+after[1][p-1],after[0][p]);
                }
            }
            after=curr;
        }
        return after[1][k];
    }
}