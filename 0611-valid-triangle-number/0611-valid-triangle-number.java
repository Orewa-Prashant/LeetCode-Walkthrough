class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                count+=search(nums,nums[i]+nums[j],j+1);
            }
        }
        return count;
    }
    int search(int[] nums, int val, int i){
        int l=i,r=nums.length-1;
        int ans=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]<val){
                l=m+1;
                ans=Math.max(ans,m);
            }
            else r=m-1;
        }
        return ans==-1? 0:ans-i+1;
    }
}