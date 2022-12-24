//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int V = sc.nextInt();
            int E = sc.nextInt();

            List<List<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();

                adj.get(u).add(v);
            }

            Solution obj = new Solution();
            List<Integer> safeNodes = obj.eventualSafeNodes(V, adj);
            for (int i : safeNodes) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static Set<Integer> set;
    List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {
        set = new HashSet<>();
        // Your code here
        int n=adj.size();
        boolean[] visited = new boolean[n];
        boolean[] pathVisited = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,adj,visited, pathVisited);
            }
        }
        List<Integer> ans = new ArrayList<>(set);
        Collections.sort(ans);
        return ans;
    }
    boolean dfs(int node, List<List<Integer>> adj, boolean[] visited, boolean[] pathVisited){
        if(pathVisited[node])return false;
        pathVisited[node] = true;
        for(int next : adj.get(node)){
            if(set.contains(next))continue;
            if(!dfs(next, adj, visited, pathVisited))return false;            
        }
        set.add(node);
        pathVisited[node] = false;
        return true;
    }
}
