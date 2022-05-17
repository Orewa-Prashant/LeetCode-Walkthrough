class Solution {
    boolean fun(String s, String p, Set<Integer> h){
        if(p.length()==0)return true;
        int j=0;
        //System.out.println(h);
        for(int i=0;i<s.length();i++){
            if(h.contains(i))continue;
            if(s.charAt(i)==p.charAt(j))
                j++;
            if(j==p.length())return true;
        }
        return false;
    }
    
    public int maximumRemovals(String s, String p, int[] removable) {
        int l=0,r=removable.length;
        int ans=0;
        
        while(l<=r){
            int m=l+(r-l)/2;
            Set<Integer> h=new HashSet<>();
            for(int i=0;i<m;i++)
                h.add(removable[i]);
            if(fun(s,p,h)){
                ans=Math.max(h.size(),ans);
                l=m+1;
            }
            else r=m-1;
        }
        return ans;
    }
    
}