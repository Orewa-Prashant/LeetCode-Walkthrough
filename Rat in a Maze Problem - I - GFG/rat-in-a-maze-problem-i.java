// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> ans=new ArrayList<>();
        fun(m,0,0,n,"",ans);
        return ans;
    }
    static void fun(int[][] m, int i, int j, int n, String asf, ArrayList<String> ans){
        if(i<0||j<0||i==n||j==n||m[i][j]==0)return;
        if(i==n-1&&j==n-1){
            ans.add(asf);
            return;
        }
        m[i][j]=0;
        fun(m,i+1,j,n,asf+'D',ans);
        fun(m,i,j-1,n,asf+'L',ans);
        fun(m,i,j+1,n,asf+'R',ans);
        fun(m,i-1,j,n,asf+'U',ans);
        m[i][j]=1;
    }
}