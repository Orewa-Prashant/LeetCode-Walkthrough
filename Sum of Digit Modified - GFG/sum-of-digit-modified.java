// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isMagic(N));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    int isMagic(int n) {
        if(n==1)return 1;
        if(n<10)return 0;
        int val=0;
        while(n>0){
            val+=n%10;
            n/=10;
        }
        return isMagic(val)==0?0:1;
    }
}