// Last updated: 7/14/2026, 7:13:14 PM
// use max function to get max count and count variable to count no of 1s in one go if any thing else comes make count = 0;
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int max = 0;
4        int count = 0;
5        for(int i = 0;i<nums.length;i++){
6            if(nums[i]==1){
7                count++;
8                max = Math.max(max,count);
9            }
10            else{
11                count = 0;
12            }
13        }
14        return max;
15    }
16}