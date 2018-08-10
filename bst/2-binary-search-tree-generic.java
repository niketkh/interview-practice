// "static void main" must be defined in a public class.
public class Main {
    
    public static void main(String[] args) {
        BST<Integer> bst = new BST();
        
        bst.insert(8);
        bst.insert(4);
        bst.insert(12);
        bst.insert(2);
        bst.insert(3);
        bst.insert(5);
        bst.insert(6);
        bst.insert(10);
        
        
        int key = 10;
        if(bst.search(key) != null)
            System.out.println(key + " found");
        
        bst.traverse();
    }
}

class BST<T extends Comparable<T>> {
    BSTNode<T> root;
    
    BST() {
        root = null;
    }
    
    class BSTNode<T extends Comparable<T>> {
        public T data;
        public BSTNode<T> left, right;
        
        BSTNode(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public void insert(T key) {
        root = insertHelper(root, key);
    }
    
    public BSTNode insertHelper(BSTNode<T> root, T key) {
        if(root == null) 
            return new BSTNode<T>(key);
        
        if(key.compareTo(root.data) < 0)
            root.left = insertHelper(root.left, key);
        
        if(key.compareTo(root.data) > 0)
            root.right = insertHelper(root.right, key);
        
        return root;
            
    }
    
    public BSTNode search(T key) {
        return search(root, key);
    }
    
    public BSTNode search(BSTNode<T> root, T key) {
        if(root == null || root.data == key) 
            return root;
        
        if(key.compareTo(root.data) < 0)
            return search(root.left, key);
        
        else 
            return search(root.right, key);
        
    }
    
    public void traverse() {
        traverse(root);
    }
    
    public void traverse(BSTNode<T> root) {
        if(root == null)
            return;
        
        traverse(root.left);
        System.out.print(root.data + " ");
        traverse(root.right);
    }
    
    
    
}