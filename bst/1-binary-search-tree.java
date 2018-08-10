// "static void main" must be defined in a public class.
public class Main {
    
    public static void main(String[] args) {
        BST bst = new BST();
        
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
        
        bst.remove(6);
        bst.remove(2);
        bst.remove(10);
        System.out.println();
        
        bst.traverse();
    }
}

class BST {
    BSTNode root;
    
    BST() {
        root = null;
    }
    
    class BSTNode {
        public Integer data;
        public BSTNode left, right;
        
        BSTNode(Integer data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public void insert(Integer key) {
        root = insertHelper(root, key);
    }
    
    public BSTNode insertHelper(BSTNode root, Integer key) {
        if(root == null) 
            return new BSTNode(key);
        
        if(key < root.data) 
            root.left = insertHelper(root.left, key);
        
        if(key > root.data)
            root.right = insertHelper(root.right, key);
        
        return root;
            
    }
    
    public BSTNode search(Integer key) {
        return search(root, key);
    }
    
    public BSTNode search(BSTNode root, Integer key) {
        if(root == null || root.data == key) 
            return root;
        
        if(key < root.data)
            return search(root.left, key);
        
        else 
            return search(root.right, key);
        
    }
    
    public boolean remove(Integer key) {
        root = remove(root, key);
        
        return root == null? false : true;
    }
    
    public BSTNode remove(BSTNode root, Integer key) {
        if(root == null)
            return null;
        
        if(key < root.data)
            root.left = remove(root.left, key);
        
        else if(key > root.data)
            root.right = remove(root.right, key);
        
        else {
            if(root.left == null)
                return root.right;
            
            if(root.right == null)
                return root.left;
            
            // Node with two children, get inorder successor from right subtree
            root.data = inorderSuccessor(root.right);
            
            root.right = remove(root.right, root.data);
        }
        
        return root;
    }
    
    public int inorderSuccessor(BSTNode root) {
        int min = root.data;
        while(root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        
        return min;
    }
    
    public void traverse() {
        traverse(root);
    }
    
    public void traverse(BSTNode root) {
        if(root == null)
            return;
        
        traverse(root.left);
        System.out.print(root.data + " ");
        traverse(root.right);
    }
    
    
    
}