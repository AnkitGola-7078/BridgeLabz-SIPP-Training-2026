package Tree;

public class HeightofTree {
    static class Node { int val; Node left, right; Node(int v){val=v;} }

    int height(Node node) {
        if (node == null) return -1;
        return Math.max(height(node.left), height(node.right)) + 1;
    }

    boolean isTooDeep(Node root, int threshold) {
        return height(root) > threshold;
    }
    public static void main(String[] args) {
        HeightofTree tree = new HeightofTree();
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(8);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.right.right = new Node(9);

        int threshold = 2;
        boolean tooDeep = tree.isTooDeep(root, threshold);
        System.out.println("Is the tree too deep (threshold " + threshold + ")? " + tooDeep); // Output: false
    }
}


