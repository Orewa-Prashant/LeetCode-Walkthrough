class Solution {
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        // For returning -1
        
        // int count=1;
        // int prev=houses[0];
        // for(int i=1;i<m;i++){
        //     if(houses[i]==0)continue;
        //     if(prev!=houses[i]){
        //         count++;
        //         prev=houses[i];
        //     }
        // }
        //if(count>target)return -1;
        Integer[][][] dp=new Integer[target+1][m][n+1];
        int res=fun(houses,cost,target,0,0,dp);
        return res>=10000000?-1:res;
    }
    int fun(int[] houses, int[][] cost, int target, int i, int prevPaint, Integer[][][] dp){
        
        if(i==cost.length){
            if(target!=0)return 10000000;
            return 0;
        }
        if(target<0){
            return 10000000;
        }
        
        if(dp[target][i][prevPaint]!=null)return dp[target][i][prevPaint];
        
        int ans=100000000;
        if(houses[i]==0){
            for(int j=0;j<cost[0].length;j++){
                int currPaint=j+1;
                if(currPaint!=prevPaint)
                ans=Math.min(ans,cost[i][j]+fun(houses,cost,target-1,i+1,currPaint,dp));
                else ans=Math.min(ans,cost[i][j]+fun(houses,cost,target,i+1,prevPaint,dp));
            }
        }
        else{
            // Here, houses[i] is currPaint
            
            if(houses[i]!=prevPaint){
                ans=Math.min(ans,fun(houses,cost,target-1,i+1,houses[i],dp));
            }
            else{
                ans=Math.min(ans,fun(houses,cost,target,i+1,prevPaint,dp));
            }
        }
        
        return dp[target][i][prevPaint]=ans;
    }
}