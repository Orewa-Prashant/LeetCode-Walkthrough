class Solution {
    public boolean judgeSquareSum(int c) {
        for(long i=0;i*i<=c;i++){
            long find=c-i*i;
            long l=0,r=find;
            while(l<=r){
                long m=l+(r-l)/2;
                if(m*m==find)return true;
                else if(m*m>find)r=m-1;
                else l=m+1;
            }
        }
        return false;
    }
}