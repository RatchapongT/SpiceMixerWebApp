/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        Queue<ListNode> queue = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode a, ListNode b) {
                return a.val - b.val;
            }
        });
        for (ListNode list : lists) {
            if (list != null) {
                queue.add(l);
            }
        }
        ListNode phantomHead = new ListNode(0);
        ListNode currentNode = phantomHead;
        while (queue.size() > 0) {
            currentNode.next = queue.poll();
            currentNode = currentNode.next;
            if (currentNode.next != null) {
                queue.add(currentNode.next);
            }
        }
        return phantomHead.next;

    }
}