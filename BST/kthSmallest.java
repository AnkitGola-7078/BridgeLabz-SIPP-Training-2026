package BST;

import java.util.ArrayDeque;
import java.util.Deque;

public class kthSmallest {
    static class Node { int val; Node left, right; Node(int v){val=v;} }

    int kthSmallest(Node root, int k) {
        Deque<Node> stack = new ArrayDeque<>();
        Node current = root;
        int count = 0;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            count++;
            if (count == k) return current.val;
            current = current.right;
        }
        throw new IllegalArgumentException("k out of range");
    }
    public static void main(String[] args) {
        kthSmallest tree = new kthSmallest();
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(8);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.right.right = new Node(9);

        int k = 3;
        int kthSmallestValue = tree.kthSmallest(root, k);
        System.out.println("The " + k + "rd smallest value in the BST is: " + kthSmallestValue); // Output: 4
    }
}
