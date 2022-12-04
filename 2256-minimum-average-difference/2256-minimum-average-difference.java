class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n=nums.length;
        long[] arr=new long[n];
        int k=0;
        long sum=0;
        for(int i:nums){
            sum+=i;
            arr[k++]+=sum;
        }
        long min=Integer.MAX_VALUE;
        long len=0;int ans=-1;
        long dd=1;
        for(int i=0;i<n;i++){
            
            len=i+1;
            
            if(len==n){
                dd=arr[i]/len;
            }
            else{
            dd=Math.abs((arr[i]/len)-(arr[n-1]-arr[i])/(n-len));
            }
            if(dd<min){
                min=dd;
                ans=i;
            }
        }
        return ans;
    }
}