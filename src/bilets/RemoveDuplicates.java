package bilets;

public class RemoveDuplicates {
    public static class LinkedIntList {
        private ListNode front;

        public void removeDuplicates() {
            ListNode current = front;
            while (current != null) {
                ListNode runner = current;
                while (runner.next != null) {
                    if (runner.next.data == current.data) {
                        runner.next = runner.next.next;
                    }
                    else {
                        runner = runner.next;
                    }
                }
                current = current.next;
            }
        }

        public void addToList(int data) {
            ListNode node = new ListNode(data);
            if (front == null) {
                front = node;
            } else {
                ListNode last = front;
                while (last.next != null) {
                    last = last.next;
                }
                last.next = node;
            }
        }

        public void display() {
            ListNode current = front;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            LinkedIntList linkedIntList1 = new LinkedIntList();
            linkedIntList1.addToList(14);
            linkedIntList1.addToList(8);
            linkedIntList1.addToList(14);
            linkedIntList1.addToList(12);
            linkedIntList1.addToList(1);
            linkedIntList1.addToList(14);
            linkedIntList1.addToList(11);
            linkedIntList1.addToList(8);
            linkedIntList1.addToList(8);
            linkedIntList1.addToList(10);
            linkedIntList1.addToList(4);
            linkedIntList1.addToList(9);
            linkedIntList1.addToList(1);
            linkedIntList1.addToList(2);
            linkedIntList1.addToList(5);
            linkedIntList1.addToList(2);
            linkedIntList1.addToList(4);
            linkedIntList1.addToList(12);
            linkedIntList1.addToList(12);

            linkedIntList1.display();
            linkedIntList1.removeDuplicates();
            linkedIntList1.display();
        }

    }
}
