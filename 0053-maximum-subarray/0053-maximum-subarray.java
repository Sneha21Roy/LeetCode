class Solution {
    public int maxSubArray(int[] nums) {
        int CurrentSum=0;
        int MaxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            CurrentSum += nums[i];
            MaxSum=Math.max(MaxSum,CurrentSum);
            if(CurrentSum<0){
                CurrentSum=0;
            }
            
        }
        return MaxSum;
    }
}