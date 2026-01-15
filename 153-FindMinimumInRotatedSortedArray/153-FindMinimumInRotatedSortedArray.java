// Last updated: 1/15/2026, 7:01:44 PM
class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;

        // If array is already sorted
        if (nums[start] <= nums[end]) {
            return nums[start];
        }

        return rotatedElement(nums, start, end);
    }

    private int rotatedElement(int[] nums, int start, int end) {
        if (start > end) {
            return -1; // safe guard
        }

        int n = nums.length;
        int mid = start + (end - start) / 2;
        int prev = (mid - 1 + n) % n;
        int next = (mid + 1) % n;

        // Check if mid is the minimum
        if (nums[mid] <= nums[prev] && nums[mid] <= nums[next]) {
            return nums[mid];
        }

        // If left part is sorted, search right half
        if (nums[0] <= nums[mid]) {
            return rotatedElement(nums, mid + 1, end);
        }

        // Else search left half
        
        return rotatedElement(nums, start, mid - 1);
    }
}
