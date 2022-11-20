package Trees.basics;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    static int leafNodesCount = 0;

    Node(int d) {
        this.data = d;
        this.left = null;
        this.right = null;
    }
}

public class BuildTree {
    public static void main(String[] args) {
        Node root = buildTree(null);
        /*
                  1
                 3 5
                4 7 6
         */

        // 1 3 4 -1 -1 7 -1 -1 5 6 -1 -1 -1

        levelOrderTraversal(root);
        System.out.println();
        reverseOrderTraversal(root);
        countLeafNodes(root);
        System.out.println("Number of leaf nodes in given tree = " + Node.leafNodesCount);
    }

    public static void levelOrderTraversal(Node root) {
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        // separator
        q.offer(null);

        while(!q.isEmpty()) {
            Node temp = q.poll();
            if(temp == null) {
                System.out.println();
                if(!q.isEmpty()) {
                    q.offer(null);
                }
            }
            else{
                System.out.print(temp.data + " ");

                if(temp.left != null) {
                    q.add(temp.left);
                }
                if(temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
    }

    public static void reverseOrderTraversal(Node root) {
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        // separator
        q.offer(null);

        while(!q.isEmpty()) {
            Node temp = q.poll();
            if(temp == null) {
                System.out.println();
                if(!q.isEmpty()) {
                    q.offer(null);
                }
            }
            else{
                System.out.print(temp.data + " ");

                if(temp.right != null) {
                    q.add(temp.right);
                }
                if(temp.left != null) {
                    q.add(temp.left);
                }
            }
        }
    }

    public static Node buildTree(Node root) {
        System.out.print("Enter the data : ");

        Scanner sc = new Scanner(System.in);

        int data = sc.nextInt();

        if(data == -1) return null;

        root = new Node(data);

        System.out.print("Enter data to insert into left part of node: " + root.data + " :");
        root.left = buildTree(root.left);

        System.out.print("Enter data to insert into right part of node: " + root.data + " :");
        root.right = buildTree(root.right);

        return root;
    }

    public static void countLeafNodes(Node root) {
        if(root == null) {
            return;
        }

        // postorder traversal
        countLeafNodes(root.left);
        countLeafNodes(root.right);
        if(root.left == null && root.right == null) ++Node.leafNodesCount;
    }
}
