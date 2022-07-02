class Solution {
    public int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }
//         int low=0,high=nums.length-1;
//         return fun(nums, low, high);
//     }
//     int[] merge(int[] a, int [] b){
//         int[] arr=new int[a.length+b.length];
//         int i=0,j=0;
//         for(;i<a.length || j<b.length;){
//             if(i==a.length){
//                 arr[i+j]=b[j++];
//                 continue;
//             }
//             else if(j==b.length){
//                 arr[i+j]=a[i++];
//                 continue;
//             }
//             arr[i+j]=a[i]<=b[j]?a[i++]:b[j++];
//         }
//         return arr;
//     }
    
//     int[] fun(int[] nums, int low, int high){
//         if(low==high)return new int[]{nums[low]};
//         int mid=(low+high)/2;
//         int[] a=fun(nums, low, mid);
//         int[] b=fun(nums, mid+1,high);
//         return merge(a,b);
//     }
}