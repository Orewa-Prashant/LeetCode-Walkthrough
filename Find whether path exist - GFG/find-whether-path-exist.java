// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] grid = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            boolean ans = obj.is_Possible(grid);
            if(ans)
                System.out.println("1");
            else 
                System.out.println("0");
        }
    }
}// } Driver Code Ends




class Solution
{
    //Function to find whether a path exists from the source to destination.
    public boolean is_Possible(int[][] grid){
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)
                return fun(grid,i,j);
            }
        }
        return false;
    }
    boolean fun(int[][] grid, int i, int j){
        if(i>=grid.length||j==grid[0].length||i<0||j<0||grid[i][j]==0)return false;
        if(grid[i][j]==2)
            return true;
        
        grid[i][j]=0;
        boolean a=fun(grid,i+1,j);
        boolean b=fun(grid,i,j+1);
        boolean c=fun(grid,i,j-1);
        boolean d=fun(grid,i-1,j);
        grid[i][j]=3;
        return a||b||c||d;
    }
}