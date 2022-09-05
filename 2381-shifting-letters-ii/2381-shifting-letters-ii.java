class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        StringBuilder sb=new StringBuilder(s);
        int[] arr=new int[s.length()];
        for(int [] i: shifts){
            if(i[2]==1){
                arr[i[0]]++;
                if(i[1]+1<s.length())arr[i[1]+1]--;
            }
            else{
                arr[i[0]]--;
                if(i[1]+1<s.length())arr[i[1]+1]++;
            }
        }
        
        int[] pre=new int[s.length()];
        pre[0]=arr[0];
        for(int i=1;i<s.length();i++){
            pre[i]=pre[i-1]+arr[i];
        }
        //for(int i=0;i<s.length();i++){
            //System.out.println(pre[18]);
        //}
        // System.out.println();
        // return "";
        for(int i=0;i<s.length();i++){
            if(pre[i]==0)continue;
            char ch=sb.charAt(i);
            int val=ch-96;
            int inc=pre[i]%26;
            // if(i==18)
            // System.out.println(inc);
            if(inc<0)inc+=26;
            // if(i==18)
            // System.out.println(inc+" "+val);
            val+=inc;
            val%=26;
            val=val==0?26:val;
            // if(i==18)
            // System.out.println(val);
            sb.setCharAt(i,(char)(96+val));
        }
        return sb.toString();
    }
}