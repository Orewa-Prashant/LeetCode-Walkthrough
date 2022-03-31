class Solution {
    public int numWays(int steps, int arrLen) {
        int[][] dp=new int[steps+1][steps/2+1];
        for(int[] ap:dp)
            Arrays.fill(ap,-1);
        return fun(steps,arrLen,0,dp);
    }
    int fun(int steps, int len ,int ind, int[][] dp){
        int M=1000000007;
        if(ind==len||ind<0||ind>steps)return 0;
        if(steps==0){
            if(ind==0)return 1;
            return 0;
        }
        
        if(dp[steps][ind]!=-1)return dp[steps][ind];
        
        int moveLeft=fun(steps-1,len,ind-1,dp)%M;
        int moveRight=fun(steps-1,len,ind+1,dp)%M;
        int stay=fun(steps-1,len,ind,dp)%M;
        return dp[steps][ind]=((moveLeft+moveRight)%M+stay)%M;
    }
}