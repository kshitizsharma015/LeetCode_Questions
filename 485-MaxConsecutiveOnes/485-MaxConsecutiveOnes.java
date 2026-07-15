// Last updated: 7/15/2026, 11:08:52 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                max = Math.max(max,count);
            }
            else{
                count = 0;
            }
        }
        return max;
    }
}