class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> h=new HashSet<>();
        for(int i=k;i<=s.length();i++){
            h.add(s.substring(i-k,i));
        }
        System.out.println(h);
        return h.size()==(1<<k)?true:false;
    }
}