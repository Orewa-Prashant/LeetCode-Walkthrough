class Solution {
    public int maxLength(List<String> arr) {
        boolean[] used=new boolean[26];
        return fun(arr,0,used);
    }
    int fun(List<String> s, int i, boolean[] used){
        if(i==s.size())return 0;
        String curr=s.get(i);
        boolean flag=false;
        boolean[] currUsed=used.clone();
        for(int j=0;j<curr.length();j++){
            int ch = curr.charAt(j)-'a';
            if(used[ch]){
                flag=true;
                break;
            }
            else
            used[ch]=true;
        }
        // System.out.println(Arrays.toString(used));
        // System.out.println(Arrays.toString(currUsed));
        if(!flag){
            int a = curr.length() + fun(s,i+1,used);
            int b = fun(s,i+1,currUsed);
            return Math.max(a,b);
        }
        else return fun(s,i+1,currUsed);
    }
}