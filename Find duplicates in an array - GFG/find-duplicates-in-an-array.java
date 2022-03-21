// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        Set<Integer> ans=new HashSet<>();
        Set<Integer> haha=new HashSet<>();
        for(int i:arr){
            if(haha.contains(i))
            ans.add(i);
            haha.add(i);
        }
        if(ans.size()==0)
        ans.add(-1);
        //Collections.sort(ans);
        ArrayList<Integer> hap=new ArrayList<Integer>(ans);
        Collections.sort(hap);
        return hap;
    }
}
