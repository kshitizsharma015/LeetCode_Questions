// Last updated: 1/16/2026, 7:11:32 PM
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        for(int i = 0;i<nums.length;i++){
5            if(map.containsKey(nums[i])){
6                int prev = map.get(nums[i]);
7                if(i-prev<=k){
8                    return true;
9                }}
10                map.put(nums[i],i);
11                    
12            
13        }
14        return false;
15    }
16}