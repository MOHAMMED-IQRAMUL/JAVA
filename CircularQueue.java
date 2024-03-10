// using linked list
public class CircularQueue {
    class Node {
        int data;
        Node next;

        public Node(int val) {
            data = val;
            next = null;
        }
    }

    private Node front, rear;

    public CircularQueue() {
        front = rear = null;
    }

    public void enqueue(int val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        rear.next = front;  
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return;
        }
         if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            rear.next = front;  
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        Node temp = front;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != front);
        System.out.println();
    }

    public static void main(String[] args) {
        
       CircularQueue circularQueue = new CircularQueue(); 
       circularQueue.enqueue(1); circularQueue.enqueue(2);
       circularQueue.enqueue(3); circularQueue.enqueue(4);
       circularQueue.enqueue(5); circularQueue.enqueue(6);
       System.out.print("Queue Elements : "); circularQueue.display(); 
       circularQueue.dequeue(); 
       System.out.print("Queue Elements After Dequeue Operation : "); circularQueue.display();

    }
}
