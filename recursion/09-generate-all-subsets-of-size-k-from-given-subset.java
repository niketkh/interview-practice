// "static void main" must be defined in a public class.
public class Main {
    
    public static List<List<Integer>> combinations(List<Integer> inputSet, int k) {
        List<List<Integer>> result = new ArrayList<>();
        directedCombinations(inputSet, k, 0, new ArrayList<Integer>(), result);
        return result;
    }
    
    public static void directedCombinations(List<Integer> inputSet, int k, int offset, 
        List<Integer> partialCombination, List<List<Integer>> result) {
        
        if(partialCombination.size() == k) {
            result.add(new ArrayList<>(partialCombination));
            System.out.println(partialCombination);
            return;
        }
        
        // Generate remaining combinations over (offset, ..., n-1) of size numRemaining
        final int numRemaining = k - partialCombination.size();
        for(int i = offset; i < inputSet.size() && numRemaining < inputSet.size() - i + 1; i++) {
            partialCombination.add(inputSet.get(i));
            directedCombinations(inputSet, k, i+1, partialCombination, result);
            partialCombination.remove(partialCombination.size() - 1);
        }
    }
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        combinations(list, 2);
    }
   
}