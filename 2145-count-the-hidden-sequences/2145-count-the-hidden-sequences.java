class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long min=Long.MAX_VALUE,max=Long.MIN_VALUE;
        long sum=0;
        for(int i:differences){
            sum+=i;
            min=Math.min(min,sum);
            max=Math.max(max,sum);
        }
        int a=upper;
        if(max>=0)
        a=(int)(upper-max);
        int b=lower;
        if(min<=0)
            b=(int)(lower-min);
        if(a<b)return 0;
        return a-b+1;
    }
}