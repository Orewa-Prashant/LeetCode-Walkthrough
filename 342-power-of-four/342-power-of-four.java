class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1)return true;
        if(n%4==0&&n>1){
        boolean b=isPowerOfFour(n/4);
        return b;}
        return false;
    }
}