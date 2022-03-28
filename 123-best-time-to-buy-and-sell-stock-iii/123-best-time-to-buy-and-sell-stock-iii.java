class Solution {
    public int maxProfit(int[] prices) {
        int[] left=new int[prices.length];
        int[] right=new int[prices.length];
        
        int min=100000;
        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            if(i==0)
            left[i]=0;
            else{
                left[i]=Math.max(prices[i]-min,left[i-1]);
            }
        }
        
        int max=0;
        for(int i=prices.length-1;i>=0;i--){
            max=Math.max(max,prices[i]);
            if(i==prices.length-1)
            right[i]=0;
            else{
                right[i]=Math.max(max-prices[i],right[i+1]);
            }
        }
        
        int profit=0;
        for(int i=0;i<prices.length;i++){
            profit=Math.max(profit,left[i]+right[i]);
        }
        return profit;
    }
}