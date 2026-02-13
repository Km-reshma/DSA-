class Solution {
    public int maxArea(int[] height) {
        int i = 0; //starting pointer
        int j = height.length -1; //ending poniter due to we need two pointers to find the maximum widhth b/w two pointers

        int maxArea = 0;
        int width = j - i;

        while(i<j){

            int min_height = Math.min(height[i], height[j]);
            width = j - i;
            maxArea = Math.max(maxArea, min_height * width);

            if(height[i]<height[j]){
                i++;

            }
            else{
                j--;
            }
        }

        return maxArea;
        
    }
}