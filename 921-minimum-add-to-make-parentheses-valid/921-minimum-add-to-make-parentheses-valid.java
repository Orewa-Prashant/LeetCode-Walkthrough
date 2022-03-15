class Solution {
    public int minAddToMakeValid(String s) {
        int left=0,right=0;  // variables to store the count of the left and right brackets
        int res=0;   // var to store our final result
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(')left++;   // Increase left
            else right++;   // Increase right
            // Now if at any point the no. of right brackets exceed the left brackets
            // that means these are the unbalanced brackets and needs a left bracket before them.
            // Hence increase our result i.e, res++
            if(right>left){
                res++;
                right--;   // and decreament the right by 1 because this right bracket has been
                           //taken care of by increamenting our res.
            }
               
        }
        // Add the differnce of left and right brackets because some left brackets also
        //require ther right brackets
        return res+left-right;
    }
}