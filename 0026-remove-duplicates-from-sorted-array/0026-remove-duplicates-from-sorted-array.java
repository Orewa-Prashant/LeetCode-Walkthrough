class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)return 0;
        if(nums.length==1)return 1;
        int a=nums[0];
        int index=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==a){
                continue;
            }
            else{
                a=nums[i];
                nums[index]=a;
                index++;
                
            }
            
        }
        return index;
    }
}