package bilets.StrangeBilet2;

public class ListNode {
    public int data;
    public ListNode next;
    public ListNode() {
        this.data = Integer.MAX_VALUE;
    }
    public ListNode(int data) {
        this.data = data;
    }
    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
    public void add(int num) {
        if (next == null) {
            next = new ListNode();
        }
        ListNode current = next;
        while (current.next != null && current.data != Integer.MAX_VALUE) {
            current = current.next;
        }
        if(current.data == Integer.MAX_VALUE) {
            current.data = num;
            current.next = new ListNode();
        }
    }
    public void print() {
        if (next == null) {
            next = new ListNode();
        }
        ListNode current = next;
        while(current.next != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

