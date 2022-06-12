class Solution {
    int res=Integer.MAX_VALUE;
    public int distributeCookies(int[] cook, int k) {
        int[] ans=new int[k];
        fun(cook,0,ans);
        return res;
    }
    void fun(int[] arr, int id, int[] ans){
        if(id==arr.length){
            int min=0;
            for(int i=0;i<ans.length;i++){
                min=Math.max(min,ans[i]);
            }
            res=Math.min(res,min);
            return;
        }
        for(int i=0;i<ans.length;i++){
            ans[i]+=arr[id];
            fun(arr,id+1,ans);
            ans[i]-=arr[id];
        }
    }
}