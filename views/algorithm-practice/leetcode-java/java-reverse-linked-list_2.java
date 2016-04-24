/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        ListNode phantomHead = new ListNode(0);
        ListNode current = phantomHead;
        while (!stack.empty()) {
            current.next = stack.pop();
            current = current.next;
        }
        current.next = null;
        return phantomHead.next;
    }
}