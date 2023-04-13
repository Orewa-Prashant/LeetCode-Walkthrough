class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<>();
        int i=0,j=0;
        for(i=0;i<popped.length;i++){
            if(st.empty() || popped[i]!=st.peek()){
                while(j<pushed.length && pushed[j]!=popped[i]){
                    st.push(pushed[j]);
                    j++;
                }
                if(j==pushed.length)return false;
                j++;
                
            }
            else{
                st.pop();
            }
        }
        return true;
    }
}