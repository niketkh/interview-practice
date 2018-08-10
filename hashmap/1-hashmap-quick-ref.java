// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        // Create a map
        Map<Integer, String> map = new HashMap<>();
        
        // Add elements to map
        map.put(1, "Hello");
        map.put(3, "42");
        map.put(2, "World");
        map.put(4, "test");
        
        // Retrieve value from map returns null if key is not found
        System.out.println(map.get(1));
        System.out.println(map.get(5));
        
        // Print Map
        System.out.println(map);
        
        // Print Map Keys
        System.out.println(map.keySet());
        
        // Print Map Values
        System.out.println(map.values());
        
        // Print Entry Set
        System.out.println(map.entrySet());
        
        // Sort Map by values and collect keys
        System.out.println(map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                           .map(x -> x.getKey()).collect(Collectors.toList()));
        
        
        // Sort Map by value
        map = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(
          Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));;
        System.out.println(map);
        
        // Sort Map by keys
        map = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(
          Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));;
        System.out.println(map);
        
        // Map keys to list
        List<Integer> keys = new ArrayList<>(map.keySet());
        System.out.println(keys);
        
        // Java 8 - Map keys to list
        keys = map.keySet().stream().collect(Collectors.toList());
        System.out.println(keys);
        
        // Map values to list
        List<String> values = new ArrayList<>(map.values());
        System.out.println(values);
        
        // Java 8 - Map values to list
        values = map.values().stream().collect(Collectors.toList());
        System.out.println(values);
        
    }
}