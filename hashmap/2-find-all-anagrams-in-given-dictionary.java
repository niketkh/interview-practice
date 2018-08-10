// "static void main" must be defined in a public class.
public class Main {
    
    public static List<List<String>> findAnagrams(List<String> dictionary) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s: dictionary) {
            char array[] = s.toCharArray();
            Arrays.sort(array);
            String sortedStr = new String(array);
            if(!map.containsKey(sortedStr)) 
                map.put(sortedStr, new ArrayList<>());
            map.get(sortedStr).add(s);
        }
        
        
        return map.values().stream().filter(e -> e.size() >= 2).collect(Collectors.toList());
    }
    
    public static void main(String[] args) {
        List<String> dictionary = new ArrayList<>();
        dictionary.add("debitcard");
        dictionary.add("badcredit");
        dictionary.add("lives");
        dictionary.add("elvis");
        dictionary.add("levis");
        dictionary.add("silent");
        dictionary.add("listen");
        dictionary.add("hello");
        dictionary.add("world");
        
        System.out.println(findAnagrams(dictionary));
    }
}