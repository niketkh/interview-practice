// "static void main" must be defined in a public class.
public class Main {
    
    public static <T> List<List<T>> combinations(List<T> inputSet, int k) {
        List<List<T>> result = new ArrayList<>();
        directedCombinations(inputSet, k, 0, new ArrayList<T>(), result);
        return result;
    }
    
    public static <T> void directedCombinations(List<T> inputSet, int k, int offset, 
        List<T> partialCombination, List<List<T>> result) {
        
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
        List<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        combinations(list, 2);
    }
   
}