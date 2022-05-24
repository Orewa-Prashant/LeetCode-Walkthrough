class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        long[] pre=new long[n+1];
        pre[0]=0;
        for(int i=1;i<=n;i++){
            pre[i]=nums[i-1]+pre[i-1];
        }
        // for(int i=0;i<=n;i++)
        // System.out.print(pre[i]+" ");
        int min=1000000;
        for(int i=0;i<=n;i++){
            long lsum=pre[i];
            long rsum=lsum+target;
            int l=i,r=n;
            int ind=-1;
            while(l<=r){
                
                int m=l+(r-l)/2;
                //System.out.println(m+" "+pre[m]);
                if(pre[m]>=rsum){
                    ind=m;
                    r=m-1;
                }
                else l=m+1;
            }
            //System.out.println(i+" "+ind);
            if(ind!=-1)
            min=Math.min(min,ind-i);
        }
        return min==1000000?0:min;
    }
}