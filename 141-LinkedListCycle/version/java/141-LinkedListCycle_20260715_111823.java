// Last updated: 7/15/2026, 11:18:23 AM
// we can use fast and slow pointer approch where we have to see where these pointer are meeting if they meet return true else false;
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public boolean hasCycle(ListNode head) {
14        ListNode slow = head;
15        ListNode fast = head;
16        while(fast!=null && fast.next!=null){
17            slow = slow.next;
18            fast = fast.next.next;
19            if(slow==fast){
20                return true;
21            }
22        }
23        return false;
24        
25    }
26}