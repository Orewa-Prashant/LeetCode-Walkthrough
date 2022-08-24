class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1)return true;
        if(n==0)return false;
        if(n%3==0){
        boolean b=isPowerOfThree(n/3);
        return b;}
        return false;
    }
}