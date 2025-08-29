class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinarySearchTree {
    Node root;

    // Insert a node
    public void insert(Node node) {
        root = insertHelper(root, node);
    }

    private Node insertHelper(Node root, Node node) {
        if (root == null) {
            return node;
        } else if (node.data < root.data) {
            root.left = insertHelper(root.left, node);
        } else {
            root.right = insertHelper(root.right, node);
        }
        return root;
    }

    // Display tree (inorder traversal)
    public void display() {
        displayHelper(root);
    }

    private void displayHelper(Node root) {
        if (root != null) {
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
        }
    }

    // Search for a value
    public boolean search(int data) {
        return searchHelper(root, data);
    }

    private boolean searchHelper(Node root, int data) {
        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (data < root.data) {
            return searchHelper(root.left, data);
        } else {
            return searchHelper(root.right, data);
        }
    }

    // Remove a value
    public void remove(int data) {
        if (search(data)) {
            root = removeHelper(root, data);
        } else {
            System.out.println("Invalid Data");
        }
    }

    private Node removeHelper(Node root, int data) {
        if (root == null) return root;

        if (data < root.data) {
            root.left = removeHelper(root.left, data);
        } else if (data > root.data) {
            root.right = removeHelper(root.right, data);
        } else {
            // Node found
            if (root.left == null && root.right == null) {
                return null; // Case 1: no children
            } else if (root.right != null) {
                // Case 2: has right child
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            } else {
                // Case 3: only left child
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }

    // Find inorder successor
    private int successor(Node root) {
        root = root.right;
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    // Find inorder predecessor
    private int predecessor(Node root) {
        root = root.left;
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }

}
