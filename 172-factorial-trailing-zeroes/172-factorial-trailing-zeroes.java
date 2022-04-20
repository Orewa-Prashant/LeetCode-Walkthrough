class Solution {
    public int trailingZeroes(int n) {
        // Let's flex some Mathematic skills xd
        int zeros=0;
        while(n>0){
            zeros+=n/5;
            n=n/5;
        }
        return zeros;
    }
}