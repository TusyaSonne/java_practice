package bilets;

public class FirstLast {
    public static class LinkedIntList {
        private ListNode front;

        public void firstLast() {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = front;
            front = front.next;
            current.next.next = null; //избежание зацикливания
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
            LinkedIntList list = new LinkedIntList();
            list.addToList(18);
            list.addToList(4);
            list.addToList(27);
            list.addToList(9);
            list.addToList(54);
            list.addToList(5);
            list.addToList(63);

            list.display();
            list.firstLast();
            list.display();

            System.out.println();
            LinkedIntList emptyList = new LinkedIntList();
            emptyList.addToList(1);
            emptyList.display();
            emptyList.firstLast();
            emptyList.display();
        }
    }
}
