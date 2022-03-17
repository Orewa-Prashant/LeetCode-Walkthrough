class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        
        // Do kind of Selection Sort
         int max=arr.length,i=0;
        
        while(max!=0){
        //Find the index of the maximum element
            for(i=0;arr[i]!=max;i++){}
            reverse(arr,i);
            ans.add(i+1);
            reverse(arr,max-1);
            ans.add(max);
            max--;
        }
        
        return ans;
    }
    void reverse(int[] arr, int lastInd){
        for(int i=0,j=lastInd;i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}