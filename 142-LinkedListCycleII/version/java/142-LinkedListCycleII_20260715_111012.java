// Last updated: 7/15/2026, 11:10:12 AM
// Use same approch as linked list Cycle 1 but insted of return ing true and false we are returning indexes
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
13    public ListNode detectCycle(ListNode head) {
14         HashSet<ListNode> set = new HashSet<>();
15
16        while(head!=null){
17            if(set.contains(head)==true){
18                return head;
19            }
20            set.add(head);
21            head=head.next ;
22            }
23            return null;
24            
25        
26    }
27}