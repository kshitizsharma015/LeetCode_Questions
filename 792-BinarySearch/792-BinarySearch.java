// Last updated: 9/3/2025, 9:24:14 PM
class Solution {
    public int search(int[] nums, int target) {
        return binarysearch(nums,0,nums.length-1,target);
        
    }
    public static int binarysearch(int nums[],int start,int end,int target){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
   
        if(target == nums[mid]){
            return mid;
        }
        else if(target > nums[mid]){
            return binarysearch(nums,mid+1,end,target);
        }
        else if(target < nums[mid]){
            return binarysearch(nums,start,mid-1,target);
        }
        return -1;
    } 
}