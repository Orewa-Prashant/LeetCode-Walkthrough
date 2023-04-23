class Solution {
    int mod = 1000000007;
    public int numberOfArrays(String s, int k) {
        return fun(s,0,k+"", new Integer[s.length()]);
    }
    int fun(String s, int i, String k,Integer[] dp){
        if(i == s.length())return 1;
        if(s.charAt(i)=='0')return 0;
        if(dp[i]!=null)return dp[i];
        int ans=0;
        for(int j=i;j<s.length() && j-i<k.length();j++){
            if(j-i<k.length()-1 || k.compareTo(s.substring(i,j+1))>=0){
                ans=(ans+fun(s,j+1,k,dp))%mod;
            }
            else break;
        }
        return dp[i]=ans;
    }
}