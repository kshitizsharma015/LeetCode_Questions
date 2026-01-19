// Last updated: 1/19/2026, 7:58:00 PM
// In the sliding window approach, I learned that I don’t need to remember all previous elements. Because the problem only allows duplicates within distance k, any element older than k indices will never be useful again. So while traversing the array, I keep a HashSet that stores only the last k elements. At each index, I first check if the current element already exists in the set. If it does, a valid duplicate is found. Then I add the current element and remove the element that falls out of the window at index i - k. This removal is what creates the sliding window and keeps the set relevant.
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        HashSet<Integer> set = new HashSet<>();
4        for(int i = 0;i<nums.length;i++){
5            
6        if(set.contains(nums[i])){
7            return true;
8        }
9        set.add(nums[i]);
10        if(i>=k){
11            set.remove(nums[i-k]);
12        }
13    }
14
15    return false;
16}
17}