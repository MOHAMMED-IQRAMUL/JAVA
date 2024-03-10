import java.util.*;

public class PriorityQueue1 {
    static class PriorityQueue {
        private int capacity = 10;
        private int size = 0;
        private int[] elements = new int[capacity];

        private void ensureCapacity() {
            if (size == capacity) {
                capacity *= 2;
                elements = Arrays.copyOf(elements, capacity);
            }
        }

        public void enqueue(int item, int priority) {
            ensureCapacity();
            elements[size++] = item;
            bubbleUp(size - 1, priority);
        }

        private void bubbleUp(int index, int priority) {
            while (index > 0) {
                int parentIndex = (index - 1) / 2;
                if (elements[parentIndex] > priority) {
                    swap(index, parentIndex);
                    index = parentIndex;
                } else {
                    break;
                }
            }
        }

        public int dequeue() {
            if (isEmpty()) {
                throw new IllegalStateException("Priority queue is empty");
            }

            int highestPriorityItem = elements[0];
            elements[0] = elements[--size];
            bubbleDown(0);
            return highestPriorityItem;
        }

        private void bubbleDown(int index) {
            int leftChild;
            int rightChild;
            int minIndex;

            while (index < size / 2) {
                leftChild = 2 * index + 1;
                rightChild = 2 * index + 2;

                minIndex = (rightChild < size && elements[rightChild] < elements[leftChild]) ? rightChild : leftChild;

                if (elements[index] > elements[minIndex]) {
                    swap(index, minIndex);
                    index = minIndex;
                } else {
                    break;
                }
            }
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        private void swap(int i, int j) {
            int temp = elements[i];
            elements[i] = elements[j];
            elements[j] = temp;
        }

        public void display() {
            System.out.print("Priority Queue: ");
            for (int i = 0; i < size; i++) {
                System.out.print(elements[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.enqueue(1, 1);
        priorityQueue.enqueue(2, 2);
        priorityQueue.enqueue(3, 3);
        priorityQueue.enqueue(4, 2);
        priorityQueue.enqueue(5, 2);
        priorityQueue.enqueue(6, 3);
        priorityQueue.display();
        System.out.println("Dequeue Operation, Dequed Element " + priorityQueue.dequeue());
        priorityQueue.display();

    }

}
