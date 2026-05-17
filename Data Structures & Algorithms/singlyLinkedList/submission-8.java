class Node{
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}
class LinkedList {
    Node head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public int get(int index) {
        if (index >= size) {
            return -1;
        }
        if (index == 0) {
            return head.val;
        }

        Node curr = head;
        int idx = 0;
        while (curr != null) {
            if (idx == index) {
                return curr.val;
            }
            curr = curr.next;
            idx++;
        }
        return -1;
    }

    public void insertHead(int val) {
        Node newHead = new Node(val);
        newHead.next = head;
        head = newHead;
        size++;
    }

    public void insertTail(int val) {
        Node curr = head;

        if (head == null) {
            head = new Node(val);
            size++;
            return;
        }

        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(val);
        size++;
    }

    public boolean remove(int index) {
        if (index >= size) {
            return false;
        }
        int idx = 0;
        Node curr = head;
        if (index == 0) {
            head = head.next;
            size--;
            return true;
        }

        while (curr != null) {
            if (idx == index - 1) {
                curr.next = curr.next.next;
                size--;
                return true;
            }
            curr = curr.next;
            idx++;
        }

        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> values = new ArrayList<>();

        Node curr = head;
        while (curr != null) {
            values.add(curr.val);
            curr = curr.next;
        }

        return values;
    }
}
