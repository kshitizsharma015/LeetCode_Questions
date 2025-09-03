// Last updated: 9/3/2025, 9:24:25 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        int i=0;
        while(j<nums.length){
            if(nums[j]!=0){
                int tem = nums[j];
                nums[j] = nums[i];
                nums[i] = tem;
                i++;
            }
            j++;
        }

        
    }
}