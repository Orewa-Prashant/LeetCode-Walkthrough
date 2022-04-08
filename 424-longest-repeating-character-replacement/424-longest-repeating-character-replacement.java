class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> h=new HashMap<>();
        int maxFreq=0,ans=0,j=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            h.put(ch,h.getOrDefault(ch,0)+1);
            maxFreq=Math.max(maxFreq,h.get(ch));

            while(i-j+1-maxFreq>k){
                h.put(s.charAt(j),h.get(s.charAt(j))-1);
                j++;
            }
            int len=i-j+1;
            ans=Math.max(ans,len);
        }
        return ans;
    }
}