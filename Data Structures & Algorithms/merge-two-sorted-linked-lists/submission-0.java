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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> list = new ArrayList<>();

        ListNode curr1 = list1;
        while (curr1 != null) {
            list.add(curr1.val);
            curr1 = curr1.next;
        }

        ListNode curr2 = list2;
        while (curr2 != null) {
            list.add(curr2.val);
            curr2 = curr2.next;
        }

        Collections.sort(list);
        curr1 = list1;

        int i = 0;

        System.out.println(list);
        ListNode temp = new ListNode(); // new head
        ListNode curr = temp;
        for (int j = 0; j < list.size(); j++) {
            curr.next = new ListNode(list.get(j));
            curr = curr.next;
        }
        return temp.next;
    
    }
}