import java.util.Map;
import java.util.HashMap;

class Main {
	// Single Query
	public static int getFrequency(String words[], String word) {
		if(word == null || words == null) return -1;

		word = word.trim().toLowerCase();
		int count = 0;
		for(String w: words) {
			if(w.trim().toLowerCase().equals(word))
				count++;
		}

		return count;
	}

	// Repititive Queries
	public static Map<String, Integer> buildFrequencyMap(String words[]) {
		Map<String, Integer> map = new HashMap<>();

		for(String word: words) {
			word = word.trim().toLowerCase();
			if(!map.containsKey(word))
				map.put(word, 0);
			map.put(word, map.get(word) + 1);
		}

		System.out.println(map);

		return map;

	}


	public static int getFrequency(Map<String, Integer> map, String word) {
		if(map == null || word == null) return -1;
		word = word.trim().toLowerCase();
		if(map.containsKey(word))
			return map.get(word);

		return 0;
	}

	public static void main(String args[]) {
		String words[] = {"hello", "hello", "world", "india", "universe", "great", "universe", "galaxy", 
				"milky", "way", "india", "galaxy", "Hello", "HELLO"};
		Map<String, Integer> map = buildFrequencyMap(words);

		String key = "hEllo";
		System.out.println(key + " appears " + getFrequency(map, key) + " times");

		key = "great";
		System.out.println(key + " appears " + getFrequency(map, key) + " times");

		key = "India";
		System.out.println(key + " appears " + getFrequency(map, key) + " times");
	}
}