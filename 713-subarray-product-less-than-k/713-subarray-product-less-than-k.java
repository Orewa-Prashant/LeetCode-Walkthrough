class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        //if(k==0)return 0;
        int prd=1;
        int i=0,j=0,res=0;
        for(;i<nums.length;i++){
            prd*=nums[i];
            while(j<=i && prd>=k){
                prd/=nums[j++];
            }
            res+=i-j+1;
        }
        return res;
    }
}