import java.util.Stack;

public class BinarySearchTree {

    class Node {
        Node leftChild;
        int data;
        Node rightChild;
    }

    class BST {
        Node root;

        BST() {
            root = null;
        }

        void inOrder(Node node) {
            if (node != null) {
                inOrder(node.leftChild);
                System.out.print(node.data + "  ");
                inOrder(node.rightChild);
            }
        }

        void postOrder(Node node) {
            if (node != null) {
                postOrder(node.leftChild);
                postOrder(node.rightChild);
                System.out.println(node.data + "  ");
            }
        }

        Node insert(Node root, int key) {
            if (root == null) {
                Node newNode = new Node();
                newNode.data = key;
                newNode.leftChild = newNode.rightChild = null;
                return newNode;
            }

            if (key < root.data) {
                root.leftChild = insert(root.leftChild, key);
            } else if (key > root.data) {
                root.rightChild = insert(root.rightChild, key);
            }

            return root;
        }

        Node search(Node root, int key) {
            if (root == null || root.data == key) {
                return root;
            }

            if (key < root.data) {
                return search(root.leftChild, key);
            }

            return search(root.rightChild, key);
        }

        Node delete(Node root, int key) {
            if (root == null) {
                return null;
            }

            if (key < root.data) {
                root.leftChild = delete(root.leftChild, key);
            } else if (key > root.data) {
                root.rightChild = delete(root.rightChild, key);
            } else {
                if (root.leftChild == null) {
                    return root.rightChild;
                } else if (root.rightChild == null) {
                    return root.leftChild;
                }

                root.data = minValue(root.rightChild);
                root.rightChild = delete(root.rightChild, root.data);
            }

            return root;
        }

        int minValue(Node root) {
            int minValue = root.data;
            while (root.leftChild != null) {
                minValue = root.leftChild.data;
                root = root.leftChild;
            }
            return minValue;
        }

        void createBSTFromPreOrder(int[] pre, int n) {
            int i = 0;
            root = new Node();
            root.data = pre[i++];
            root.leftChild = null;
            root.rightChild = null;

            Node temp;
            Node parent = root;
            Stack<Node> stack = new Stack<>();

            while (i < n) {
                if (pre[i] < parent.data) {
                    temp = new Node();
                    temp.data = pre[i++];
                    temp.leftChild = null;
                    temp.rightChild = null;
                    parent.leftChild = temp;
                    stack.push(parent);
                    parent = temp;
                } else {
                    if (pre[i] > parent.data && (stack.isEmpty() || pre[i] < stack.peek().data)) {
                        temp = new Node();
                        temp.data = pre[i++];
                        temp.leftChild = null;
                        temp.rightChild = null;
                        parent.rightChild = temp;
                        parent = temp;
                    } else {
                        parent = stack.pop();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        BinarySearchTree.BST tree = new BinarySearchTree().new BST();

        tree.root = tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 10);
        tree.insert(tree.root, 3);
        tree.insert(tree.root, 4);
        tree.insert(tree.root, 25);
        tree.insert(tree.root, 22);
        tree.insert(tree.root, 27);
        tree.insert(tree.root, 50);
        tree.insert(tree.root, 35);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 55);

        System.out.println("Inorder Traversal:");
        tree.inOrder(tree.root);

        System.out.println("\nPostorder Traversal:");
        tree.postOrder(tree.root);

        int keyToSearch = 20;
        Node searchResult = tree.search(tree.root, keyToSearch);
        System.out.println(
                "\nPerforming Search to find " + keyToSearch + ": " + (searchResult != null ? "Found" : "Not Found"));

        int keyToDelete = 10;
        tree.delete(tree.root, keyToDelete);
        System.out.println("\nAfter deleting " + keyToDelete + ":");
        tree.inOrder(tree.root);

        keyToDelete = 30;
        tree.delete(tree.root, keyToDelete);
        System.out.println("\nAfter deleting " + keyToDelete + ":");
        tree.inOrder(tree.root);

        keyToDelete = 20;
        tree.delete(tree.root, keyToDelete);
        System.out.println("\nAfter deleting " + keyToDelete + ":");
        tree.inOrder(tree.root);

        keyToDelete = 10;
        tree.delete(tree.root, keyToDelete);
        System.out.println("\nAfter deleting " + keyToDelete + ":");
        tree.inOrder(tree.root);

        System.out.println();

        // Creating BST from pre-order traversal
        int[] preOrder = { 4, 3, 10, 22, 27, 25, 20, 40, 35, 55, 50, 30 };
        BinarySearchTree.BST treeFromPre = new BinarySearchTree().new BST();
        treeFromPre.createBSTFromPreOrder(preOrder, preOrder.length);
        System.out.println("Inorder Traversal of BST created from pre-order:");
        treeFromPre.inOrder(treeFromPre.root);
    }
}
/*
import java.util.Stack;

public class BinarySearchTree {
    class NODE {

        NODE LCHILD;
        int DATA;
        NODE RCHILD;
    };

    class BST {

        NODE ROOT;

        BST() {
            ROOT = new NODE();

            ROOT = null;
        }

        void RINORDER(NODE P) {
            if (P != null) {
                RINORDER(P.LCHILD);
                System.out.print(P.DATA + "  ");
                RINORDER(P.RCHILD);
            }
        }

        void RPOSTORDER(NODE P) {
            if (P != null) {
                RPOSTORDER(P.LCHILD);
                RPOSTORDER(P.RCHILD);
                System.out.println(P.DATA + "  ");
            }
        }

        NODE GETROOT() {
            return ROOT;
        }

        void INSERT1(int KEY) {
            NODE T = ROOT;
            NODE R = null;
            NODE P;
            if (ROOT == null) {
                P = new NODE();
                P.DATA = KEY;
                P.LCHILD = null;
                P.RCHILD = null;
                ROOT = P;
                return;
            }
            while (T != null) {
                R = T;
                if (KEY == T.DATA)
                    return;
                else if (KEY < T.DATA)
                    T = T.LCHILD;
                else
                    T = T.RCHILD;
            }
            P = new NODE();
            P.DATA = KEY;
            P.LCHILD = null;
            P.RCHILD = null;
            if (P.DATA < R.DATA)
                R.LCHILD = P;
            else
                R.RCHILD = P;
        }

        NODE RINSERT(NODE P, int KEY) {
            NODE T;
            if (P == null) {
                T = new NODE();
                T.DATA = KEY;
                T.LCHILD = T.RCHILD = null;
                return T;
            }
            if (KEY < P.DATA) {
                P.LCHILD = RINSERT(P.LCHILD, KEY);
            } else if (KEY > P.DATA) {
                P.RCHILD = RINSERT(P.RCHILD, KEY);
            }
            return P;
        }

        NODE RSEARCH(NODE T, int KEY) {
            if (T == null)
                return null;

            if (KEY == T.DATA)
                return T;
            else if (KEY < T.DATA)
                return RSEARCH(T.LCHILD, KEY);
            else
                return RSEARCH(T.RCHILD, KEY);
        }

        NODE ISEARCH(int KEY) {
            NODE T = ROOT;
            while (T != null) {
                if (KEY == T.DATA)
                    return T;
                else if (KEY < T.DATA)
                    T = T.LCHILD;
                else
                    T = T.RCHILD;
                return null;
            }
        }

        NODE INPRE(NODE P) {
            while (P != null && P.RCHILD != null)
                P = P.RCHILD;
            return P;
        }

        NODE INSUCC(NODE P) {
            while (P != null && P.LCHILD != null)
                P = P.LCHILD;
            return P;
        }

        int HEIGHT(NODE P) {
            int x;
            int y;
            if (P == null) {
                return 0;
            }
            x = HEIGHT(P.LCHILD);
            y = HEIGHT(P.RCHILD);
            return x > y ? x + 1 : y + 1;
        }

        NODE DELETE(NODE P, int KEY) {
            NODE q;

            if (P == null) {
                return null;
            }

            if (P.LCHILD == null && P.RCHILD == null) {
                if (P == ROOT) {
                    ROOT = null;
                }
                // delete p
                p = null;
                return null;
            }

            if (KEY < P.DATA) {
                P.LCHILD = DELETE(P.LCHILD, KEY);
            } else if (KEY > P.DATA) {
                P.RCHILD = DELETE(P.RCHILD, KEY);
            } else {
                if (HEIGHT(P.LCHILD) > HEIGHT(P.RCHILD)) {
                    q = INPRE(P.LCHILD);
                    P.DATA = q.DATA;
                    P.LCHILD = DELETE(P.LCHILD, q.DATA);
                } else {
                    q = INSUCC(P.RCHILD);
                    P.DATA = q.DATA;
                    P.RCHILD = DELETE(P.RCHILD, q.DATA);
                }
            }
            return P;
        }

        void CREATE_BST_FROM_PRE(int pre[], int n) {
            int i = 0;
            ROOT = new NODE();
            ROOT.DATA = pre[i++];
            ROOT.LCHILD = null;
            ROOT.RCHILD = null;

            NODE t;
            NODE p = ROOT;
            Stack<NODE> stk = new Stack<>();

            while (i < n) {
                if (pre[i] < p.DATA) {
                    t = new NODE();
                    t.DATA = pre[i++];
                    t.LCHILD = null;
                    t.RCHILD = null;
                    p.LCHILD = t;
                    stk.push(p);
                    p = t;
                } else {
                    if (pre[i] > p.DATA && pre[i] < stk.isEmpty() ? 32767 : stk.peek().DATA) {
                        t = new NODE();
                        t.DATA = pre[i++];
                        t.LCHILD = null;
                        t.RCHILD = null;
                        p.RCHILD = t;
                        p = t;
                    } else {
                        p = stk.top();
                        stk.pop();
                    }
                }
            }
        }
    
public static void main(String[] args) {
    



    {
        BST TR1;

        TR1.INSERT1(30);
        TR1.INSERT1(20);
        TR1.INSERT1(10);
        TR1.INSERT1(3);
        TR1.INSERT1(4);
        TR1.INSERT1(25);
        TR1.INSERT1(22);
        TR1.INSERT1(27);
        TR1.INSERT1(50);
        TR1.INSERT1(35);
        TR1.INSERT1(40);
        TR1.INSERT1(55);

        System.out.println();
        TR1.RINORDER(TR1.GETROOT());
        System.out.println();
        TR1.RPOSTORDER(TR1.GETROOT());

        cout << "\nPERFORMING RECURIVE SEARCH TO FIND 20 ";
        NODE PL1 = TR1.RSEARCH(TR1.GETROOT(), 20);
        PL1 ? cout << " FOUND " : cout << " NOT FOUND ";
        cout << "\nPERFORMING ITERATIVE SEARCH TO FIND 30 ";
        NODE PL2 = TR1.ISEARCH(30);
        PL2 ? cout << " FOUND " : cout << " NOT FOUND ";
        cout << "\nPERFORMING RECURIVE SEARCH TO FIND 1 ";
        NODE PL3 = TR1.RSEARCH(TR1.GETROOT(), 1);
        PL3 ? cout << " FOUND " : cout << " NOT FOUND ";
        cout << "\nPERFORMING ITERATIVE SEARCH TO FIND 2  ";
        NODE PL4 = TR1.ISEARCH(2);
        PL4 ? cout << " FOUND " : cout << " NOT FOUND ";

        TR1.DELETE(TR1.GETROOT(), 10);
        cout << endl;
        TR1.RINORDER(TR1.GETROOT());

        TR1.DELETE(TR1.GETROOT(), 30);
        cout << endl;
        TR1.RINORDER(TR1.GETROOT());

        TR1.DELETE(TR1.GETROOT(), 20);
        cout << endl;
        TR1.RINORDER(TR1.GETROOT());

        TR1.DELETE(TR1.GETROOT(), 10);
        cout << endl;
        TR1.RINORDER(TR1.GETROOT());
    }
    System.out.println();
    System.out.println();

    {
        BST TR1;

        TR1.INSERT1(30);
        TR1.RINSERT(TR1.GETROOT(), 20);
        TR1.RINSERT(TR1.GETROOT(), 10);
        TR1.RINSERT(TR1.GETROOT(), 3);
        TR1.RINSERT(TR1.GETROOT(), 4);
        TR1.RINSERT(TR1.GETROOT(), 25);
        TR1.RINSERT(TR1.GETROOT(), 22);
        TR1.RINSERT(TR1.GETROOT(), 27);
        TR1.RINSERT(TR1.GETROOT(), 50);
        TR1.RINSERT(TR1.GETROOT(), 35);
        TR1.RINSERT(TR1.GETROOT(), 40);
        TR1.RINSERT(TR1.GETROOT(), 55);

        System.out.println();
        TR1.RINORDER(TR1.GETROOT());
        System.out.println();
        TR1.RPOSTORDER(TR1.GETROOT());

        cout << "\nPERFORMING RECURIVE SEARCH TO FIND 20 ";
        NODE PL1 = TR1.RSEARCH(TR1.GETROOT(), 20);
        PL1 ? cout << " FOUND " : cout << " NOT FOUND ";
        cout << "\nPERFORMING ITERATIVE SEARCH TO FIND 30 ";
        NODE PL2 = TR1.ISEARCH(30);
        PL2 ? cout << " FOUND " : cout << " NOT FOUND ";
        cout << "\nPERFORMING RECURIVE SEARCH TO FIND 1 ";
        NODE PL3 = TR1.RSEARCH(TR1.GETROOT(), 1);
        PL3 ? cout << " FOUND " : cout << " NOT FOUND ";
        cout << "\nPERFORMING ITERATIVE SEARCH TO FIND 2  ";
        NODE PL4 = TR1.ISEARCH(2);
        PL4 ? cout << " FOUND " : cout << " NOT FOUND ";

        TR1.DELETE(TR1.GETROOT(), 10);
        System.out.println();
        TR1.RINORDER(TR1.GETROOT());

        TR1.DELETE(TR1.GETROOT(), 30);
        System.out.println();
        TR1.RINORDER(TR1.GETROOT());

        TR1.DELETE(TR1.GETROOT(), 20);
        System.out.println();
        TR1.RINORDER(TR1.GETROOT());

        TR1.DELETE(TR1.GETROOT(), 10);
        System.out.println();
        TR1.RINORDER(TR1.GETROOT());
    }
    // cout << endl;
    // cout << endl;
    System.out.println();
    System.out.println();


    int PRE[] = {
        4, 3, 10, 22, 27, 25, 20, 40, 35, 55, 50, 30};
    BST TR3;
    TR3.CREATE_BST_FROM_PRE(PRE, 12);
    TR3.RINORDER(TR3.GETROOT());
    // cout << endl;
    System.out.println();

    TR3.RPOSTORDER(TR3.GETROOT());

}
}
}
*/