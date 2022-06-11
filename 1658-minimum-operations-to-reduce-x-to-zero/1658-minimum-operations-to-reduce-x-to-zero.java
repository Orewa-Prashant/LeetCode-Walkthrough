class Solution {
    public int minOperations(int[] nums, int x) {
    //     Integer[][] dp=new Integer[nums.length][nums.length];
    //     int a=fun(nums,0,nums.length-1,x,dp);
    //     return a>=1000000?-1:a;
    // }
    // int fun(int[] nums, int i, int j, int x,Integer[][] dp){
    //     if(x<0||i==nums.length||j<0)return 1000000;
    //     if(x==0)return 0;
    //     if(dp[i][j]!=null)return dp[i][j];
    //     return dp[i][j]=1+Math.min(fun(nums,i+1,j,x-nums[i],dp),fun(nums,i,j-1,x-nums[j],dp));
    // }
        
    /*
        Well there are some realle geius people among us.., implementing a genius soln by a genius
    */
        int ans=-1;
        int i=0,j=0;
        long sum=0;
        for(int v:nums)
            sum+=v;
        long reqSum=sum-x;
        if(reqSum<0)return -1;
        //System.out.println(sum+" "+reqSum);
        sum=0;
        for(;i<nums.length;i++){
            sum+=nums[i];
            while(j<=i && sum>reqSum){
                sum-=nums[j++];
            }
            if(sum==reqSum){
                ans=Math.max(ans,i-j+1);
            }
        }
        return ans==-1?ans:nums.length-ans;
        //return nums.length-ans;
    }
}