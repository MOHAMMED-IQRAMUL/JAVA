public class Patterns {
    public static void Patterns1(char C, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(C + " ");

            }
            System.out.println();

        }

    }

    public static void Patterns2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1 + " ");

            }
            System.out.println();

        }

    }

    public static void Patterns3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");

            }
            System.out.println();

        }
    }

    public static void Patterns4(int n) {
        int[] Fib = new int[15];
        Fib[0] = 0;
        Fib[1] = 1;
        Fib[2] = 1;
        int l = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (l != 0 && l != 1 && l != 2)
                    Fib[l] = Fib[l - 1] + Fib[l - 2];
                System.out.print(Fib[l++]);
                if (Fib[l - 1] / 10 == 0) {
                    System.out.print("   ");
                } else if ((Fib[l - 1] / 10) / 10 == 0) {
                    System.out.print("  ");
                } else if (((Fib[l - 1] / 10) / 10) / 10 == 0) {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }

    public static void Patterns5(int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(k++ + " ");
                if (k / 10 == 0 || k == 10) {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }

    public static void Patterns6(int n) {
        for (int i = 0; i < n; i++) {
            int k;
            k = (i + 1) % 2 == 0 ? 2 : 1;
            for (int j = 0; j <= i; j++) {

                System.out.print(k + " ");
                k += 2;

            }
            System.out.println();

        }

    }

    public static void Patterns7(int n) {

        for (int i = 1; i <= n; i++) {
            int k = (i * (i + 1)) / 2;
            for (int j = 0; j < i; j++) {
                System.out.print(k-- + " ");
                if ((k + 1) / 10 == 0)
                    System.out.print(" ");
            }

            System.out.println();

        }

    }

    public static void Patterns8(int n) {

        for (int i = 1; i <= n; i++) {
            int k = n - 1, p = i;
            System.out.print(i + "  ");
            for (int j = 1; j < i; j++) {
                p += k--;
                System.out.print(p + " ");
                if ((k + 1) / 10 == 0)
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void Patterns9(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (i + 'A') + " ");

            }
            System.out.println();

        }

    }

    public static void Patterns10(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (j + 'A') + " ");

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Patterns1('*', 5);
        System.out.println();
        Patterns2(5);
        System.out.println();
        Patterns3(5);
        System.out.println();
        Patterns4(5);
        System.out.println();
        Patterns5(5);
        System.out.println();
        Patterns6(5);
        System.out.println();
        Patterns7(5);
        System.out.println();
        Patterns8(5);
        System.out.println();
        Patterns9(5);
        System.out.println();
        Patterns10(5);
        System.out.println();

    }
}
