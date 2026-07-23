class Solution {
    public int singleNumber(int[] nums) {
        //brute force
        // for(int i=0;i<nums.length;i++){
        //     int count =0;
        // for(int j=0;j<nums.length;j++){
        //     if(nums[i]==nums[j]){
        //         count++;
        //     }
        // }
        // if (count==1){
        //     return nums[i];
        // }
        // }
        // return -1;
        //Better
        // HashMap<Integer,Integer>map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     int num=nums[i];
        // map.put(num,map.getOrDefault(num,0)+1);
        // }
        // for(int i=0;i<nums.length;i++){
        //     if(map.get(nums[i])==1){
        //         return nums[i];
        //     }
        // }
        // return -1;
        //optimized
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];

        }
        return ans;
    }
}