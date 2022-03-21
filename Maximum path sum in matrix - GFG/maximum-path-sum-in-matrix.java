// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int Matrix[][] = new int[N][N];
            for(int i = 0; i < N*N; i++)
                Matrix[(i/N)][i%N] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.maximumPath(N, Matrix));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maximumPath(int N, int Matrix[][])
    {
        int m=Matrix.length;
        int n=Matrix[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<n;i++){
            dp[0][i]=Matrix[0][i];
        }
        
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int val=Matrix[i][j];
                if(j==0){
                    dp[i][j]=val+Math.max(dp[i-1][j],dp[i-1][j+1]);
                }
                else if(j==n-1){
                    dp[i][j]=val+Math.max(dp[i-1][j],dp[i-1][j-1]);
                }
                else dp[i][j]=val+Math.max(Math.max(dp[i-1][j],dp[i-1][j+1]),dp[i-1][j-1]);
            }
        }
        
        int min=-1;
        for(int i=0;i<n;i++){
            min=Math.max(min,dp[n-1][i]);
        }
        return min;
        
    }
}