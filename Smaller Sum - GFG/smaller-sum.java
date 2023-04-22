//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;

public class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            int n=Integer.parseInt(in.readLine());
            String s[]=in.readLine().trim().split(" ");
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(s[i]);
            }
            Solution ob=new Solution();
            long ans[]=ob.smallerSum(n,a);
            for(long i:ans){
                out.print(i+" ");
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public long[] smallerSum(int n,int arr[])
    {
        long[] ans = new long[n];
        int[] copy = Arrays.copyOf(arr,n);
        
        Arrays.sort(copy);
        long[] presum = new long[n+1];
        presum[0] = 0;
        Map<Integer,Long> map = new HashMap<>();
        for(int i=1;i<=n;i++){
            presum[i]=presum[i-1]+copy[i-1];
            if(!map.containsKey(copy[i-1])){
                map.put(copy[i-1], presum[i-1]);
            }
        }
        
        for(int i=0;i<n;i++){
            ans[i]=map.get(arr[i]);
        }
        
        return ans;
    }
}