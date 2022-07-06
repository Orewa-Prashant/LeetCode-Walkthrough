class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int eq=0;
        int less=0;
        for(int i:nums){
            if(i<pivot)less++;
            else if(i==pivot)eq++;
        }
        int[] res=new int[n];
        int k=0;
        int more=less+eq;
        int equal=less;
        for(int i:nums){
            if(i<pivot)res[k++]=i;
            else if(i==pivot)res[equal++]=i;
            else res[more++]=i;
        }
        return res;
    }
}