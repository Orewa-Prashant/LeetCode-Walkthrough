class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int n=chalk.length;
        long[] pre=new long[n];
        pre[0]=chalk[0];
        for(int i=1;i<n;i++)
            pre[i]=chalk[i]+pre[i-1];
        k%=pre[n-1];
        if(k==0)return 0;
        int l=0,r=n-1;
        int ans=0;
        
        while(l<=r){
            int m=(l+r)/2;
            //System.out.println(m+" "+pre[m]);
            if(pre[m]<=k){
                ans=m+1;
                l=m+1;
            }
            else r=m-1;
        }
        return ans;
    }
}