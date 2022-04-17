class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        int[] hash=new int[n];
        int maxInd=-1,max=0;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            dp[i]=1;
            hash[i]=i;
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0 && dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                    hash[i]=j;
                }
            }
            if(max<dp[i]){
                max=dp[i];
                maxInd=i;
            }
        }
        List<Integer> ans=new ArrayList<Integer>();
        
        for(int i=maxInd;i>=0;){
            ans.add(nums[i]);
            if(ans.size()==max)break;
            i=hash[i];
            
        }
        return ans;
    }
    
}