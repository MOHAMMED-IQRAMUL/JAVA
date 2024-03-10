import java.util.*;

public class QueueProg {
    public static void main(String[] args) {

        {
            Queue<Integer> Que = new PriorityQueue<>();
            Que.add(1);
            Que.add(2);
            Que.add(3);
            Que.add(4);
            Que.add(5);
            System.out.println(Que);
            System.out.println(Que.peek());
            System.out.println(Que.contains(5));
            System.out.println(Que.isEmpty());
            System.out.println(Que.hashCode());
            System.out.println(Que.offer(6));
            System.out.println(Que.size());
            System.out.println(Que.toString());
            System.out.println(Que.toArray());
            System.out.println(Que.getClass());
            System.out.println(Que.poll());
            System.out.println(Que);
        }

        {
            Queue<Integer> Que = new LinkedList<>();
            Que.add(1);
            Que.add(2);
            Que.add(3);
            Que.add(4);
            Que.add(5);
            System.out.println(Que);
            System.out.println(Que.peek());
            System.out.println(Que.contains(5));
            System.out.println(Que.isEmpty());
            System.out.println(Que.hashCode());
            System.out.println(Que.offer(6));
            System.out.println(Que.size());
            System.out.println(Que.toString());
            System.out.println(Que.toArray());
            System.out.println(Que.getClass());
            System.out.println(Que.poll());
            System.out.println(Que);
        }

        {
            Queue<Integer> Que = new PriorityQueue<>();
            Que.add(1);
            Que.add(2);
            Que.add(3);
            Que.add(4);
            Que.add(5);
            System.out.println(Que);
            System.out.println(Que.peek());
            System.out.println(Que.contains(5));
            System.out.println(Que.isEmpty());
            System.out.println(Que.hashCode());
            System.out.println(Que.offer(6));
            System.out.println(Que.size());
            System.out.println(Que.toString());
            System.out.println(Que.toArray());
            System.out.println(Que.getClass());
            System.out.println(Que.poll());
            System.out.println(Que);
        }

    }
}
