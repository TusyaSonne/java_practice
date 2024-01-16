package bilets;

public class RemoveAll {
    public static class LinkedIntList {
        private ListNode front;

        public void removeAll(LinkedIntList otherList) {

            ListNode current = front;
            ListNode otherCurrent = otherList.front;
            ListNode previous = null;
            while (current != null && otherCurrent != null) {
                if (current.data == otherCurrent.data) {
                    if (previous == null) {
                        front = current.next;
                        current = front;
                    } else {
                        previous.next = current.next;
                        current = previous.next;
                    }
                    otherCurrent = otherCurrent.next;
                }
                else if (current.data < otherCurrent.data) {
                    previous = current;
                    current = current.next;
                }
                else {
                    otherCurrent = otherCurrent.next;
                }
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

        public void add(int data) {
            ListNode node = new ListNode(data);
            ListNode last = front;
            if (front == null) {
                front = node;
            }
            else {
                while (last.next != null) {
                    last = last.next;
                }
                last.next = node;
            }
        }

        public static void main(String[] args) {
            LinkedIntList list1 = new LinkedIntList();
            list1.add(1);
            list1.add(3);
            list1.add(5);
            list1.add(7);

            LinkedIntList list2 = new LinkedIntList();
            list2.add(1);
            list2.add(2);
            list2.add(3);
            list2.add(4);
            list2.add(5);

            list1.display();
            list2.display();
            System.out.println();

            list2.removeAll(list1);
            list1.display();
            list2.display();
        }

    }
}
