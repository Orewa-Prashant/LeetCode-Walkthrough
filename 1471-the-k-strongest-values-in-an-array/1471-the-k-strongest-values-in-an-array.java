class Solution {
    public int[] getStrongest(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int med=nums[(n-1)/2];
        int[] res=new int[k];
        int p=0;
        int i=0,j=n-1;
        while(i<=j && p<k){
            if(Math.abs(nums[j]-med)>=Math.abs(nums[i]-med))
                res[p++]=nums[j--];
            else{
                res[p++]=nums[i++];
            }
        }
        return res;
    }
}

// 6 6 7 7 8 11