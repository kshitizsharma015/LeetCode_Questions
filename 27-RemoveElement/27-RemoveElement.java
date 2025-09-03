// Last updated: 9/3/2025, 9:24:33 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int j = 0;
        int i = 0;
        while (j < nums.length) {
            if (nums[j] != val) {
                int tem = nums[j];
                nums[j] = nums[i];
                nums[i] = tem;
                i++;
                k++;
            }
            j++;

        }
        return k;
    }
}