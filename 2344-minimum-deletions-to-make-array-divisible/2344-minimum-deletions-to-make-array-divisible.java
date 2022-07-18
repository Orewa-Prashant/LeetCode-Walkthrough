class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        int HCF=numsDivide[0];
        for(int i=1;i<numsDivide.length;i++){
            HCF=gcd(HCF,numsDivide[i]);
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(HCF%nums[i]==0){
                return i;
            }
        }
        return -1;
    }
    int gcd(int a, int b){
        if (a == 0)
        return b;
        return gcd(b % a, a);
    }
}