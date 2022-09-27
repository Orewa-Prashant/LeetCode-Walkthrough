class Solution {
    public String pushDominoes(String s) {
        StringBuilder sb=new StringBuilder(s);
        int left=-1;
        char prev=' ';
        int j=0;
        for(int i=0;i<=s.length();i++){
            if(i==s.length()){
                if(prev=='R'){
                    j=left+1;
                    while(j<i){
                        sb.setCharAt(j,prev);
                        j++;
                    }
                }
                continue;
            }
            char ch=s.charAt(i);
            if(ch=='L'){
                j=left+1;
                if(prev=='R'){
                    int dif=(i-left-1)/2;
                    j=left+1;
                    while(j<=left+dif){
                        sb.setCharAt(j,prev);
                        j++;
                    }
                    j=i-dif;
                    while(j<i){
                        sb.setCharAt(j,ch);
                        j++;
                    }
                }
                else{
                    j=left+1;
                    while(j<i){
                        sb.setCharAt(j++,ch);
                    }
                }
                left=i;
                prev=ch;
            }
            else if(ch=='R'){
                if(prev=='R'){
                    j=left+1;
                    while(j<i){
                        sb.setCharAt(j,prev);
                        j++;
                    }
                }
                left=i;
                prev=ch;
            }
        }
        return sb.toString();
    }
}