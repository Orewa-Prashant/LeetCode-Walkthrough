class Solution {
    public boolean hasValidPath(char[][] grid) {
        HashMap<String,Boolean> h=new HashMap<>();
        return fun(grid,0,0,0,h);
    }
    boolean fun(char[][] grid, int i, int j, int b, HashMap<String,Boolean> h){
        if(b<0||i==grid.length||j==grid[0].length)return false;
        if(i==grid.length-1 && j==grid[0].length-1){
            b=grid[i][j]=='('?b+1:b-1;
            if(b==0)return true;
            return false;
        }
        String s=i+","+j+"="+b;
        if(h.containsKey(s))return h.get(s);
        //System.out.println(i+","+j+"="+b);
        boolean ans=fun(grid,i+1,j,grid[i][j]=='('?b+1:b-1,h)||fun(grid,i,j+1,grid[i][j]=='('?b+1:b-1,h);
        h.put(s,ans);
        return ans;
    }
}