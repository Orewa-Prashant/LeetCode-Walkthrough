class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor==1)return dividend;
        if(dividend==0)return 0;
        int c=0;
        if(dividend<0&&divisor<0){if(dividend==Integer.MIN_VALUE&&divisor==-1)return Integer.MAX_VALUE;
            for(int i=dividend;i<=divisor;i=i-divisor)
            c++;
            
            return c;
        }
        else if(dividend<0&&divisor>0){
            divisor=-divisor;
            for(int i=dividend;i<=divisor;i=i-divisor)
            c++;
            return -c;
        }
        else if(divisor<0&&dividend>0){
            dividend=-dividend;
            for(int i=dividend;i<=divisor;i=i-divisor)
            c++;
            return -c;
        }
        else
        for(int i=dividend;i>=divisor;i=i-divisor)
            c++;
        return c;
    }
}