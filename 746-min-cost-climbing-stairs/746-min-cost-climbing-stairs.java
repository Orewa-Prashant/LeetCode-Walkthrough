class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] t=new int[n+1];
        for(int i=0;i<n+1;i++)
            t[i]=-1;
        return play(cost,t,n);
    }
    
    private int play(int[] cost, int[] t, int n){
        if(n==1||n==0)return 0;
        if(t[n]!=-1)
            return t[n];
        else return t[n]=Math.min(cost[n-1]+play(cost,t,n-1),cost[n-2]+play(cost,t,n-2));
    }
}