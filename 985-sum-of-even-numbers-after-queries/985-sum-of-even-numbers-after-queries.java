class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n=nums.length;
        int[] ans=new int[n];
        int sum=0;
        for(int i:nums) sum+=i%2==0?i:0;
        int k=0;
        for(int[] qu:queries){
            int idx=qu[1];
            int val=qu[0];
            if(nums[idx]%2==0){
                sum-=nums[idx];
                nums[idx]+=val;
                sum+=nums[idx]%2==0?nums[idx]:0;
            }
            else{
                nums[idx]+=val;
                sum+=nums[idx]%2==0?nums[idx]:0;
            }
            ans[k++]=sum;
        }
        return ans;
    }
}