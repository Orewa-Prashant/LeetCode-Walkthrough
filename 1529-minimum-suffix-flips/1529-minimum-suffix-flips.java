class Solution {
    public int minFlips(String target) {
        char status='0';
        int count=0;
        for(int i=0;i<target.length();i++){
            if(status!=target.charAt(i)){
                count++;
                if(status=='0')
                status='1';
                else status='0';
            }
        }
        return count;
    }
}