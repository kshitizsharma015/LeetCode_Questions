// Last updated: 9/3/2025, 9:24:34 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        int i = 0;
        if(nums.length == 0 || nums == null){
                return 0;
                } 
        while(j < nums.length){
          if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
                
            }
            j++;
        }
        return i + 1;
        
    }
}