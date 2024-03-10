public class Hashingprog {
    static final int SIZE = 10;
    public static void print(int[] arr, String s) {
        System.out.print(s + ": [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static int hash(int key) {
        return key % SIZE;
    }
    public static int linearProbe(int[] H, int key) {
        int idx = hash(key);
        int i = 0;
        while (H[(idx + i) % SIZE] != 0) {
            i++;
        }
        return (idx + i) % SIZE;
    }
    public static void insert(int[] H, int key) {
        int idx = hash(key);

        if (H[idx] != 0) {
            idx = linearProbe(H, key);
        }
        H[idx] = key;
    }

    public static int search(int[] H, int key) {
        int idx = hash(key);
        int i = 0;
        while (H[(idx + i) % SIZE] != key) {
            i++;
            if (H[(idx + i) % SIZE] == 0) {
                return -1; // Key not found
            }
        }
        return (idx + i) % SIZE;
    }
    public static void main(String[] args) {
        int[] keys = { 26, 30, 45, 23, 25, 43, 74, 19, 29 };
        print(keys, "The Arr Elements : ");
        int n = keys.length;
        // Hash Table
        int[] hashTable = new int[SIZE];
        for (int i = 0; i < n; i++) {
            insert(hashTable, keys[i]);
            print(hashTable, "Hash Table After Inserting " + keys[i]);
        }
        int keyToSearch = 25;
        int index = search(hashTable, keyToSearch);
        if (index != -1) {
            System.out.println("Key " + keyToSearch + " found at index " + index);
        } else {
            System.out.println("Key " + keyToSearch + " not found");
        }
        keyToSearch = 10;
        index = search(hashTable, keyToSearch);
        if (index != -1) {
            System.out.println("Key " + keyToSearch + " found at index " + index);
        } else {
            System.out.println("Key " + keyToSearch + " not found");
        }
    }
}
