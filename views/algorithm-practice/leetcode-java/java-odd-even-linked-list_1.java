/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode evenHead = even;
        ListNode oddHead = odd;
        boolean startEven = false;
        while (head != null) {
            if (startEven) {
                even.next = head;
                even = even.next;
            } else {
                odd.next = head;
                odd = odd.next;
            }
            head = head.next;
            startEven = !startEven;
        }
        odd.next = evenHead.next;
        even.next = null;
        return oddHead.next;
    }
}