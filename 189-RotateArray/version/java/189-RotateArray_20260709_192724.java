// Last updated: 7/9/2026, 7:27:24 PM
/*
 * Simplify the rotations: Use k = k % nums.length to strip away redundant "full-circle" rotations, leaving only the actual number of shifts needed.
 * 
 * Reverse the whole array: This instantly takes the elements that were at the back of the array and moves them to the front, but they will be backward.
 * 
 * Reverse the first k elements: This flips that newly moved front section back into its original, correct order.
 * 
 * Reverse the rest of the array: Flipping the remaining elements (from index k to the end) fixes their order as well, perfectly completing the in-place rotation!
*/

1class Solution {
2    public void rotate(int[] nums, int k) {
3            k = k % nums.length;
4            reverse(nums,0,nums.length-1);
5            reverse(nums,0,k-1);
6            reverse(nums,k,nums.length-1);
7
8    }
9    public void reverse(int[] nums,int start,int end){
10        while(start<=end){
11            int temp = nums[start];
12            nums[start] = nums[end];
13            nums[end] = temp;
14            start++;
15            end--;
16        }
17    }
18}