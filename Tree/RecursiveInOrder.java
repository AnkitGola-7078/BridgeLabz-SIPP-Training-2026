package Tree;

import java.util.ArrayList;
import java.util.List;

public class RecursiveInOrder {
    static class Node { int val; Node left, right; Node(int v){val=v;} }

    void inorder(Node node, List<Integer> result) {
        if (node == null) return;
        inorder(node.left, result);
        result.add(node.val);
        inorder(node.right, result);
    }

    List<Integer> getSortedLeaderboard(Node root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }
    public static void main(String[] args) {
        RecursiveInOrder tree = new RecursiveInOrder();
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(8);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.right.right = new Node(9);

        List<Integer> sortedLeaderboard = tree.getSortedLeaderboard(root);
        System.out.println(sortedLeaderboard); // Output: [1, 3, 4, 5, 8, 9]
    }
}

