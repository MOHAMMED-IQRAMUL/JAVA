public class FibFact {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        {
            int number = 5;
            int result = factorial(number);
            System.out.println("The factorial of " + number + " is: " + result);
        }
        {
            int n = 10;
            int result = fibonacci(n);
            System.out.println("The " + n + " th Fibonacci number is: " + result);
        }

    }

}
