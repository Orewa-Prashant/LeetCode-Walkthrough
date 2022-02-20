class Solution {
    public long[] sumOfThree(long num) {
        if(num%3!=0)return new long[]{};
        long k=num/3;
        return new long[]{k-1,k,k+1};
    }
}