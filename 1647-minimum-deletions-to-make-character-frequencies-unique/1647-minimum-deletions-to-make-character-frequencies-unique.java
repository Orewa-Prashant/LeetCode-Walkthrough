class Solution {
    public int minDeletions(String s) {
        int[] arr=new int[26];
        int val=0;
        for(int i=0;i<s.length();i++){
            val=s.charAt(i)-'a';
            arr[val]++;
        }
        Arrays.sort(arr);
        int res=arr[arr.length-1];
        int prev=res;
        int ct=1;
        int last=res;
        //System.out.println(Arrays.toString(arr));
        for(int i=arr.length-2;i>=0 && arr[i]!=0;i--){
            if(last==1)break;
            if(arr[i]>=last){
                res+=--last;
            }
            else{
                res+=arr[i];
                last=arr[i];
            }
            //System.out.println(res);
        }
        //System.out.println(s.length());
        return s.length()-res;
    }
}