import java.util.*;

public class Stackprog {

    public static void main(String[] args) {
        Stack<Integer> Stk = new Stack<>();
        Stk.push(1);
        Stk.push(2);
        Stk.push(3);
        Stk.push(4);
        Stk.push(5);
        Stk.push(6);
        Stk.pop();

        List<Integer> li = new ArrayList<>();
        li.add(0);
        li.add(9);
        li.add(8);
        li.add(7);
        li.add(6);

        Stk.addAll(li);

        System.out.println("Stack Data " + Stk);

        Iterator<Integer> itr = Stk.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println("\n"+Stk.peek());

    }

}
