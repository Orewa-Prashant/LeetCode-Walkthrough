class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boat=0;
        for(int i=people.length-1,j=0;i>=j;){
            if(people[i]+people[j]<=limit){
                boat++;
                i--;j++;
            }
            else{
                boat++;
                i--;
            }
        }
        return boat;
    }
}