class Solution {
    public boolean isMatch(String s, String p) {
        int m=s.length();
        int n=p.length();
        Boolean[][] dp=new Boolean[m][n];
        return fun(s,p,m-1,n-1,dp);
    }
    boolean fun(String s, String p, int i, int j, Boolean[][] dp){
        if(i<0&&j<0)return true;
        if(i<0){
            for(int k=j;k>=0;k--)
                if(p.charAt(k)!='*')return false;
            return true;
        }
        if(j<0)return false;
        
        if(dp[i][j]!=null)return dp[i][j];
        
        if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='?'){
            return dp[i][j]=fun(s,p,i-1,j-1,dp);
        }
        if(p.charAt(j)=='*'){
            return dp[i][j]=fun(s,p,i,j-1,dp)||fun(s,p,i-1,j,dp);
        }
        return dp[i][j]=false;
    }
}