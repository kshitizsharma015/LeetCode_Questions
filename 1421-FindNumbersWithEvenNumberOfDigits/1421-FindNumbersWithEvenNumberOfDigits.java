// Last updated: 9/3/2025, 9:24:15 PM
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num:nums){
           if(String.valueOf(num).length() % 2 == 0){
            count++;
           }
        }
     return count;   
    }
}