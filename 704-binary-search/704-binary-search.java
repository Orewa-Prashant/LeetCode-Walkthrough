class Solution {
    public int search(int[] nums, int target) {
        int b=0,l=nums.length-1;
        while(b<=l){
            int m=(l+b)/2;
            if(target==nums[m])return m;
            else if(target<nums[m])l=m-1;
            else b=m+1;
        }
        return -1;
    }
}