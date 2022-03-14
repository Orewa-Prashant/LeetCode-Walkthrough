class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=nums[0],zeroct=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=0)
            product*=nums[i];
            else zeroct++;
        }
            
        int[] ans=new int[nums.length];
        
        if(zeroct>1)return ans;
        
        for(int i=0;i<nums.length;i++){
            if(zeroct==1){
                if(nums[i]==0)ans[i]=product;
            }
            else{
                ans[i]=product/nums[i];
            }
        }
        return ans;
    }
}