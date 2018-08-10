// "static void main" must be defined in a public class.
public class Main {
    
    public static void main(String[] args) {
        TreeSet<Integer> bst = new TreeSet<>();
        
        bst.add(1);
        bst.add(2);
        bst.add(3);
        bst.add(4);
        bst.add(5);
        bst.add(6);
        bst.add(7);
        bst.add(8);
        bst.add(9);
        bst.add(10);
        bst.add(11);
        
        System.out.println(bst);
        
        bst.remove(10);
        
        System.out.println(bst);
        
        // Smallest element
        System.out.println(bst.first());
        
        // Largest element
        System.out.println(bst.last());
        
        // Library functions
        // add(), remove(), contains(), isEmpty(), size(), clear()
        // first(), last()
        // lower(), higher()
        // ceil(), floor()
        // headSet(), tailSet(), subSet()
        // addAll(), retailAll(), removeAll()
        // iterator(), descendingIterator()
        
        // HeadSet from first element till specified element not inclusive
        System.out.println(bst.headSet(5));
        
        // TailSet from specified element to last element
        System.out.println(bst.tailSet(5));
        
        // SubSet from fromElement to toElement not inclusive
        System.out.println(bst.subSet(3, 6));
        
        int key = 9;
        if(bst.contains(key))
            System.out.println(key + " found");
    }
}

