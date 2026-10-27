class Solution {
    public int maxArea(int[] height) {
        int n = height.length;

        int left = 0;
        int right = n - 1;
        int maxArea = 0;
        while(left < right){
            int h = Math.min(height[left],height[right]);
            int b = right - left;

            maxArea = Math.max(maxArea, h * b);

            while(h >= height[right] && left < right){
                right--;
            } 
            while(h >= height[left] && left < right){
                left++;
            }
        }

        return maxArea;
    }
}