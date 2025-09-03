// Last updated: 9/3/2025, 9:24:36 PM
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int j = 0;
        int i = 1;
        int c = 0;
        while (j < nums.size()) {
            if (j == i) {
                i++;
                continue;
            }
            else if ((nums[j] + nums[i]) != target) {
                i++;
                if (i == nums.size()) {
                    c = 0;
                    i = 0;
                    j++;
                }
            }
            else if ((nums[j] + nums[i]) == target) {
                return { j,i };
            }
            c++;
        }
        return {}; 
}
};
