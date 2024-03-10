// import java.util.*;
public class MyThread {
    public static class THREAD1 extends Thread {
        Thread t;

        public void start() {
            t = new Thread(this);
            t.start();
        }

        public void run() {
            try {
                for (int I = 0; I <= 10; I++) {
                    System.out.println("THIS IS THREAD FROM CLASS THREAD1 ( TIME "+ I +" )");
                    System.out.println();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {

            }
        }
    }

    public static class THREAD2 implements Runnable {

        Thread t;

        public void start() {
            t = new Thread(this);
            t.start();
        }

        public void run() {
            try {
                for (int I = 0; I <= 10; I++) {
                    System.out.println(">>THIS IS THREAD FROM CLASS THREAD2 ( TIME "+ I +" )");
                    System.out.println();
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {

            }
        }

    }

    public static void main(String[] args) {
        THREAD1 T1 = new THREAD1();
        T1.start();
        THREAD2 T2 = new THREAD2();
        T2.start();
    }

}
