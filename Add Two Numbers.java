/**You are given two linked lists representing two non-negative numbers.
 *The digits are stored in reverse order and each of their nodes contain a single
 *digit. Add the two numbers and return it as a linked list.
 *
 *Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 *Output: 7 -> 0 -> 8
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long total = 0;
        ListNode temp1 = l1;
        long i = 0;
        int m = 0;
        while(temp1!=null){
            i += temp1.val * (Math.pow(10, m));
            m++;
            temp1 = temp1.next;
        }
        ListNode temp2 = l2;
        long j = 0;
        int n = 0;
        while(temp2!=null){
            j += temp2.val * (Math.pow(10, n));
            n++;
            temp2 = temp2.next;
        }
        total = i + j;
        String num = Long.toString(total);
        int in = Character.getNumericValue((num.charAt(num.length()-1)));
        ListNode target = new ListNode(in);
        ListNode temp = target;
        for(int k = 1; k < num.length(); k++){
            temp.next = new ListNode(Character.getNumericValue((num.charAt(num.length()-1-k))));
            temp = temp.next;
        }
        return target;
    }
}
