// Last updated: 9/14/2025, 2:21:29 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        return searchInsertPosition(nums,target,start,end);
        }
    public int searchInsertPosition(int[] nums,int target,int start,int end){
        if(start>end){
           return start;    
        }

        int mid = start + (end - start)/2;
         if(nums[mid] == target){
            return mid;
        }
        if(target < nums[mid]){
            return searchInsertPosition(nums,target,start,mid-1);
        }
         if(target > nums[mid]){
            return searchInsertPosition(nums,target,mid+1,end);
        }
        return searchInsertPosition(nums,target,start,end);
    }
}

