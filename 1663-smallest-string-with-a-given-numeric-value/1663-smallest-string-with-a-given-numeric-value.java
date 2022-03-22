class Solution {
    public String getSmallestString(int n, int k) {
        char res[] = new char[n];
        Arrays.fill(res, 'a');
        k-=n;
        for(int i=n;i>0;i--){
            int del=Math.min(25,k);
            res[i-1]+=del;
            k-=del;
        }
        return String.valueOf(res);
    }
}