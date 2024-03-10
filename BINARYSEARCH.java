import java.util.Arrays;

public class BINARYSEARCH {
    static int BIN(int ARR[], int L, int H, int KEY) {
        int MID = 0;
        while (L <= H) {
            MID = (L + H) / 2;

            if (KEY == ARR[MID])
                return MID;
            else if (KEY < ARR[MID])
                H = MID - 1;
            else
                L = MID + 1;
        }
        return -1;
    }

    static int MID = 0;

    static int RBIN(int ARR[], int L, int H, int KEY) {
        if (L <= H) {
            MID = (L + H) / 2;
            if (KEY == ARR[MID])
                return MID;
            else if (KEY < ARR[MID])
                return RBIN(ARR, L, MID - 1, KEY);
            else
                return RBIN(ARR, MID + 1, H, KEY);
        }
        return -1;
    }

    public static void main(String[] args) {
        // int[] ARR = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // System.out.println("ARRAY IS " + Arrays.toString(ARR));
        // System.out.println("ELEMENT 2 IS FOUND AT " + BIN(ARR,0,9,2));
        // System.out.println("ELEMENT 44 IS FOUND AT " + BIN(ARR,0,9,44));
        // System.out.println("ELEMENT 4 IS FOUND AT " + RBIN(ARR,0,9,4));
        // System.out.println("ELEMENT 44 IS FOUND AT " + RBIN(ARR,0,9,44));

        int[] ARR = { 2, 4, 7, 12, 14, 17, 23, 25, 35, 41, 47 };
        System.out.println("ARRAY IS " + Arrays.toString(ARR));
        System.out.println("ELEMENT 2 IS FOUND AT " + BIN(ARR, 0, 10, 47) + " USING ITERATION");
        System.out.println("ELEMENT 2 IS FOUND AT " + RBIN(ARR, 0, 10, 47) + " USING RECURSION");

    }
}
