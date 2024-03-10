import java.util.*;

public class Iterator1 {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(1);
        li.add(2);
        li.add(1);
        li.add(2);
        li.add(1);
        li.add(2);
        li.add(1);
        li.add(2);
        Iterator<Integer> iterator = li.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "  ");
        }
        System.out.println();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++)
            linkedList.add(i + 1);
        Iterator<Integer> iterator2 = linkedList.iterator();
        while (iterator2.hasNext())
            System.out.print(iterator2.next() + " ");

    }
}
