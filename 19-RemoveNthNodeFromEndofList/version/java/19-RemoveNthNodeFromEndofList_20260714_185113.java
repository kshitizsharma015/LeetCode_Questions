// Last updated: 7/14/2026, 6:51:13 PM
// use counter to get the length...then subtract the counter from n then iterate loop till counter to get the node just before the node to be deleted then make theat current node to have adress of the next to next node address
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        ListNode temp = head;
14        int count = 0;
15        while(temp!=null){
16            count++;
17            temp = temp.next;
18        }
19       
20        count = count - n;
21        
22        if (count == 0) {
23            return head.next;
24        }
25        temp=head;
26        for(int  i = 1;i<count;i++){
27            temp = temp.next;
28        }
29        temp.next = temp.next.next;
30
31        return head;
32    }
33}