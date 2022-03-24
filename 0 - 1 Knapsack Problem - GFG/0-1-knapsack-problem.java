// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}



// } Driver Code Ends


class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         int[][] dp=new int[W+1][n];
         for(int[] ar:dp){
             Arrays.fill(ar,-1);
         }
         
         return fun(W, wt, val, n-1, dp);
    } 
    
    static int fun(int W, int wt[], int val[], int ind, int[][] dp){
        if(ind<0)
        return 0;
        
        if(dp[W][ind]!=-1)return dp[W][ind];
        
        int take=-100000;
        if(W>=wt[ind])
        take=val[ind]+fun(W-wt[ind],wt,val,ind-1,dp);
        int not=fun(W,wt,val,ind-1,dp);
        
        return dp[W][ind]=Math.max(take,not);
    }
}


