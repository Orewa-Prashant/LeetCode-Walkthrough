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
            int len=j+1;
            int ct=0;
            while(j>=0){
                if(p.charAt(j--)=='*')ct++;
            }
            if(2*ct==len)return true;
            return false;
        }
        if(j<0)return false;
        
        if(dp[i][j]!=null)return dp[i][j];
        
        if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='.')
            return dp[i][j]=fun(s,p,i-1,j-1,dp);
        if(p.charAt(j)=='*'){
            boolean a=fun(s,p,i,j-2,dp);
            boolean b=false;
            if(p.charAt(j-1)=='.'||p.charAt(j-1)==s.charAt(i))
                b=fun(s,p,i-1,j,dp);
            return dp[i][j]=a||b;
        }
        return dp[i][j]=false;
    }
}