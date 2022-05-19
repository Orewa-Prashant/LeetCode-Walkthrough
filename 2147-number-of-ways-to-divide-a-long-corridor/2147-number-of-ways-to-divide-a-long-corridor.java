class Solution {
    int M=1000000007;
    public int numberOfWays(String corridor) {
        Integer[][] dp=new Integer[corridor.length()+1][3];
        return fun(corridor,0,0,dp);
        // int[] dp=new int[corridor.length()+1];
        // dp[corridor.length()]=1;
        // for(int i=corridor.length()-1;i>=0;i--){
        //     int c=0;
        //     int ans=0;
        //     for(int id=i;id<corridor.length();id++){
        //         c+=corridor.charAt(id)=='S'?1:0;
        //         if(c==2){
        //             ans=ans%M;
        //             ans+=dp[id+1];
        //         }
        //         else if(c>2)break;
        //     }
        //     ans=ans%M;
        //     dp[i]=ans;
        // }
        // return dp[0];
    }
    int fun(String s, int i, int k, Integer[][] dp){
        if(i==s.length()){
            return k==2?1:0;
        }
        if(dp[i][k]!=null)return dp[i][k];
        if(k==2){
            if(s.charAt(i)=='S'){
                return dp[i][k]=fun(s,i+1,1,dp)%M;
            }
            else{
                return dp[i][k]=(fun(s,i+1,k,dp)%M+fun(s,i+1,0,dp)%M)%M;
            }
        }
        else return dp[i][k]=fun(s,i+1,k+(s.charAt(i)=='S'?1:0),dp)%M;
    }
}