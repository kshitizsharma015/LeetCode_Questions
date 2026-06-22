// Last updated: 6/22/2026, 7:16:41 PM
/*
 * ### **Anagram Substring Search using Sliding Window**
 * 
 * This technique optimizes searching for anagrams of a pattern in a string by avoiding $O(K)$ map traversals, achieving $O(1)$ verification time.
 * 
 * **1. Initialization**
 * *   **Map:** Store distinct characters of the pattern and their frequencies.
 * *   **`count` variable:** Initialize to the size of the map (total distinct characters). This represents how many characters still need their frequencies satisfied.
 * *   **`ans` variable:** Tracks the total number of anagrams found.
 * 
 * **2. Expanding the Window (`j` pointer)**
 * *   If `str[j]` exists in the map, decrement its frequency.
 * *   If the frequency becomes **0**, decrement `count` (signifying that specific character is now fully satisfied).
 * *   **Anagram Check:** If `count == 0`, the current window is an anagram.
 * 
 * **3. Sliding the Window (`i` pointer)**
 * *   **Condition:** Once window size reaches pattern length:
 *     *   **Record Answer:** If `count == 0`, increment `ans`.
 *     *   **Remove `str[i]`:** 
 *         *   If `str[i]` is in the map, increment its frequency.
 *         *   **Important:** Only increment `count` if the frequency becomes **1**. This indicates that the character has moved from a "satisfied" state to a "needed" state, meaning a new instance of this character is required to complete the anagram.
*/

1class Solution {
2    public List<Integer> findAnagrams(String txt, String pat) {
3      
4        HashMap<Character,Integer> map = new HashMap<>();
5        int i = 0;
6        int j = 0;
7       
8        ArrayList<Integer> ans = new ArrayList<>();
9        for(int k = 0;k<pat.length();k++){
10            char ch = pat.charAt(k);
11            if(map.containsKey(ch)){
12                map.put(ch,map.get(ch)+1);
13            }else{
14                map.put(ch,1);
15            }
16        }
17        int count = map.size();
18        while(j<txt.length()){
19            if(map.containsKey(txt.charAt(j))){
20                map.put(txt.charAt(j),map.get(txt.charAt(j))-1);
21                if(map.get(txt.charAt(j))==0){
22                    count--;
23                
24                    
25                }
26            }
27            if((j-i+1)<pat.length()){
28                j++;
29            }
30            else if((j-i+1)==pat.length()){
31                if(count==0){
32                        ans.add(i);
33                    }
34                if(map.containsKey(txt.charAt(i))){
35                    if(map.get(txt.charAt(i))==0){
36                        count++;
37                    }
38                    map.put(txt.charAt(i),map.get(txt.charAt(i))+1);
39                    
40                }
41                i++;
42                j++;
43            }
44            
45        }
46        return ans;
47    }
48}
49    