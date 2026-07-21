package BST;

public class OnboardingNewEmployees {
     static class Node { int val; Node left, right; Node(int v){val=v;} }

    Node insert(Node node, int id) {
        if (node == null) return new Node(id);
        if (id < node.val) node.left = insert(node.left, id);
        else if (id > node.val) node.right = insert(node.right, id);
        return node;
    
}

    
    public static void main(String[] args) {
        OnboardingNewEmployees bst = new OnboardingNewEmployees();
        Node root = null;
        int[] employeeIds = {5, 3, 8, 1, 4, 9};

        for (int id : employeeIds) {
            root = bst.insert(root, id);
        }

        System.out.println("Employee IDs inserted into the BST.");
    }
}