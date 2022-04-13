class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i:nums)
            sum^=i;
        int ans=0;
        for(int i=0;i<=n;i++)
            ans^=i;
        return sum^ans;
    }
}