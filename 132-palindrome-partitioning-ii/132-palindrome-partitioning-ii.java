class Solution {
    public int minCut(String s) {
        Integer[] dp=new Integer[s.length()+1];
        return fun(s,0,dp)-1;
    }
    int fun(String s, int ind, Integer[] dp){
        if(ind==s.length())return 0;
        if(dp[ind]!=null)return dp[ind];
        int ans=Integer.MAX_VALUE;
        for(int i=ind;i<s.length();i++){
            if(isPalindrome(s.substring(ind,i+1))){
                ans=Math.min(ans,1+fun(s,i+1,dp));
            }
        }
        return dp[ind]=ans;
    }
    boolean isPalindrome(String str){
        for(int i=0, j=str.length()-1;i<j;i++,j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}