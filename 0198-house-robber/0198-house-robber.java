class Solution {
    public int rob(int[] nums) {
        int [] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return find(nums,0,dp);
    }
    int find(int []nums,int index,int [] dp){
        if(index>=nums.length) return 0;
        if(dp[index]!=-1) return dp[index];

        int n1=nums[index]+find(nums,index+2,dp);
        int n2=find(nums,index+1,dp);
         return dp[index]=Math.max(n1,n2);

    }
}