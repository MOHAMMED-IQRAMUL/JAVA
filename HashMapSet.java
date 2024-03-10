import java.util.*;

public class HashMapSet {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            list.add(i + 1);

        // HashMap<Integer,Integer> hashMap = new HashMap<>();
        // for(int i = 0 ; i < 5 ; i++){
        // hashMap.put(i, i*2+1);
        // }

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(9, "Nine");
        map.put(10, "Ten");

        System.out.println("The map contains " + map.size() + " key-value mappings.");

        if (map.containsKey(7)) {
            System.out.println("The map contains key 7.");
        } else {
            System.out.println("The map does not contain key 7.");
        }

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(list);

        System.err.println("hashSet.toString() " + hashSet.toString());
        System.out.println("hashSet.contains(1) " + hashSet.contains(1));

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(list);

        System.err.println("linkedList.toString() " + linkedList.toString());
        System.out.println("linkedList.contains(1) " + linkedList.contains(1));
        System.out.println("linkedList.indexOf(1) " + linkedList.indexOf(1));
        System.out.println("linkedList.lastIndexOf(2) " + linkedList.lastIndexOf(2));
        System.out.println("linkedList.get(1) " + linkedList.get(1));
        System.out.println("linkedList.getFirst() " + linkedList.getFirst());
        System.out.println("linkedList.getLast() " + linkedList.getLast());

        Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> MAPPING = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter key and Value :");
            int key = sc.nextInt();
            int value = sc.nextInt();
            MAPPING.put(key, value);
        }

        for (Map.Entry<Integer, Integer> e : MAPPING.entrySet()) {
            System.out.println(e.getKey() + "  " + e.getValue());
        }

        Set<Integer> set = MAPPING.keySet();
        System.out.println(set.toString());

        Map<Integer, Integer> sortedMap = new TreeMap<>(MAPPING);
        for (Map.Entry<Integer, Integer> e : sortedMap.entrySet()) {
            System.out.print(e.getKey() + "  " + e.getValue() + " -> ");
        }

        System.out.println();

        Set<Integer> sortedSet = new TreeSet<>(set);
        System.out.println(sortedSet.toString());

        // Object[] set1 = set.toArray();
        // Arrays.sort(set1);
        // System.out.println(Arrays.toString(set1));

        sc.close();
    }
}
