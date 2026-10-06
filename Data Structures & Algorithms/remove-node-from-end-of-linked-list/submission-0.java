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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int length = 0;

        while (curr != null) {
            length++;
            curr = curr.next;
        }
        System.out.println(length);
        int stop = length - n - 1;

        curr = head;
        int idx = 0;
        if (n == length) {
            return head.next;
        }


        while (curr != null) {
            if (idx == stop) {
                curr.next = curr.next.next;
                return head;
            }
                idx++;
                curr = curr.next;
            }
         
        return head;   
        }
    }

