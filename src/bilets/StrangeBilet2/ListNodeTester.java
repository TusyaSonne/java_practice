package bilets.StrangeBilet2;

public class ListNodeTester {
    public static void main(String[] args) {
        ListNode node = new ListNode();
        node.add(1);
        node.add(2);
        node.add(3);
        node.print();
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2, new ListNode());
    }
}
