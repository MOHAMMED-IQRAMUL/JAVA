public class LinkedList1 {
    private Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void remove(int position) {
        if (head == null) {
            return;
        }

        Node current = head;
        if (position == 0) {
            head = current.next;
        } else {
            Node previous = null;
            int count = 0;
            while (current != null && count < position) {
                previous = current;
                current = current.next;
                count++;
            }
            if (current != null) {
                previous.next = current.next;
            }
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    void Concatenate(LinkedList1 l2){
        Node p = head;
        while(p.next!=null){
            p = p.next;
        }
        p.next = l2.head;
    }
    int findSecondSmallest() {
        if (head == null || head.next == null) {
            System.out.println("Not enough elements to find the second smallest.");
            return -1; // Assuming -1 as a default value for an invalid case.
        }

        Node first = head;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        while (first != null) {
            if (first.data < smallest) {
                secondSmallest = smallest;
                smallest = first.data;
            } else if (first.data < secondSmallest && first.data != smallest) {
                secondSmallest = first.data;
            }

            first = first.next;
        }

        return secondSmallest;
    }
    

    public static void main(String[] args) {
        LinkedList1 linkedList = new LinkedList1();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        LinkedList1 linkedList1 = new LinkedList1();

        linkedList1.add(1);
        linkedList1.add(2);
        linkedList1.add(3);
        linkedList1.add(4);
        linkedList1.add(5);

        linkedList.Concatenate(linkedList1);
        linkedList.display();

        // System.out.print("Linked List:  --> [ ");
        // linkedList.display();
        // System.out.println("] ");
        // // linkedList.remove(2);

        // // System.out.print("Linked List after removing element at position 2: -> [ ");
        // // linkedList.display();
        // // System.out.println("] ");

        // int secondSmallest = linkedList.findSecondSmallest();
        // if (secondSmallest != -1) {
        //     System.out.println("Second Smallest Element: " + secondSmallest);
        // }

    }
}
