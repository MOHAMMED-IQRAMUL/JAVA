public class StackUsingArray {
    int SIZE;
    int TOP;
    int[] S;

    StackUsingArray() {
        this(10);
    }

    StackUsingArray(int SZ) {
        SIZE = SZ;
        TOP = -1;
        S = new int[SIZE];
    }

    void PUSH(int X) {
        if (TOP == SIZE - 1)
            System.out.println("STACK OVERFLOW ");
        else {
            TOP++;
            S[TOP] = X;
        }
    }

    int POP() {
        int X = -1;
        if (TOP == -1)
            System.out.println("STACK UNDERFLOW ");
        else {
            X = S[TOP];
            TOP--;
        }
        return X;
    }

    int PEEK(int POS) {
        int X = -1;
        if ((TOP - POS + 1) < 0)
            System.out.println("INVALID INDEX ");
        else
            X = S[(TOP - POS + 1)];

        return X;
    }

    int TOP1() {
        if (TOP == -1)
            return -1;
        else
            return S[TOP];
    }

    int ISEMPTY() {
        if (TOP == -1)
            return 1;
        else
            return 0;
    }

    boolean ISFULL() {
        return (TOP == SIZE - 1);
    }

    void DISP() {
        for (int I = TOP; I >= 0; I--) {
            System.out.print(S[I] + "  ");
        }
        System.out.println();
    }
}
