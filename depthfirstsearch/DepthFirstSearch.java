package depthfirstsearch;

/**
 *
 * @author Umar Mahmud IX-III-MMXXI
 */
public class DepthFirstSearch {

    private final Node A;
    private final Node B;
    private final Node C;
    private final Node D;
    private final Node E;
    private final Node F;
    private final Node G;
    private final Node H;
    private final Node I;
    private final Node J;
    private final Node K;
    private final Node L;
    private final Node M;

    public DepthFirstSearch() {
        A = new Node('A');
        B = new Node('B');
        C = new Node('C');
        D = new Node('D');
        E = new Node('E');
        F = new Node('F');
        G = new Node('G');
        H = new Node('H');
        I = new Node('I');
        J = new Node('J');
        K = new Node('K');
        L = new Node('L');
        M = new Node('M');

        constructTree();
        System.out.println();
        System.out.println("Recursive In Order Tarversal");
        inOrderTraversal(A);
        System.out.println();
        System.out.println("Recursive Pre Order Tarversal");
        preOrderTraversal(A);
        System.out.println();
        System.out.println("Recursive Post Order Tarversal");
        postOrderTraversal(A);
        System.out.println();

       System.out.println(" Find paths try 100 times: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("A path is: ");
            listAPath(A, I);
            System.out.println();
        }
    }

    private void listAPath(Node startNode, Node endNode) { 
        //this function returns one path, this path may have the destination
        Node currentNode = startNode;
        int randomInt = 0;
        while ((currentNode != null)) {
            if (currentNode.value != endNode.value) {
                System.out.print(currentNode.value + "\t");
                randomInt = (int) (Math.random() * (1 - 0 + 1) + 0);
                //System.out.println("Random no is: " + randomInt);
                if (randomInt == 0) {
                    currentNode = currentNode.left;
                    //System.out.println("Next Node is :" + currentNode.value);
                } else {
                    currentNode = currentNode.right;
                    //System.out.println("Next Node is :" + currentNode.value);
                }
            } else {
                currentNode = null;
                System.out.print(endNode.value + "\t");
            }
        }
    }

    private void constructTree() {   //hard codes the tree
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.left = F;
        E.right = G;
        G.left = H;
        G.right = I;
        H.left = J;
        H.right = K;
        J.left = L;
        J.right = M;
    }

    private void inOrderTraversal(Node n) {
        if (n != null) {
            inOrderTraversal(n.left);
            System.out.print(n.value + "\t");
            inOrderTraversal(n.right);
        }
    }

    private void preOrderTraversal(Node n) {
        if (n != null) {
            System.out.print(n.value + "\t");
            inOrderTraversal(n.left);
            inOrderTraversal(n.right);
        }
    }

    private void postOrderTraversal(Node n) {
        if (n != null) {
            inOrderTraversal(n.left);
            inOrderTraversal(n.right);
            System.out.print(n.value + "\t");
        }
    }

    public static void main(String[] args) {
        DepthFirstSearch dFS = new DepthFirstSearch();
    }

}
