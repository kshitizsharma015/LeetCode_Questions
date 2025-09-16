// Last updated: 9/16/2025, 9:58:25 PM
// You have to use two binary search...but here i used only one binary search and what i did is i created a flag so that i can use it for left index and right index and i used recuursion and all the step are same as in binarysearch with reccursion have but the diffrence is that only in when target == nums[mid] i check leftbias is true if yes then it gonna check for left index and uptil it find its true for booth it will make right = mid - 1 and index = mid and if leftbias = false it gonna make left = mid + 1 and index = mid and every other logic is same as binary search
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int index = -1;
        int leftIndex = firstLast(nums,left,right,index,true,target);
        int rightIndex = firstLast(nums,left,right,index,false,target);
        return new int[]{leftIndex,rightIndex};
    }
    public int firstLast(int[] nums,int left,int right,int index,boolean leftbias,int target){
        int mid = left + (right - left)/2;
        if(left>right){
            return index;
        }
        if(target==nums[mid]){
            if(leftbias==true){
                return firstLast(nums,left,mid-1,mid,leftbias,target);
            }
            else{
                return firstLast(nums,mid+1,right,mid,leftbias,target);
            }
        }
        if(target<nums[mid]){
           return firstLast(nums,left,mid-1,index,leftbias,target);
        }
        else{
            return firstLast(nums,mid+1,right,index,leftbias,target);
        }
    }
}