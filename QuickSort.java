import java.util.Arrays;

public class QuickSort {

    static void swap(int[] Arr, int i, int j) {
        int temp = Arr[i];
        Arr[i] = Arr[j];
        Arr[j] = temp;
    }

    static void quickSort(int[] Arr) {
        quickSort(Arr, 0, (Arr.length - 1));
    }

    static void quickSort(int[] Arr, int low, int high) {

        int j;

        if (low < high) {
            j = partition(Arr, low, high);
            quickSort(Arr, low, j);
            quickSort(Arr, j + 1, high);
        }

    }

    static void quickSort1(int[] Arr) {
        quickSort1(Arr, 0, (Arr.length - 1));
    }

    static void quickSort1(int[] Arr, int low, int high) {

        int j;

        if (low < high) {
            j = partition1(Arr, low, high);
            quickSort1(Arr, low, j);
            quickSort1(Arr, j + 1, high);
        }

    }

    static void QuickSortLast(int[] Arr) {
        QuickSortLast(Arr, 0, (Arr.length - 1));
    }

    static void QuickSortLast(int A[], int low, int high) {
        if (low < high) {
            int p = partition2(A, low, high);
            QuickSortLast(A, low, p - 1);
            QuickSortLast(A, p + 1, high);
        }
    }

    static int partition1(int A[], int low, int high) {
        int pivot = A[low];
        int i = low + 1;
        int j = high;

        while (true) {
            while (i <= j && A[i] <= pivot) {
                i++;
            }
            while (A[j] >= pivot && j >= i) {
                j--;
            }
            if (j < i) {
                break;
            } else {
                swap(A, i, j);
            }
        }
        swap(A, low, j);
        return j;
    }

    static int partition(int[] Arr, int low, int high) {

        int i = low;
        int j = high;
        int pivot = Arr[low];

        do {
            do {
                i++;
                // } while(Arr[i] < pivot);
            } while (i <= high && Arr[i] <= pivot);
            do {
                j--;
            } while (Arr[j] > pivot);

            if (i < j)
                swap(Arr, i, j);
        } while (i < j);

        swap(Arr, low, j);

        return j;
    }

    static int partition2(int[] A, int low, int high) {
        int pivot = A[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (A[j] < pivot) {
                i++;
                swap(A, i, j);
            }
        }
        i++;
        swap(A, i, high);
        return i;

    }

    public static void main(String[] args) {
        {
            int[] Arr = { 10, 20, 90, 40, 50, 70, 80, 30, 60, 2456 };
            System.out.println(Arrays.toString(Arr));
            quickSort(Arr);
            System.out.println(Arrays.toString(Arr));
        }
        System.out.println();
        {
            int[] Arr = { 10, 20, 90, 40, 50, 70, 80, 30, 60 };
            System.out.println(Arrays.toString(Arr));
            quickSort1(Arr);
            System.out.println(Arrays.toString(Arr));
        }
        System.out.println();
        {
            int[] Arr = { 10, 20, 90, 40, 50, 70, 80, 30, 60 };
            System.out.println(Arrays.toString(Arr));
            QuickSortLast(Arr);
            System.out.println(Arrays.toString(Arr));
        }

    }
}