class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            char ch=tokens[i].charAt(0);
            if(tokens[i].length()==1&&(ch=='+'||ch=='-'||ch=='*'||ch=='/')){
                int a=st.pop();
                int b=st.pop();
                if(ch=='+')st.push(a+b);
                else if(ch=='-')st.push(b-a);
                else if(ch=='*')st.push(a*b);
                else st.push(b/a);
            }
            
            else st.push(Integer.parseInt(tokens[i]));
        }
        return st.pop();
    }
}