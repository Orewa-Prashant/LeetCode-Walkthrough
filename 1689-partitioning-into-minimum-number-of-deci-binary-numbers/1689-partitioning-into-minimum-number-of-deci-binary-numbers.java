class Solution {
    public int minPartitions(String n) {
        int min=0;
        for(int i=0;i<n.length();i++){ 
            min=Math.max(min,n.charAt(i)-'0');
            if(min==9)return min;   // We just have to find the greatest value in the String 
        }                           // and that would be our answer
        return min;
    }
}

/* If still having problem... consider going through this
https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/discuss/1039096/Detailed-Easiest-Explanation-of-Solution
*/