package BST;

public class LCA {
     static class Node { int val; Node left, right; Node(int v){val=v;} }

    Node lowestCommonAncestor(Node root, int p, int q) {
        Node current = root;
        while (current != null) {
            if (p < current.val && q < current.val) {
                current = current.left;
            } else if (p > current.val && q > current.val) {
                current = current.right;
            } else {
                return current;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        LCA tree = new LCA();
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(8);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.right.right = new Node(9);

        int p = 1, q = 4;
        Node lcaNode = tree.lowestCommonAncestor(root, p, q);
        if (lcaNode != null) {
            System.out.println("Lowest Common Ancestor of " + p + " and " + q + " is: " + lcaNode.val);
        } else {
            System.out.println("Lowest Common Ancestor not found.");
        }
    }   
}


