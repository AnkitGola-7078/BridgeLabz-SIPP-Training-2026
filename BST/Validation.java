package BST;

public class Validation {
   
    static class Node { int val; Node left, right; Node(int v){val=v;} }

    boolean isValidBST(Node root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(Node node, long min, long max) {
        if (node == null) return true;
        if (node.val <= min || node.val >= max) return false;
        return validate(node.left, min, node.val) && validate(node.right, node.val, max);
    }
    public static void main(String[] args) {
        Validation tree = new Validation();
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(8);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.right.right = new Node(9);

        boolean isValid = tree.isValidBST(root);
        System.out.println("Is the BST valid? " + isValid); // Output: true
    }
}


