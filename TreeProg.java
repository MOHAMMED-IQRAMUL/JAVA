import java.util.*;

public class TreeProg {
    static class NODE {
        NODE LCHILD;
        int DATA;
        NODE RCHILD;
    }
    static class TREE {
        private NODE ROOT;
        TREE() {
            ROOT = new NODE();
            ROOT.LCHILD = ROOT.RCHILD = null;
        }
        void CREATE() {
            NODE P, T;
            int X;
            Queue<NODE> Q = new LinkedList<>();
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER ROOT VALUE ");
            X = sc.nextInt();
            ROOT.DATA = X;
            ROOT.LCHILD = ROOT.RCHILD = null;
            Q.add(ROOT);
            while (!Q.isEmpty()) {
                P = Q.remove();
                System.out.println("ENTER LEFT CHILD OF " + P.DATA + "  ");
                X = sc.nextInt();
                if (X != -1) {
                    T = new NODE();
                    T.DATA = X;
                    T.LCHILD = T.RCHILD = null;
                    P.LCHILD = T;
                    Q.add(T);
                }
                System.out.println("ENTER RIGHT CHILD OF " + P.DATA + "  ");
                X = sc.nextInt();
                if (X != -1) {
                    T = new NODE();
                    T.DATA = X;
                    T.LCHILD = T.RCHILD = null;
                    P.RCHILD = T;
                    Q.add(T);
                }
            }
            sc.close();
        }
        void RINORDER(NODE P) {
            if (P != null) {
                RINORDER(P.LCHILD);
                System.out.print(P.DATA + "  ");
                RINORDER(P.RCHILD);
            }
        }
        void SINORDER() {
            NODE P = ROOT;
            Stack<NODE> STK = new Stack<>();
            while (P != null || !STK.isEmpty()) {
                if (P != null) {
                    STK.push(P);
                    P = P.LCHILD;
                } else {
                    P = STK.pop();
                    System.out.print(P.DATA + "  ");
                    P = P.RCHILD;
                }
            }
        }
    }
    public static void main(String[] args) {
        TREE tree = new TREE();
        tree.CREATE();
        System.out.println("Recursive In-order Traversal:");
        tree.RINORDER(tree.ROOT);
        System.out.println("\n\nIterative In-order Traversal:");
        tree.SINORDER();
    }
}
