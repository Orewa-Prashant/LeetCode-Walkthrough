class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]==target){
                int low=lower_bound(nums,l,m-1,target);
                int up=upper_bound(nums,m+1,r,target);
                return new int[]{low,up};
            }
            else if(nums[m]<target)l=m+1;
            else r=m-1;
        }
        return new int[]{-1,-1};
    }
    
    int lower_bound(int[] nums, int l, int r, int target){
        int ans=r+1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]>=target){
                ans=Math.min(ans,m);
                r=m-1;
            }
            else l=m+1;
        }
        return ans;
    }
    
    int upper_bound(int[] nums, int l, int r, int target){
        int ans=l-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]<=target){
                ans=Math.max(ans,m);
                l=m+1;
            }
            else r=m-1;
        }
        return ans;
    }    
}