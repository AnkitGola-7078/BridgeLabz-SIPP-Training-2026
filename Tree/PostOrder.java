package Tree;

public class PostOrder {
    static class Node { int val; Node left, right; Node(int v){val=v;} }

    void deleteFolderTree(Node node) {
        if (node == null) return;
        deleteFolderTree(node.left);
        deleteFolderTree(node.right);
        deleteNode(node);
    }

    void deleteNode(Node node) {
        System.out.println("Deleted: " + node.val);
    }
    public static void main(String[] args) {
        PostOrder tree = new PostOrder();
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(8);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.right.right = new Node(9);

        System.out.println("Deleting folder tree in post-order:");
        tree.deleteFolderTree(root);
    }
}

