class Solution {
    public boolean isPalindrome(long x) {
        if(x<0)return false;
        long y=x;
        long i=1;
        long z=0;
        while(x%i!=x){
            i*=10;
            z++;
        }
        z=z/2;
        while(z!=0){
            i=i/10;
            if(x/i!=y%10)
                return false;
            x=x%i;
            y=y/10;
            z--;
        }
        return true;
        
    }
}