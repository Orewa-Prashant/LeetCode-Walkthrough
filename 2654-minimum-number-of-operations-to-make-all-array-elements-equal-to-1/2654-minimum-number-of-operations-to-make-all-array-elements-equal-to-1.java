class Solution {
    public int minOperations(int[] nums) {
        int len=10000;
        int c=0;
        for(int i : nums)if(i==1)c++;
        if(c>0)return nums.length-c;
        for(int i=0;i<nums.length;i++){
            int gcd = nums[i];
            for(int j=i+1;j<nums.length;j++){
                gcd = gcd(gcd, nums[j]);
                if(gcd == 1){
                    len=Math.min(len,j-i);
                    break;
                }
            }
        }
        if(len==10000)return -1;
        return len+nums.length-1;
        
    }
    int gcd(int a, int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}