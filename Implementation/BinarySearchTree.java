public class BinarySearchTree {
    Node root;

    public void insert(Node node){
        root = insertHelper(root,node);
    }
    private Node insertHelper(Node root,Node node){
        int data = node.data;

        if(root==null){
            root = node;
            return root;
        }else if(data < root.data){
            root.left = insertHelper(root.left,node);
        }else {
            root.right = insertHelper(root.right,node);
        }

        return root;

        }
    } 
    public void display(){}
    private void displayHelper(){}
    public boolean search(int data){}
    private boolean search(int data){}
    public void remove(int data){}
    public Node removeHelper(Node root,int data){}
    private int successor(Node root){
        return 0;
    }
    private int predecessor(Node root){}

}
