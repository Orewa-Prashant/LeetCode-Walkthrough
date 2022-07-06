class Solution {
    public int fib(int n) {
        if(n==0||n==1)return n;
        int[] t=new int[n+1];
        t[0]=0;t[1]=1;
        for(int i=2;i<n+1;i++)
            t[i]=t[i-1]+t[i-2];
        return t[n];
    }
}