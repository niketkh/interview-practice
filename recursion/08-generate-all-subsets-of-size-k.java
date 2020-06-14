// "static void main" must be defined in a public class.
public class Main {
    
    public static List<List<Integer>> combinations(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        directedCombinations(n, k, 1, new ArrayList<Integer>(), result);
        return result;
    }
    
    public static void directedCombinations(int n, int k, int offset, 
            List<Integer> partialCombination, List<List<Integer>> result) {
        
        if(partialCombination.size() == k) {
            result.add(new ArrayList<>(partialCombination));
            System.out.println(partialCombination);
            return;
        }
        
        // Generate remaining combinations over (offset, ..., n-1) of size numRemaining
        final int numRemaining = k - partialCombination.size();
        for(int i = offset; i <= n && numRemaining <= n - i + 1; i++) {
            partialCombination.add(i);
            directedCombinations(n, k, i+1, partialCombination, result);
            partialCombination.remove(partialCombination.size() - 1);
        }
    }
    
    public static void main(String[] args) {
        combinations(4, 2);
    }
   
}