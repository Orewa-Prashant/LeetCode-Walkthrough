// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int Arr[] = new int[m];
            for (int i = 0; i < m; i++) Arr[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(Arr, m, n));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public long count(int S[], int m, int n) {
        long[][] dp=new long[m][n+1];
        for (long[] ar:dp)
        Arrays.fill(ar,-1);
        return fun(S,m-1,n,dp);
    }
    long fun(int s[], int ind, int n,long[][] dp){
        if(n==0)return 1;
        if(ind==0){
            if(n%s[0]==0)return 1;
            else return 0;
        }
        
        if(dp[ind][n]!=-1)return dp[ind][n];
        
        long take=0;
        if(s[ind]<=n)
        take=fun(s,ind,n-s[ind],dp);
        long not=fun(s,ind-1,n,dp);
        
        return dp[ind][n]=take+not;
    }
}