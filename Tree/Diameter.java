package Tree;

public class Diameter {
    static class Node { int val; Node left, right; Node(int v){val=v;} }
    int diameter;

    int longestCommunicationPath(Node root) {
        diameter = 0;
        heightAndUpdate(root);
        return diameter;
    }

    int heightAndUpdate(Node node) {
        if (node == null) return -1;
        int left = heightAndUpdate(node.left);
        int right = heightAndUpdate(node.right);
        diameter = Math.max(diameter, left + right + 2);
        return Math.max(left, right) + 1;
    }
    public static void main(String[] args) {
        Diameter tree = new Diameter();
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(8);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.right.right = new Node(9);

        int longestPath = tree.longestCommunicationPath(root);
        System.out.println("Longest communication path (diameter): " + longestPath); // Output: 4
    }
}
