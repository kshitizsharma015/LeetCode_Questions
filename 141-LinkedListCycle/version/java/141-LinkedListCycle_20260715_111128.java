// Last updated: 7/15/2026, 11:11:28 AM
// in this we will use a tracker as hashset that will see if their is cycle and if the set have cycle then it will return
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
14        HashSet<ListNode> set = new HashSet<>();
15
16        while(head!=null){
17            if(set.contains(head)==true){
18                return true;
19            }
20            set.add(head);
21            head=head.next ;
22            }
23            return false;
24            
25        }
26        
27    
28}