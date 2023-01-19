/*
    A breif explaination before going into the solution:-
    
    1. We would be calculating the prefix sum of the given array, and will be checking for the 
    remainder given when divided by k at every index.
    
    2. Because the logic here is that if a prefix sum gave you a remainder let's say x,and when
    you encounter the same remainder again in the array while traversing.. that means the 
    subarray between these redundant remainders was giving you the subarray sum which was 
    divisible by k.
    
    For eg:- arr[] = {1,4,3,7}, k = 5;
    Now the prefix sum happens to be 1,5,8,15 and the rems happpen to be 1,0,3,0
    So you see that o came twice int the array that means the subarray {3,7} was having a sum 
    divisible by k i.e, 5.

    3. Now Just store the values as required in the HashMap and add the frequencies of seen 
    remainders with the help of a Map.
*/


class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        h.put(0,1);
        int sum=0,ans=0,rem=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];    // store the prefix sum with the help of sum variable.
            rem=sum%k;       // check if the remainder is already present in the Map or not.
            
            if(rem<0)rem+=k; // if the k=5 and rem comes out to be -2, then that rem can be 
                             // treated as the same as -2 + 5 i.e, 3
            
            if(h.containsKey(rem))  // the frquency of the remainder prersent in the Map gives 
                ans+=h.get(rem);    // you the number of subarrays whose sum id divisible by k
                                    
            if(h.containsKey(rem))   // store the remainders you encounter while traversing in a 
                h.put(rem,h.get(rem)+1);  // Map with their frequencies.
            else h.put(rem,1);
        }
        return ans;
    }
}