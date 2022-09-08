class Solution {
    int m=1000000007;
    //Map<String,Integer> map=new HashMap<>();
    
    public int numberOfWays(int startPos, int endPos, int k) {
        Integer[][] dp=new Integer[3002][k+1];
        
        return fun(startPos,endPos,k,dp);
    }
    int fun(int s, int e, int k, Integer[][] dp){
        if(Math.abs(s-e)>k)return 0;
        if(k==0){
            return s==e?1:0;
        }
        if(dp[s+1000][k]!=null)return dp[s+1000][k];
        return dp[s+1000][k]=(fun(s+1,e,k-1,dp)%m+fun(s-1,e,k-1,dp)%m)%m;
        
    }
}