// "static void main" must be defined in a public class.
public class Main {
    
    public static void getAllStringDecompositions(String str, int index, List<String> decomposition) {
        
        if(index == str.length()) 
            System.out.println(decomposition);
        
        for(int i=index+1; i<=str.length(); i++) {
            String substr = str.substring(index, i);
            decomposition.add(substr);
            getAllStringDecompositions(str, i , decomposition);
            decomposition.remove(decomposition.size()-1);
        }
    }
    
    public static void main(String[] args) {
        getAllStringDecompositions("ABC", 0, new ArrayList<String>());
    }
   
}

    