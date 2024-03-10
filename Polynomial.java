import java.util.Scanner;

public class Polynomial {
    static class TermUsingArray {
        int Coefficient;
        int Exponent;
    }

    static class PolynomialUsingArray {
        TermUsingArray[] Term;
        int n;

        PolynomialUsingArray() {
            this(10);
        }

        PolynomialUsingArray(int n) {
            this.n = n;
            Term = new TermUsingArray[n];
        }

        @SuppressWarnings("resource")
        void getExpression() {
            for (int i = 0, E = n; i < n; i++, E--) {
                Term[i] = new TermUsingArray();
                System.out.print("Enter Coefficient Of : X^" + (E) + " : ");
                Term[i].Exponent = E;
                Term[i].Coefficient = new Scanner(System.in).nextInt();
            }
        }

        void disp() {
            System.out.println();
            System.out.print("The Expression is : ");
            for (int i = 0; i < Term.length; i++) {
                System.out.print(Term[i].Coefficient + "X^" + Term[i].Exponent + " ");
                if ((i < Term.length - 1)) {
                    System.out.print("+ ");
                }
            }
            System.out.println();
        }
    }

    static PolynomialUsingArray calculateArrayPolynomial(PolynomialUsingArray Term1, PolynomialUsingArray Term2) {
        PolynomialUsingArray Result = new PolynomialUsingArray(Term1.n);
        for (int q = 0; q < Term1.n; q++) {
            Result.Term[q] = new TermUsingArray();
        }
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < Term1.n && j < Term2.n) {
            if (Term1.Term[i].Exponent > Term2.Term[i].Exponent) {
                Result.Term[k++] = Term1.Term[i++];
            } else if (Term1.Term[i].Exponent < Term2.Term[i].Exponent) {
                Result.Term[k++] = Term2.Term[j++];
            } else {
                Result.Term[k].Exponent = Term1.Term[i].Exponent;
                Result.Term[k].Coefficient = Term1.Term[i].Coefficient + Term2.Term[j].Coefficient;
                i++;
                j++;
                k++;
            }
        }
        for (; i < Term1.n; i++) {
            Result.Term[k++] = Term1.Term[i++];
        }
        for (; j < Term2.n; j++) {
            Result.Term[k++] = Term2.Term[j++];
        }
        Result.n = k;
        return Result;
    }

    static class Node {
        int Coefficient;
        int Exponent;
        Node Next;
    }

    static class PolynomialUsingLinkedList {
        Node Term;
        int n;

        PolynomialUsingLinkedList() {
            this(10);
        }

        PolynomialUsingLinkedList(int n) {
            this.n = n;
            Term = new Node();
        }

        @SuppressWarnings("resource")
        void getExpression() {
            Node current = Term;
            int exponent = n;
            for (int i = 0; i < n; i++, exponent--) {
                current.Exponent = exponent;
                System.out.print("Enter Coefficient Of : X^" + (exponent) + " : ");
                current.Coefficient = new Scanner(System.in).nextInt();
                if (i < n - 1) {
                    current.Next = new Node();
                    current = current.Next;
                }
            }
        }

        void disp() {
            System.out.println();
            System.out.print("The Expression is : ");
            Node Term1 = Term;
            for (int i = 0; i < n; i++, Term1 = Term1.Next) {
                System.out.print(Term1.Coefficient + "X^" + Term1.Exponent + " ");
                if ((i < n - 1)) {
                    System.out.print("+ ");
                }
            }
            System.out.println();
        }

    }

    static PolynomialUsingLinkedList calculateLinkedListPolynomial(PolynomialUsingLinkedList Term11,
            PolynomialUsingLinkedList Term22) {

        PolynomialUsingLinkedList result = new PolynomialUsingLinkedList();
        Node current1 = Term11.Term;
        Node current2 = Term22.Term;
        Node currentResult = result.Term;
        while (current1 != null && current2 != null) {
            currentResult.Next = new Node();
            currentResult = currentResult.Next;

            if (current1.Exponent > current2.Exponent) {
                currentResult.Exponent = current1.Exponent;
                currentResult.Coefficient = current1.Coefficient;
                current1 = current1.Next;
            } else if (current1.Exponent < current2.Exponent) {
                currentResult.Exponent = current2.Exponent;
                currentResult.Coefficient = current2.Coefficient;
                current2 = current2.Next;
            } else {
                currentResult.Exponent = current1.Exponent;
                currentResult.Coefficient = current1.Coefficient + current2.Coefficient;
                current1 = current1.Next;
                current2 = current2.Next;
            }
        }
        while (current1 != null) {
            currentResult.Next = new Node();
            currentResult = currentResult.Next;
            currentResult.Exponent = current1.Exponent;
            currentResult.Coefficient = current1.Coefficient;
            current1 = current1.Next;
        }
        while (current2 != null) {
            currentResult.Next = new Node();
            currentResult = currentResult.Next;
            currentResult.Exponent = current2.Exponent;
            currentResult.Coefficient = current2.Coefficient;
            current2 = current2.Next;
        }
        result.n = 5;
        result.Term = result.Term.Next;
        return result;
    }

    public static void main(String[] args) {

        {
            PolynomialUsingArray Expression1 = new PolynomialUsingArray(5);
            PolynomialUsingArray Expression2 = new PolynomialUsingArray(5);
            Expression1.getExpression();
            Expression2.getExpression();
            Expression1.disp();
            Expression2.disp();
            PolynomialUsingArray Expression3 = calculateArrayPolynomial(Expression1,
                    Expression2);
            Expression3.disp();
        }

        System.out.println();

        {
            PolynomialUsingLinkedList Expression1 = new PolynomialUsingLinkedList(5);
            PolynomialUsingLinkedList Expression2 = new PolynomialUsingLinkedList(5);
            Expression1.getExpression();
            Expression2.getExpression();
            Expression1.disp();
            Expression2.disp();
            PolynomialUsingLinkedList Expression3 = calculateLinkedListPolynomial(Expression1, Expression2);
            Expression3.disp();
        }
        System.out.println();

    }
}

/*
void getExpression() {
        Node Term1 = Term;
        for (int i = 0, E = n; i < n; i++, E--) {
        Term.Exponent = E;
        System.out.print("Enter Coefficient Of : X^" + (E) + " : ");
        Term.Coefficient = new Scanner(System.in).nextInt();
        if (i < n - 1) {
        Term1.Next = new Node();
        Term1 = Term1.Next;
        }
        }

        }
 * // PolynomialUsingLinkedList Term1 = Term11;
 * // PolynomialUsingLinkedList Term2 = Term22;
 * // PolynomialUsingLinkedList Result1 = new
 * PolynomialUsingLinkedList(Term1.n);
 * // PolynomialUsingLinkedList Result = Result1;
 * // for (int q = 0; q < Term1.n; q++) {
 * // Result.Term = new Node();
 * // Result.Term = Result.Term.Next;
 * // }
 * // Result = Result1;
 * // int i = 0;
 * // int j = 0;
 * // int k = 0;
 * // while (i < Term1.n && j < Term2.n) {
 * // if (Term1.Term.Exponent > Term2.Term.Exponent) {
 * // Result.Term = Term1.Term;
 * // Result.Term = Result.Term.Next;
 * // Term1.Term = Term1.Term.Next;
 * // i++;
 * // k++;
 * 
 * // } else if (Term1.Term.Exponent < Term2.Term.Exponent) {
 * // Result.Term = Term2.Term;
 * // Result.Term = Result.Term.Next;
 * // Term2.Term = Term2.Term.Next;
 * // j++;
 * // k++;
 * // } else {
 * // Result.Term.Exponent = Term1.Term.Exponent;
 * // Result.Term.Coefficient = Term1.Term.Coefficient + Term2.Term.Coefficient;
 * // Result.Term = Result.Term.Next;
 * // Term1.Term = Term1.Term.Next;
 * // Term2.Term = Term2.Term.Next;
 * // i++;
 * // j++;
 * // k++;
 * // }
 * // }
 * // for (; i < Term1.n; i++) {
 * // Result.Term = Term1.Term;
 * // Result.Term = Result.Term.Next;
 * // Term1.Term = Term1.Term.Next;
 * // k++;
 * // i++;
 * // }
 * // for (; j < Term2.n; j++) {
 * // Result.Term = Term2.Term;
 * // Result.Term = Result.Term.Next;
 * // Term2.Term = Term2.Term.Next;
 * // i++;
 * // k++;
 * // }
 * // Result.n = k;
 * // return Result;
 */