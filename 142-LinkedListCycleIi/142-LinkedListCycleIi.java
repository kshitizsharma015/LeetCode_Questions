// Last updated: 7/15/2026, 11:09:06 AM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
         HashSet<ListNode> set = new HashSet<>();

        while(head!=null){
            if(set.contains(head)==true){
                return head;
            }
            set.add(head);
            head=head.next ;
            }
            return null;
            
        
    }
}