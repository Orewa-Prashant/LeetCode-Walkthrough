class Solution {
    public int minSideJumps(int[] obstacles) {
        int[][] dp=new int[obstacles.length][4];
        for(int[] ap:dp)
            Arrays.fill(ap,-1);
        return fun(0,2,obstacles,dp);
    }
    int fun(int i, int lane, int[] obs, int[][] dp){
        if(i==obs.length-1)return 0;
        if(dp[i][lane]!=-1)return dp[i][lane];
        int min=100000000;
        if(obs[i+1]==lane){
            if(lane==3){
                if(obs[i]!=1)
                min=Math.min(min,fun(i+1,1,obs,dp));
                if(obs[i]!=2)
                min=Math.min(min,fun(i+1,2,obs,dp));
            }
            else if(lane==2){
                if(obs[i]!=1)
                min=Math.min(min,fun(i+1,1,obs,dp));
                if(obs[i]!=3)
                min=Math.min(min,fun(i+1,3,obs,dp));
            }
            else{
                if(obs[i]!=2)
                min=Math.min(min,fun(i+1,2,obs,dp));
                if(obs[i]!=3)
                min=Math.min(min,fun(i+1,3,obs,dp));
            }
        }
        return dp[i][lane]=min==100000000?fun(i+1,lane,obs,dp):1+min;
        
    }
}