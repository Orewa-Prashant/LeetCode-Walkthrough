class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0)
            return;
        int b=0;
        int c=0;
        for(int i=0;i<m+n;i++){
            if(nums1[i]<=nums2[b]&&i!=m+c)
                continue;
            else {int j=m+c;
                while(j>i){
                    nums1[j]=nums1[j-1];
                    j--;
                }
                nums1[i]=nums2[b];
                  b++;
                  c++;
            }
            if(b==n)return;
        }
    }
}