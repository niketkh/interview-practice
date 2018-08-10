// "static void main" must be defined in a public class.
public class Main {
    
    public static List<List<Integer>> generatePowerSet(List<Integer> inputSet) {
        List<List<Integer>> powerSet = new ArrayList<>();
        directedPowerSet(inputSet, 0, new ArrayList<Integer>(), powerSet);
        return powerSet;
    }
    
    public static void directedPowerSet(List<Integer> inputSet, int toBeSelected,
                                        List<Integer> selectedSoFar, List<List<Integer>> powerSet) {
        if(toBeSelected == inputSet.size()) {
            powerSet.add(new ArrayList<>(selectedSoFar));
            System.out.println(selectedSoFar);
            return;
        }
        
        // Generate all subsets that contain inputSet[toBeSelected]
        selectedSoFar.add(inputSet.get(toBeSelected));
        directedPowerSet(inputSet, toBeSelected + 1, selectedSoFar, powerSet);
        
        // Generate all subsets that do not contain inputSet[toBeSelected]
        selectedSoFar.remove(selectedSoFar.size() - 1);
        directedPowerSet(inputSet, toBeSelected + 1, selectedSoFar, powerSet);
        
    }
        
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        // list.add(4);
        // list.add(5);
        
        generatePowerSet(list);
        
    }
   
}