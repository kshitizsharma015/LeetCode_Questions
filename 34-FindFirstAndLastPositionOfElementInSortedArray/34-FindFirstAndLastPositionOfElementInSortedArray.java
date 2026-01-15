// Last updated: 1/15/2026, 7:01:48 PM
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