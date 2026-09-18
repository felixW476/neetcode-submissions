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
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> output = new ArrayList<>();
        ListNode curr = head;

        while(curr != null) {
            output.add(curr.val);
            curr = curr.next;
        }
        Collections.reverse(output);
        System.out.println(output);

        curr = head;
        int i = 0;

        while(curr != null) {
            curr.val = output.get(i);
            curr = curr.next;
            i++; 
        }

        return head;
    }
}
