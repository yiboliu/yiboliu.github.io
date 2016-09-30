/** Given a linked list, remove the nth node from the end of list and return its head.
 *
 * For example,
 *
 *   Given linked list: 1->2->3->4->5, and n = 2.
 *
 *  After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 * Given n will always be valid.
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode end = head;
		ListNode first = head;
		for(int i = 0; i < n; i++){
			end = end.next;
		}
		if(end == null){
			return first.next;
		}
		while(end.next != null){
			first = first.next;
			end = end.next;
		}
		ListNode linked = first.next.next;
		first.next = linked;
        return head;
    }
}
