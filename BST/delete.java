package BST;

public class delete {
    static class Node { int val; Node left, right; Node(int v){val=v;} }

    Node delete(Node node, int sku) {
        if (node == null) return null;
        if (sku < node.val) node.left = delete(node.left, sku);
        else if (sku > node.val) node.right = delete(node.right, sku);
        else {
            if (node.left == null && node.right == null) return null; // leaf
            if (node.left == null) return node.right; // one child
            if (node.right == null) return node.left; // one child
            Node successor = node.right;
            while (successor.left != null) successor = successor.left;
            node.val = successor.val;
            node.right = delete(node.right, successor.val);
        }
        return node;
    }
    public static void main(String[] args) {
        delete bst = new delete();
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(8);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.right.right = new Node(9);

        int skuToDelete = 3;
        root = bst.delete(root, skuToDelete);
        System.out.println("Deleted SKU: " + skuToDelete);
    }
}


