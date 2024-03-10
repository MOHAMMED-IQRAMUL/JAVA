public class CircularQueueArray {

    int SIZE, FRONT, REAR;
    int[] Q;

    CircularQueueArray() {
        SIZE = 10;
        FRONT = REAR = 0;
        Q = new int[SIZE];
    }

    CircularQueueArray(int N) {
        SIZE = N;
        FRONT = REAR = 0;
        Q = new int[SIZE];
    }

    public boolean isFull() {
        if (((REAR + 1) % SIZE) == FRONT) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (REAR == FRONT) {
            return true;
        }
        return false;
    }

    public void ENQUEUE(int X) {
        if (isFull()) {
            System.out.println("QUEUE OVERFLOW ");
        } else {
            REAR = (REAR + 1) % SIZE;
            Q[REAR] = X;
        }
    }

    public int DEQUEUE() {
        if (isEmpty()) {
            System.out.println("QUEUE UNDERFLOW ");
            return -1;
        } else {
            int X;
            FRONT = (FRONT + 1) % SIZE;
            X = Q[FRONT];
            return X;
        }
    }

    public void DISPLAY() {
        int I = FRONT + 1;
        do {
            System.out.print(Q[I] + "  ");
            I = (I + 1) % SIZE;
        } while (I != ((REAR + 1) % SIZE));
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueueArray Qu = new CircularQueueArray(5);
        Qu.DEQUEUE();
        Qu.ENQUEUE(1);
        Qu.ENQUEUE(2);
        Qu.ENQUEUE(3);
        Qu.ENQUEUE(4);
        Qu.DISPLAY();
        Qu.ENQUEUE(1);

    }
}
