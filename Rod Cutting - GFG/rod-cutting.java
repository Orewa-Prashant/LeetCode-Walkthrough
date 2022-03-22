// { Driver Code Starts


import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.cutRod(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution{
    public int cutRod(int price[], int n) {
        int[][] dp=new int[n][n+1];
        
        // Base case
        for(int i=0;i<=n;i++){
            dp[0][i]=price[0]*i;
        }
        
        for(int i=1;i<n;i++){
            for(int j=0;j<=n;j++){
                int take=0;
                if(j>=i+1){
                    take=price[i]+dp[i][j-i-1];
                }
                int not=dp[i-1][j];
                
                dp[i][j]=Math.max(not,take);
            }
        }
        
        return dp[n-1][n];
    }
}