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
    public void reorderList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;  


        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        int mid = (list.size() + 1) / 2;

        List<Integer> first = list.subList(0, mid);
        List<Integer> second = list.subList(mid, list.size());

        Collections.reverse(second);
     
        curr = head;
        int trans = 0;
        int fIDX = 0;
        int sec = 0;
        while (curr != null) {
            if (trans % 2 == 0) {
                curr.val = first.get(fIDX);
                fIDX++;
            } else {
                curr.val = second.get(sec);
                sec++;
            }
            trans++;
            curr = curr.next;
        }


        System.out.println(first);
        System.out.println(second);

    }
}
