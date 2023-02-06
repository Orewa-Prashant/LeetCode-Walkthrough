class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] ans= new int[2*n];int odd=n;int even=0;
        for(int i=0;i<2*n;i++)
        {
            if(i%2==0)
                ans[i]=nums[even++];
            else ans[i]=nums[odd++];
        }
        return ans;
    }
}