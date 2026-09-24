/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode curr = head;
        List<ListNode> list = new ArrayList<>();

        while (curr != null) {
            if (list.contains(curr)) {
                return true;
            }
            list.add(curr);
            curr = curr.next;
        }
        return false;
    }
}
