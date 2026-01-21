// Last updated: 1/21/2026, 10:59:48 PM
// In the longest substring without repeating characters problem, I learned how to use a dynamic sliding window. I expand the window by moving the right pointer and adding characters to a HashSet. When a duplicate appears, the window becomes invalid, so I move the left pointer and remove characters until the duplicate is gone. Once the window is valid again, I calculate its length and update the maximum. I never stop early; instead, I scan the entire string while tracking the longest valid window seen so far.
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        HashSet<Character> set = new HashSet<>();
4        int left = 0;
5        int maxLen = 0;
6        for(int right=0;right<s.length();right++){
7            while(set.contains(s.charAt(right))){
8                    set.remove(s.charAt(left));
9                    left++;
10                }  
11            
12            set.add(s.charAt(right));
13            maxLen = Math.max(maxLen,right-left+1);
14        }
15        return maxLen;
16    }
17}