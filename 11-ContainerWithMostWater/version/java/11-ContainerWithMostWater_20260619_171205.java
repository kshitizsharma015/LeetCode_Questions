// Last updated: 6/19/2026, 5:12:05 PM
// run the pointer from behinfd to run this code
1class Solution {
2    public int maxArea(int[] height) {
3        int max = 0;
4        int i = 0;
5        int j = height.length-1;
6
7        while(i<j){
8            if(height[i]<height[j]){
9                max=Math.max(max,(Math.min(height[i],height[j])*(j-i)));
10                i++;
11            }
12            else if(height[i]>height[j]){
13                max=Math.max(max,(Math.min(height[i],height[j])*(j-i)));
14                j--;
15            }
16            else if(height[i]==height[j]){
17                max=Math.max(max,(Math.min(height[i],height[j])*(j-i)));
18                j--;
19                i++;
20                
21            }
22        }
23        return max;
24    }
25}