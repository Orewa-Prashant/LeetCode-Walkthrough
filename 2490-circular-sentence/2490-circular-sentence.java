class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] ss = sentence.split(" ");
        // if(ss.length==1)return false;
        char prev = ss[0].charAt(ss[0].length()-1);
        char first = ss[0].charAt(0);
        for(int i=1;i<ss.length;i++){
            char ch = ss[i].charAt(0);
            if(prev!=ch)return false;
            prev=ss[i].charAt(ss[i].length()-1);
        }
        
        return first == prev ? true : false;
    }
}