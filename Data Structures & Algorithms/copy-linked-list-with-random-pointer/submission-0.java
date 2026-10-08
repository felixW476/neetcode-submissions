/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null)
            return null;

        Map<Node, Node> map = new HashMap<>();

        Node dummy = new Node(0);
        Node currentNew = dummy;
        Node currentOld = head;

        // Pass 1: copy values and next pointers, record original -> copy
        while (currentOld != null) {
            currentNew.next = new Node(currentOld.val);
            currentNew = currentNew.next;
            map.put(currentOld, currentNew);
            currentOld = currentOld.next;
        }

        // Pass 2: wire up random pointers using the map
        currentOld = head;
        while (currentOld != null) {
            Node copy = map.get(currentOld);
            copy.random = map.get(currentOld.random);
            currentOld = currentOld.next;
        }

        return dummy.next;
    }
}