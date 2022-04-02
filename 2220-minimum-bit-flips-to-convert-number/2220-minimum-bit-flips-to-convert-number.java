class Solution {
    public int minBitFlips(int start, int goal) {
        String s="",t="";
        while(start!=0||goal!=0){
            if(start!=0){
                s=start%2+s;
                start/=2;
            }
            else{
                s='0'+s;
            }
            if(goal!=0){
                t=goal%2+t;
                goal/=2;
            }
            else{
                t='0'+t;
            }
            
        }
      
        int ans=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=t.charAt(i))
                ans++;
            
        }
        return ans;
    }
}