



public class Main {
        public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(new Node(50));
        bst.insert(new Node(30));
        bst.insert(new Node(70));
        bst.insert(new Node(20));
        bst.insert(new Node(40));
        bst.insert(new Node(60));
        bst.insert(new Node(80));

        System.out.println("Inorder traversal:");
        bst.display();

        System.out.println("\nSearch 40: " + bst.search(40));
        System.out.println("Search 90: " + bst.search(90));

        System.out.println("\nRemoving 20...");
        bst.remove(20);
        bst.display();

        System.out.println("\nRemoving 30...");
        bst.remove(30);
        bst.display();

        System.out.println("\nRemoving 50...");
        bst.remove(50);
        bst.display();
    }

}
