// Last updated: 6/23/2026, 7:33:22 PM
/*
 * 1.	We have to create such a data structure which is open from both the sides, so that we can push and pop elements from any corner, and list is one such data structure. The first element of the list will contain maximum value of current window, the subsequent elements in the list are the candidate or possible maximum values for subsequent or future windows.
 * 
 * 2.	For jth value calculation- if the list is empty at first, then whatever comes first in the array will be pushed as maximum value in the list. In the list we need to store only those values which can become candidate maximum values for next sliding windows. So comparing jth value with the back of the list, if it comes out to be greater than the back of the list, then the back of the list becomes unused, as they can never become maximum value for future windows, so all these values which are less than the jth value needs to be deleted. If the jth value is less than the back of the list, it might not serve as the maximum value for the current window, but it can serve as the maximum value for future windows, so we need to preserve this, pushing them into the list for future use.
 * 
 * 3.	For retrieving the answer- the max value for the current window is always available at the front of the list, because all the values which are less than this value are deleted from the list, so the maximum value always occupies the first place in the list.
 * 
 * 4.	For sliding the window-   before moving i and j iterators, we need to check whether the ith value belongs to the list or not. And it happens to belong to the list only if it has served as the maximum value for current window. If it hasn’t served as the max value, then there’s no chance that it can be found in the list. So deleting the front element of the list if it equals to ith value. Then i++ and j++.
*/

1class Solution {
2    public int[] maxSlidingWindow(int[] nums, int k) {
3        int i = 0;
4        int j = 0;
5        int[] ans = new int[nums.length-k+1];
6        Deque <Integer> q = new LinkedList<>();
7        while(j<nums.length){
8               // calculation
9            if(q.size() == 0){
10                q.add(nums[j]);
11            }
12            else{
13                while(q.size() > 0 && q.peekLast() < nums[j]){
14                    q.removeLast();
15                }
16                q.add(nums[j]);
17            }
18            if((j-i+1)<k){
19                j++;
20            }
21            else if((j-i+1)==k){
22                ans[i]=q.peek();
23                if(nums[i] == q.peek()){
24                    q.removeFirst();
25                }
26                i++;
27                j++;
28            }
29           
30        }
31        return ans;
32        
33    }
34}