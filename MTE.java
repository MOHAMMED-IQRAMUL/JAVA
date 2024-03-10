import java.util.*;

public class MTE {
    // . Create a menu based calculator to perform various operations
    public static void GenerateCalcMenu() {
        System.out.println("Calculator:");
        int n1, n2;
        char Op;
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter N1 & N2 ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Operator (+,-,*,/,%)");
        Op = sc.nextLine().charAt(0);
        sc.close();
        switch (Op) {
            case '+':
                System.out.println("N1 + N2 = " + n1 + n2);
                break;
            case '-':
                System.out.println("N1 - N2 = " + (n1 - n2));

                break;
            case '*':

                System.out.println("N1 * N2 = " + n1 * n2);
                break;
            case '/':
                try {
                    System.out.println("N1 / N2 = " + n1 / n2);
                } catch (ArithmeticException E) {
                    System.out.println("Cannot divide by 0 ");
                }

                break;
            case '%':
                System.out.println("N1 % N2 = " + n1 % n2);

                break;
            default:
                System.out.println("Enter valid Operator ");

                break;
        }
    }

    // Write a Java program to perform binary operations.
    public static void BinaryOperations() {
        int N1 = 5, N2 = 10;
        System.out.println("N1 + N2 = " + N1 + N2);
        System.out.println("N1 - N2 = " + (N1 - N2));
        System.out.println("N1 * N2 = " + N1 * N2);
        System.out.println("N1 / N2 = " + N1 / N2);
        System.out.println("N1 % N2 = " + N1 % N2);
        System.out.println("N1 ^ N2 = " + (N1 ^ N2));
        System.out.println("N1 | N2 = " + (N1 | N2));
        System.out.println("N1 & N2 = " + (N1 & N2));

    }

    // Write a java program to take temperature at command line in Celsius and
    // convert in Fahrenheit.
    public static void ConvertTemp() {
        double C = 37.7, F = 99.86;
        System.out.println("Farenheght (" + F + " ) In Celcius is ( " + (F - 32.0) * (5.0 / 9.0) + " )");
        System.out.println("Celcius (" + C + " ) In Farenheght is ( " + ((C * 1.8) + 32.0) + " )");
        System.out.println("Celcius (" + C + " ) In Farenheght is ( " + ((C * (9.0 / 5.0)) + 32.0) + " )");

    }

    // Write a java program to find the number of and sum of all integers greater
    // than 50 and less than 100 and are prime numbers.
    public static void SumOf() {
        int sum = 0;
        System.out.print("Numbers are ( 50 < i < 100 ) ");
        for (int i = 51; i < 100; i++) {
            int flag = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                sum += i;
                System.out.print(i + "  ");
            }
        }
        System.out.println("\nSum of all numbers are " + sum);

    }

    // Write a Java program to remove duplicate elements from an array.
    public static void RemoveDup() {
        int[] Arr = { 1, 1, 2, 3, 1, 4, 2, 5, 6, 7, 1, 8, 5, 9, 3 };

        for (int i = 0; i < Arr.length - 1; i++) {

            for (int j = i + 1; j < Arr.length - 1; j++) {

                if (Arr[i] == Arr[j]) {
                    int k = j;
                    while (k < Arr.length - 1) {
                        Arr[k++] = Arr[k];

                    }
                    Arr[k] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(Arr));
    }

    // Write a Java program to find the second largest element in a 2D array
    public static void SecondLargest() {

        int[] Arr = { 1, 2, 3, 10, 8, 7, 6, 5, 4, 3 };
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < Arr.length - 1; i++) {
                if (Arr[i + 1] < Arr[i]) {
                    int temp = Arr[i];
                    Arr[i] = Arr[i + 1];
                    Arr[i + 1] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(Arr) + "   Second Largest is " + Arr[Arr.length - 2]);
    }

    // Write a Java recursive method to check if a given array is sorted in
    // ascending order
    public static void CheckSorted() {
        int[] Arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, Arr2 = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        if (RCheckSorted(Arr1, Arr1.length))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
        if (RCheckSorted(Arr2, Arr2.length))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");

    }

    public static boolean RCheckSorted(int[] Arr, int n) {
        if (n <= 1) {
            return true;
        }
        return (Arr[n - 1] > Arr[n - 2]) && RCheckSorted(Arr, n - 1);
    }

    // write a Java program to create a class called Circle with a private instance
    // variable radius. Provide public getter and setter ethods to access and modify
    // the radius variable. However, provide two methods called calculateArea() and
    // calculatePerimeter() that return the calculated area and perimeter based on
    // the current radius value
    public static class Circle {
        private int R;

        public int GetR() {
            return R;
        }

        public void SetR(int R) {
            this.R = R;
        }

        public double calculateArea() {
            return 3.14 * R * R;
        }

        public double calculatePerimeter() {
            return 2 * 3.14 * R;
        }

    }

    public static void Circle1() {
        Circle C1 = new Circle();
        C1.SetR(100);
        System.out.println("RADIUS OF CIRCLE IS " + C1.GetR());
        System.out.println("AREA OF CIRCLE IS " + C1.calculateArea());
        System.out.println("PERIMETER OF CIRCLE IS " + C1.calculatePerimeter());
    }
   
    // . Write a java program to take an string from user in which words are separated using spaces. Tokenize the string using space delimiter and find whether India word is there  in the token list or not
public static void CheckString(){
     String S = "INDIA IS A DIVERSE COUNTRY WITH MULTIPLE REGIONS AND RELIGIONS";
    String [] SA = S.split(" ");
    for(String A : SA){
            System.out.print(A+" > ");
    }

}
    public static void main(String[] args) {
        // GenerateCalcMenu();
        // BinaryOperations();
        // ConvertTemp();
        // SumOf();
        // RemoveDup();
        // SecondLargest();
        // CheckSorted();
        // Circle1();
        // CheckString();

    }
}
