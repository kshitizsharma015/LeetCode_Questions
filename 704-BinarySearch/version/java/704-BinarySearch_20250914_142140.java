// Last updated: 9/14/2025, 2:21:40 PM
/*
 * When start and end cross (start > end), it means the target is not in the array.
 * 
 * The correct place to insert the target is at index start.
 * 
 * end is just one position before start, so returning end would be wrong.
 * 
 * This is why in binary search for insert position, the base case always returns start.
*/

class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        return binarySearch(nums,target,start,end);
    }
    public int binarySearch(int[] nums,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(nums[mid] == target){
            return mid;
        }
        if(target < nums[mid]){
            return binarySearch(nums,target,start,mid-1);
        }
         if(target > nums[mid]){
            return binarySearch(nums,target,mid+1,end);
        }
        return binarySearch(nums,target,start,end);
    }
}