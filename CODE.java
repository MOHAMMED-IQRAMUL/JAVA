import java.util.*;
import java.util.Arrays;

// /*.Write a Java program to create a class Employee with a method called 
// calculateSalary(). Create two subclasses Manager and Programmer. In each 
// subclass, override the calculateSalary() method to calculate and return the 
// salary based on their specific roles. */
class Employee {

    public int calculateSalary() {

        return 1;
    }
}

class Manager extends Employee {
    int RoleSal;

    Manager() {
        this(50000);
    }

    Manager(int x) {
        RoleSal = x;
    }

    @Override
    public int calculateSalary() {
        return (int) (RoleSal * 1.5);
    }
}

class Programmer extends Employee {

    int RoleSal;

    Programmer() {
        this(100000);
    }

    Programmer(int x) {
        RoleSal = x;
    }

    @Override
    public int calculateSalary() {
        return (int) (RoleSal * 1.8);
    }
}

public class CODE {
    class Node{
        int Data;
        Node Next;
    }
    Node Head;
    CODE(){
     }
    public void disp(){
        Node P = Head;
int i = 0 ;
        while( P != null ){
            System.out.print(P.Data  );
            if(P.Next != null){
System.out.print(" <+_"+(i++)+"_+> ");
            }
            P = P.Next;
        }
    }
    public void Insert(int x){
        Node P = Head;
        if( Head == null){
            P = new Node();
            P.Data = x;
            P.Next = null;
            Head = P;
        }
        else{
        while( P.Next != null ){
             P = P.Next;
        }
        Node Q = new Node();
        Q.Data = x;
        Q.Next = null;
        P.Next = Q;
    }
    }
    public void Deleteaftern(int n){
        Node P = Head;
        Node Q = Head;

        for(int i = 0 ; i < n-1 && P.Next != null ; i++,P=P.Next){
Q = Q.Next;
        }
        if(Q.Next != null && Q.Next.Next != null)
        P.Next = Q.Next.Next;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CODE c = new CODE();
         c.Insert(2);
        c.Insert(3);
        c.Insert(4);
        c.Insert(5);
        c.Insert(6);
        c.Insert(7);
        c.Insert(8);
        c.Insert(9);
        c.disp();        System.out.println();
        c.Deleteaftern(5);
        System.out.println();
        c.disp();
        Manager mg = new Manager();
        Programmer pg = new Programmer();

        System.out.println(mg.calculateSalary());
        System.out.println(pg.calculateSalary());

        System.out.printf("%,d%n",mg.calculateSalary());
        System.out.printf("%,d%n",pg.calculateSalary());

        sc.close();
    }
}


class CODE1 {

public static void main1(String[] args) {

int n = 12345;
System.out.println(n);
Stack<Integer> stk = new Stack<>();
String s = Integer.toString(n);
int i = 0;
while (i < s.length()) {

stk.push(s.charAt(i)-'0');
i++;}
n = 0;
while (!stk.isEmpty()) {
n = n * 10 + stk.pop();
}
System.out.println(n);
}
public static void main(String[] args) {

    int[] Arr = { 90, 80, 70, 60, 10, 20, 30, 40, 50, 25, 35, 45, 65, 75, 85, 10 };
    System.out.println(Arrays.toString(Arr));
    int[] A1 = Arr;
    Arrays.sort(A1);
    System.out.println();
    System.out.println(Arrays.toString(A1));
    System.out.println();

    int max = 0;
    int min = 0;
    int temp = 0;
    for (int j = 0; j < Arr.length / 2; j++) {
        max = j * 2;
        min = max + 1;
        for (int i = j * 2 + 1; i < Arr.length; i++) {
            if (Arr[i] > Arr[max]) {
                max = i;
            }
            if (Arr[i] < Arr[min]) {
                min = i;
            }
        }
        temp = Arr[j * 2];
        Arr[j * 2] = Arr[max];
        Arr[max] = temp;
        temp = Arr[j * 2 + 1];
        Arr[j * 2 + 1] = Arr[min];
        Arr[min] = temp;
    }
    System.out.println(Arrays.toString(Arr));

Arrays.sort(A1);
System.out.println();
System.out.println(Arrays.toString(A1));
System.out.println();
}
}

class CODE2 {
    public static void main(String[] args) {

        int[] Arr = { 23, 243, 42, 4, 42, 42, 5, 45, 245, 4, 246, 2 };
        int min1 = Arr[0];
        int min2 = Arr[0];
        for (int i = 0; i < Arr.length; i++) {
        if (min1 > Arr[i]) {
        min2 = min1;
        min1 = Arr[i];
        }
        }
        System.out.println("Second Smallest is " + min2);

        int[] a1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] a2 = { 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int[] a3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

        int i = 0, j = 0, k = 0;

        while (i < a1.length && j < a2.length && k < a3.length) {

            if (a1[i] == a2[j] && a2[j] == a3[k]) {
                System.out.println(a1[i]);
                i++;
                j++;
                k++;
            } else if (a1[i] < a2[j]) {
                i++;
            } else if (a2[j] < a3[k]) {
                j++;
            } else {
                k++;
            }
        }

        for (i = 0; i < a1.length; i++) {

            for (j = 0; j < a2.length; j++) {
                if (a1[i] != a2[j]) {
                    continue;
                } else {
                    for (k = 0; k < a3.length; k++) {
                        if (a1[i] == a3[k]) {
                            System.out.println(a1[i]);
                        }

                    }
                }
            }
        }

        int[] ans = new int[a1.length + a2.length + a3.length];
        i = j = k = 0;
        for (int p = 0; p < (a1.length + a2.length + a3.length); p++) {
            if (i < a1.length && (j >= a2.length || a1[i] < a2[j]) && (k >= a3.length || a1[i] < a3[k])) {
                ans[p] = a1[i];
                i++;
            } else if (j < a2.length && (k >= a3.length || a2[j] < a3[k]) && (i >= a1.length || a2[j] < a1[i])) {
                ans[p] = a2[j];
                j++;
            } else if (k < a3.length && (i >= a1.length || a3[k] < a1[i]) && (j >= a2.length || a3[k] < a2[j])) {
                ans[p] = a3[k];
                k++;
            }
        }
        for (i = 0; i < ans.length - 3; i++) {
            if (ans[i] == ans[i + 1] && ans[i] == ans[i + 2]) {
                System.out.println(ans[i]);
            }
        }
    }
}