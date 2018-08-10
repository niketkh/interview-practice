// "static void main" must be defined in a public class.
public class Main {
    
    public static void findAllPermutations(List<Integer> list, int l, int r) {
        if(l == r) {
            System.out.println(list);
            return;
        }
        
        for(int i=l; i<=r; i++) {
            Collections.swap(list, l, i);
            findAllPermutations(list, l+1, r);
            Collections.swap(list, i, l);
        }
    }
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        findAllPermutations(list, 0, list.size()-1);
        
    }
   
}