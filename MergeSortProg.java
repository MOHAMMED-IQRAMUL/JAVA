import java.util.Arrays;

public class MergeSortProg {
    public static void Merge(int A[], int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = low;
        int[] B = new int[high + 1];
        while (i <= mid && j <= high) {
            if (A[i] < A[j]) {
                B[k++] = A[i++];
            } else {
                B[k++] = A[j++];
            }
        }
        while (i <= mid) {
            B[k++] = A[i++];
        }
        while (j <= high) {
            B[k++] = A[j++];
        }
        for (i = low; i <= high; i++) {
            A[i] = B[i];
        }
    }

    public static void MergeSort(int[] A) {
        MergeSort(A, 0, A.length - 1);
    }

    public static void MergeSort(int A[], int low, int high) {
        if (low < high) {
            // int mid = (low + (high - low)) / 2;
            int mid = (low + (high)) / 2;
            MergeSort(A, low, mid);
            MergeSort(A, mid + 1, high);
            Merge(A, low, mid, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Original array:");
        System.out.println(Arrays.toString(arr));

        MergeSort(arr);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));

    }

}
