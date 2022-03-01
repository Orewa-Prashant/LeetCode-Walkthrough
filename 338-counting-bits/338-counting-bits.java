class Solution {
    public int[] countBits(int n) {
        if(n==0)return new int[]{0};
        int[] arr=new int[n+1];
        arr[0]=0;arr[1]=1;
        int l=1;
        for(int i=2;i<n+1;i++){
            if(i==2*l){
                arr[i]=1;
                l=i;
            }
            else{
                arr[i]=arr[l]+arr[i-l];
            }
        }
        return arr;
    }
}