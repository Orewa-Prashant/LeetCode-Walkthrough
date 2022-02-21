/*
    A quick explaination:-
    
    1. We are just converting the given array into a Set or HashSet. By doing so, we will be able to reduce the time complexity by its constant look-ups.
    
    2. We just have to find a number in the Set that has no previous value i.e, if we are at a value 3 then the Set mustn't contain 2. This way you will be able to start keeping track of your longest streak from ehere you have to and will be able to reduce unnecesarry look-ups.
    
    3. Whenever you encounter the next value in the set you have to increase the streak by 1 and have to chnage the number into the one you found i.e, currentNum+1.
    
    4. Last, Update your longestStreak whenevr you break out of while loop.
    
*/



class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;
        
        for(int num:nums){
            if(!set.contains(num-1)){
                int currentStreak = 1;
                int currentNum = num;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak,currentStreak);
            }
        }
        
        return longestStreak;
    }
}