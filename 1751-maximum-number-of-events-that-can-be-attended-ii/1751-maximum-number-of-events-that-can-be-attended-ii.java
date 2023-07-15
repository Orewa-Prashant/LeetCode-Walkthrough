class Solution {
    public int maxValue(int[][] events, int k) {
        Arrays.sort(events, (a,b) -> a[0]-b[0]);
        return fun(events, 0, k, new Integer[events.length][k+1]);
    }
    int fun(int[][] e, int i, int k, Integer[][] dp){
        if(k==0 || i==e.length) return 0;
        if(dp[i][k]!=null) return dp[i][k];
        
        int ans = 0;
        for(int j=i;j<e.length;j++){
            int ind = findValidIndex(e, e[j][1]+1);
            // System.out.println(ind);
            ans = Math.max(ans, e[j][2] + fun(e, ind, k-1, dp));
        }
        return dp[i][k] = ans;        
    }
    
    int findValidIndex(int[][] e, int val){
        int l=0,r=e.length-1;
        int ind = e.length;
        while(l<=r){
            int m = l+(r-l)/2;
            if(e[m][0]<val)l=m+1;
            else{
                ind = Math.min(ind,m);
                r=m-1;
            }
        }
        return ind;
    }
    
}