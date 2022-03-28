class Solution {
    public boolean search(int[] nums, int target) {
        int div=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                div=i;
                break;
            }
        }
        return fun(0,div,nums,target)||fun(div+1,nums.length-1,nums,target);
    }
    boolean fun(int l, int r, int[] nums, int target){
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target)return true;
            else if(nums[mid]<target)l=mid+1;
            else r=mid-1;
        }
        return false;
    }
}