class Solution {
    public int longestMountain(int[] nums) {
        int n=nums.length;
        int[] dp1=new int[n];
        int[] dp2=new int[n];
        for(int i=0;i<n;i++){
            dp1[i]=1;
            if(i>0&&nums[i]>nums[i-1])
                dp1[i]=dp1[i-1]+1;
        }
        
        for(int i=n-1;i>=0;i--){
            dp2[i]=1;
            if(i<n-1&&nums[i]>nums[i+1])
                dp2[i]=dp2[i+1]+1;
        }
        
        int lbs=0;
        for(int i=0;i<n;i++){
            if(dp1[i]>1&&dp2[i]>1)
            lbs=Math.max(lbs,dp1[i]+dp2[i]);
        }
        return lbs==0?0:lbs-1;
    }
}