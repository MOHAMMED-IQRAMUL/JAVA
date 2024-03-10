public class Sortings {
    public static void PRINT(int Arr[], int n) {
        System.out.print("[ ");
        for (int i = 0; i < n; i++)
            System.out.print(Arr[i] + " , ");
        System.out.println(" ]");

    }
 
    public static void INSERTIONSORT_YT(int[] Arr, int n) {
        for (int i = 1; i < n ; i++) {
            int current = Arr[i];
            int j = i - 1;
            while (Arr[j] > current && j >= 0) {
                Arr[j + 1] = Arr[j];
                j--;
            }
            Arr[j + 1] = current;
        }
    }
/// check!!!!
    public static void SELECTIONSORT_YT(int[] Arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Arr[j] < Arr[i]) {
                    int temp = Arr[j];
                    Arr[j] = Arr[i];
                    Arr[i] = temp;
                }
            }
        }
    }

    public static void BUBBLESORT_YT(int[] Arr, int n) {
        int count = 0;
        while (count < n - 1) {
            for (int i = 0; i < n - count - 1; i++) {
                if (Arr[i] > Arr[i + 1]) {
                    int temp = Arr[i + 1];
                    Arr[i + 1] = Arr[i];
                    Arr[i] = temp;
                }
            }
            count++;
        }
    }

    public static void INSERTIONSORT_UD(int[] Arr, int n) {
        int x;
        for (int i = 1; i < n; i++) {
            x = Arr[i];
            int j = i - 1;
            while (Arr[j] > x && j > -1) {
                Arr[j + 1] = Arr[j];
                j--;
            }
            Arr[j + 1] = x;
        }
    }

    public static void SELECTIONSORT_UD(int[] Arr, int n) {
        int i, j, k;
        for (i = 0; i < n - 1; i++) {
            for (j = k = i; j < n; j++) {
                if (Arr[j] < Arr[k])
                    k = j;
            }
            int temp = Arr[i];
            Arr[i] = Arr[k];
            Arr[k] = temp;
        }
    }

    public static void BUBBLESORT_UD(int[] Arr, int n) {
        int FLAG = 0;
        for (int i = 0; i < n; i++) {
            FLAG = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (Arr[j] > Arr[j + 1]) {
                    int temp = Arr[j + 1];
                    Arr[j + 1] = Arr[j];
                    Arr[j] = temp;
                    FLAG = 1;
                }
            }
            if (FLAG == 0)
                break;
        }
    }

    public static void main(String[] args) {
        {
            int[] A1 = { 2, 3, 4, 5, 9, 87, 6, 5, 43, 2 };
            int[] A2 = { 2, 3, 4, 5, 9, 87, 6, 5, 43, 2 };
            int[] A3 = { 2, 3, 4, 5, 9, 87, 6, 5, 43, 2 };

            INSERTIONSORT_YT(A1, 10);
            PRINT(A1, 10);
            SELECTIONSORT_YT(A2, 10);
            PRINT(A2, 10);
            BUBBLESORT_YT(A3, 10);
            PRINT(A3, 10);
        }

        {
            int[] A1 = { 2, 3, 4, 5, 9, 87, 6, 5, 43, 2 };
            int[] A2 = { 2, 3, 4, 5, 9, 87, 6, 5, 43, 2 };
            int[] A3 = { 2, 3, 4, 5, 9, 87, 6, 5, 43, 2 };

            INSERTIONSORT_UD(A1, 10);
            PRINT(A1, 10);
            SELECTIONSORT_UD(A2, 10);
            PRINT(A2, 10);
            BUBBLESORT_UD(A3, 10);
            PRINT(A3, 10);
        }

    }

}
