package BST;

public class searching {
    static class Node { int val; Node left, right; Node(int v){val=v;} }

    boolean search(Node root, int target) {
        Node current = root;
        while (current != null) {
            if (target == current.val) return true;
            current = (target < current.val) ? current.left : current.right;
        }
        return false;
    }
    public static void main(String[] args) {
        searching tree = new searching();
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(8);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.right.right = new Node(9);

        int target = 4;
        boolean found = tree.search(root, target);
        System.out.println("Is " + target + " present in the BST? " + found); // Output: true
    }
}
