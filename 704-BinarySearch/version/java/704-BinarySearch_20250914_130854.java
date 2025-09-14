// Last updated: 9/14/2025, 1:08:54 PM
/*
 * that new mid formula is nothing but only to get protection from int range exceeding(try to back solve the forumala by simplification you will understand what is happening)
 * 
 * remeber to aply base case because you forgot
 * 
 * three recursion call had been used here in the function binarysearch that is just insane
 * 
 * if you think very hard then you might confuse yourself but if you think in a simple way the two recusion call in if statement just doing binary search by adjusting mid if, not found target and third one is final call when taget get found
 * 
 * Remeber that index and value of index play cery diffrent role...u often confuse them and make mistakes
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