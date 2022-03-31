class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
        int n=pairs.length;
        int[][] dp=new int[n][n+1];
        for(int[] ap:dp)
            Arrays.fill(ap,-1);
        return fun(pairs,n-1,n,dp);
    }
    int fun(int[][] pairs, int ind, int prev, int[][] dp){
        if(ind<0){
            return 0;
        }
        
        if(dp[ind][prev]!=-1)return dp[ind][prev];
        
        int take=0;
        if(prev==pairs.length || pairs[ind][1]<pairs[prev][0])
            take=1+fun(pairs,ind-1,ind,dp);
        int not=fun(pairs,ind-1,prev,dp);
        
        return dp[ind][prev]=Math.max(take,not);
    }
}