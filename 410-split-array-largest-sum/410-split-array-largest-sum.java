class Solution {
    public int splitArray(int[] nums, int m) {
        int n=nums.length;
        int[] pre=new int[n];
        int sum=0;
        int k=0;
        for(int i:nums){
            sum+=i;
            pre[k++]=sum;
        }
        int[][] dp=new int[n][m+1];
        for(int[] ap:dp)
            Arrays.fill(ap,-1);
        return fun(pre,0,m,dp);
        
    }
    int fun(int[] pre, int ind, int m, int[][] dp){
        if(m==1){
            return (ind==0)?pre[pre.length-1]:pre[pre.length-1]-pre[ind-1];
        }
        
        if(dp[ind][m]!=-1)return dp[ind][m];
        
        int res=Integer.MAX_VALUE;
        for(int i=ind;i<=pre.length-m;i++){
            int sum=0;
            if(ind==0)sum=pre[i];
            else sum=pre[i]-pre[ind-1];
            
            int max=Math.max(sum,fun(pre,i+1,m-1,dp));
            
            res=Math.min(res,max);
            dp[ind][m]=res;
        }
        return res;
    }
}