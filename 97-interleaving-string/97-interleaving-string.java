class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        HashMap<String,Boolean> cache=new HashMap<>();
        
        return fun(s1,s2,s3,0,0,0,cache);
    }
    boolean fun(String a, String b, String c, int i,int j, int ct, HashMap<String,Boolean> cache){
        if(i+j==c.length()){
            if(i==a.length() && j==b.length())return true;
            return false;
        }
        if(i==a.length() && j==b.length())return false;
        String inp=i+" "+j+" "+ct;
        if(cache.containsKey(inp))return cache.get(inp);
        boolean is_a=true,is_b=true;
        if(i==a.length())is_a=false;
        if(j==b.length())is_b=false;
        boolean ans=false;
        
        if(is_a && is_b)
        if(a.charAt(i)==c.charAt(i+j) && b.charAt(j)==c.charAt(i+j)){
            ans=fun(a,b,c,i+1,j,ct+1,cache)||fun(a,b,c,i,j+1,ct-1,cache);
            cache.put(inp,ans);
            return ans;
        }
        if(is_a)
        if(a.charAt(i)==c.charAt(i+j)){
            ans= fun(a,b,c,i+1,j,ct+1,cache);
            cache.put(inp,ans);
            return ans;
        }
        if(is_b)
        if(b.charAt(j)==c.charAt(i+j)){
            ans= fun(a,b,c,i,j+1,ct-1,cache);
            cache.put(inp,ans);
            return ans;
        }
        cache.put(inp,ans);
        return ans;
    }
}