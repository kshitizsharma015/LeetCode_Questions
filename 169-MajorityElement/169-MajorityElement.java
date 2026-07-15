// Last updated: 7/15/2026, 11:09:04 AM
class Solution {
    public int majorityElement(int[] nums) {
        int candiate = 0;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(count==0){
                candiate = nums[i];
            }
            if(nums[i]==candiate){
                count++;
            }
            else{
                count--;
            }
        }
        return candiate;
    }
}