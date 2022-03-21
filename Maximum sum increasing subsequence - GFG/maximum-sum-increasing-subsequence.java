// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSumIS(Arr,n));
                }
        }
}    // } Driver Code Ends


//User function Template for Java

class Solution
{
	public int maxSumIS(int arr[], int n)  {  
	    int[] maxis=new int[n];
	    maxis[0]=arr[0];
	    for(int i=1;i<n;i++)
	    { maxis[i]=arr[i];
	        for(int j=0;j<i;j++)
	        {
	            if(arr[j]<arr[i])
	            maxis[i]=Math.max(maxis[i],maxis[j]+arr[i]);
	        }
	    }
	    int res=maxis[0];
	    for(int i=1;i<n;i++)
	    {
	        res=Math.max(res,maxis[i]);
	    }
	    
	    return res;
	}  
	int msis(int ind,int[] arr, int prev,int[][] dp){
	   if(ind<0){
            return 0;  // Both base cases are correct
        }
        
        if(dp[ind][prev]!=0)return dp[ind][prev];
        
        int take=-1000000;
        if(prev==100001||(prev!=100001 && arr[ind]<prev))
            take=arr[ind] + msis(ind-1,arr,arr[ind],dp);
        int not=msis(ind-1,arr,prev,dp);
        
        return dp[ind][prev]=Math.max(take,not);

	}
}