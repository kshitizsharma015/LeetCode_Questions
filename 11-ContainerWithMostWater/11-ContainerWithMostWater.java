// Last updated: 7/15/2026, 11:09:18 AM
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length-1;

        while(i<j){
            if(height[i]<height[j]){
                max=Math.max(max,(Math.min(height[i],height[j])*(j-i)));
                i++;
            }
            else if(height[i]>height[j]){
                max=Math.max(max,(Math.min(height[i],height[j])*(j-i)));
                j--;
            }
            else if(height[i]==height[j]){
                max=Math.max(max,(Math.min(height[i],height[j])*(j-i)));
                j--;
                i++;
                
            }
        }
        return max;
    }
}