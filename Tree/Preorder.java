package Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Preorder {
    static class Node { int val; Node left, right; Node(int v){val=v;} }

    List<Integer> iterativePreorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            result.add(node.val);
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
        return result;
    }
   public static void main(String[] args) {
        Preorder tree = new Preorder();
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(8);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.right.right = new Node(9);

        List<Integer> preorderTraversal = tree.iterativePreorder(root);
        System.out.println(preorderTraversal); // Output: [5, 3, 1, 4, 8, 9]
   }
}

