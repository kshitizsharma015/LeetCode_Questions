// Last updated: 7/2/2026, 7:34:25 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        int [] arr = new int[2];
5        for(int i = 0;i<nums.length;i++){
6            int candidate = target-nums[i];
7            if(map.containsKey(candidate)){
8                arr[0]=i;
9                arr[1]=map.get(candidate);
10            }
11            else{
12                map.put(nums[i],i);
13            }
14        }
15        return arr;
16    }
17}