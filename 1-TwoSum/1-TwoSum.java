// Last updated: 9/3/2025, 9:24:35 PM
import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int j = 0;
        int i = 1;
        int c = 0;
        while (j < nums.length) {
            if (j == i) {
                i++;
                continue;
            } else if ((nums[j] + nums[i]) != target) {
                i++;
                if (i == nums.length) {
                   
                    i = 0;
                    j++;
                }
            } else if ((nums[j] + nums[i]) == target) {
                return new int[] { j, i };
            }
            
        }
        return new int[] {}; 
    }
}