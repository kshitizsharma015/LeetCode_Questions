// Last updated: 7/1/2026, 7:12:27 PM
1class Solution {
2    public int majorityElement(int[] nums) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        for(int i = 0;i<nums.length;i++){
5            if(map.containsKey(nums[i])){
6                map.put(nums[i],map.get(nums[i])+1);
7            }
8            else{
9                map.put(nums[i],1);
10            }
11        }
12        int maxKey = 0;
13        int maxValue = 0;
14        
15        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
16            if (entry.getValue() > maxValue) {
17                maxValue = entry.getValue();
18                maxKey = entry.getKey();
19            }
20        }
21        return maxKey;
22    }
23}