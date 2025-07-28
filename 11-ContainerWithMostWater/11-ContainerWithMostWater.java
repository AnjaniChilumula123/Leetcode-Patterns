// Last updated: 7/28/2025, 12:33:23 PM
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0 , right = n-1;
        int maxArea = 0 ;
        int area = 0;
        while(left<right){
           
            area = Math.min(height[left],height[right])*(right-left);
            if(height[right]<height[left]) right--;
            else left++;

            maxArea = Math.max(maxArea , area);
        } 
        return maxArea;
    }
}