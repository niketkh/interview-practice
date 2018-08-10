// "static void main" must be defined in a public class.
public class Main {
    
    public static List<List<Integer>> generatePowerSet(List<Integer> inputSet) {
        List<List<Integer>> powerSet = new ArrayList<>();
        double LOG_2 = Math.log(2);
        int totalSubsets = 1 << inputSet.size();
        for(int intForSubset=0; intForSubset < totalSubsets; intForSubset++) {
            int bitArray = intForSubset;
            List<Integer> subset = new ArrayList<>();
            while(bitArray != 0) {
                subset.add(
                    inputSet.get((int) (Math.log(bitArray & ~(bitArray - 1)) / LOG_2)));
                bitArray &= bitArray - 1;
            }
            powerSet.add(subset);
            System.out.println(subset);
        }
        
        return powerSet;
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