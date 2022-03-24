// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        int[][] dp=new int[sum+1][N];
        
        for(int i=0;i<N;i++){
            dp[0][i]=1;
        }                           // Base case
        dp[arr[0]][0]=1;
        
        for(int i=1;i<=sum;i++){
            for(int j=1;j<N;j++){
                if(i<arr[j])dp[i][j]=dp[i][j-1];
                else if(dp[i][j-1]==1||dp[i-arr[j]][j-1]==1)
                dp[i][j]=1;
                else dp[i][j]=0;
            }
        }
        return dp[sum][N-1]==1?true:false;
    }
}