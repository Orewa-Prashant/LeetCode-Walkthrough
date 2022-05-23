class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp=new int[arr.length+1];
        for(int ind=arr.length;ind>=0;ind--){
            int max=0;
            int ans=0;
            for(int i=ind;i<ind+k && i<arr.length;i++){
                max=Math.max(max,arr[i]);
                int ct=i-ind+1;
                ans=Math.max(ans,ct*max+dp[i+1]);
            }
            dp[ind]=ans;
        }
        return dp[0];
        //return fun(arr, 0, k,dp);
    }
}