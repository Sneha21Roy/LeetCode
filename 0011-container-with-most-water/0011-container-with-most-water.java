class Solution {
    public int maxArea(int[] height) {
        int maxArea=0;
        int leftPointer=0;
        int rightPointer=height.length-1;
        while(leftPointer<rightPointer){
            int length=Math.min(height[leftPointer],height[rightPointer]);
            int width=rightPointer-leftPointer;
            int currArea=length*width;
            maxArea=Math.max(maxArea,currArea);
            if(height[leftPointer]<height[rightPointer]){
                leftPointer++;
            }
            else{
                rightPointer--;
            }
           
        }
         return maxArea;
    }
}