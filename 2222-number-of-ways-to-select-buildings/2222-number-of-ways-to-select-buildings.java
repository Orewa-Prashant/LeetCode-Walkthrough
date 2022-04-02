class Solution {
    public long numberOfWays(String s) {
        // int n=s.length();
        // long[][][] dp=new long[n][3][4];
        // for(long[][] arr:dp)
        //     for(long[] ap:arr)
        //         Arrays.fill(ap,-1);
        // return fun(s,s.length()-1,2,3,dp);
        
        int n=s.length();
        long[][] curr=new long[3][4];
        long[][] prev=new long[3][4];
        for(int i=0;i<=2;i++){
            for(int j=0;j<4;j++){
                if(j==0)prev[i][j]=1;
                else
                prev[i][j]=0;
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=0;j<=2;j++){
                for(int k=0;k<=3;k++){
                    int nc=s.charAt(i-1)-'0';
                    if(k==0)
                        curr[j][k]=1;
                    else{
                        if(nc==j)curr[j][k]=prev[j][k];
                        else curr[j][k]=prev[nc][k-1]+prev[j][k];
                    }
                }
            }
            prev=curr;
        }
        return prev[2][3];
    }
    // long fun(String s, int i, int last, int times,long[][][] dp){
    //     if(times==0) return 1;
    //     if(i<0) return 0;
    //     if(dp[i][last][times]!=-1)return dp[i][last][times];
    //     int nc=s.charAt(i)-'0';
    //     if(nc==last)return dp[i][last][times]=fun(s,i-1,last,times,dp);
    //     return dp[i][last][times]=fun(s,i-1,nc,times-1,dp)+fun(s,i-1,last,times,dp);
    // }
}