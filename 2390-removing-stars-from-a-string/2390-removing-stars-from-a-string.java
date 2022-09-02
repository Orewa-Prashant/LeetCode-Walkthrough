class Solution {
    public String removeStars(String s) {
//         StringBuilder sb=new StringBuilder(s);
        
//         for(int i=0;i<s.length();i++){
            
//         }
        
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                if(st.size()>0)
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty())
            sb.append(st.pop());
        return sb.reverse().toString();
    }
}