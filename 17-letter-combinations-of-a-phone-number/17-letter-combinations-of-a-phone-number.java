class Solution {
    private String mapped(char a){
        if(a=='2')return "abc";
        else if(a=='3')return "def";
        else if(a=='4')return "ghi";
        else if(a=='5')return "jkl";
        else if(a=='6')return "mno";
        else if(a=='7')return "pqrs";
        else if(a=='8')return "tuv";
        else return "wxyz";
        
    }

    public List<String> letterCombinations(String digits) {
        List<String> l= new ArrayList<String>();
        if(digits.equals(""))return l;
        play(l,digits,"");
        return l;
    }
    private void play(List<String> l,String digits, String out){
        if(digits.equals("")){
            l.add(out);
            return;
        }
        char c0th=digits.charAt(0);
        
        String map=mapped(c0th);
        for(int i=0;i<map.length();i++){
            play(l,digits.substring(1),out+map.charAt(i));
        }
    }
}