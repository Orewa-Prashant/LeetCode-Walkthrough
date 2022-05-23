class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        Boolean[][] dp=new Boolean[s1.length()+1][s2.length()+1];
        return fun(s1,s2,s3,0,0,dp);
    }
    boolean fun(String a, String b, String c, int i,int j,Boolean[][] dp){
        if(i+j==c.length()){
            if(i==a.length() && j==b.length())return true;
            return false;
        }
        if(i==a.length() && j==b.length())return false;
        
        if(dp[i][j]!=null)return dp[i][j];
        
        boolean is_a=true,is_b=true;
        if(i==a.length())is_a=false;
        if(j==b.length())is_b=false;
        
        if(is_a && is_b)
        if(a.charAt(i)==c.charAt(i+j) && b.charAt(j)==c.charAt(i+j)){
            return dp[i][j]=fun(a,b,c,i+1,j,dp)||fun(a,b,c,i,j+1,dp);
        }
        if(is_a)
        if(a.charAt(i)==c.charAt(i+j)){
            return dp[i][j]=fun(a,b,c,i+1,j,dp);

        }
        if(is_b)
        if(b.charAt(j)==c.charAt(i+j)){
            return dp[i][j]=fun(a,b,c,i,j+1,dp);
        }
        return dp[i][j]=false;
    }
}