// "static void main" must be defined in a public class.
public class Main {
    
    public static void getAllPalindromicDecompositions(String str, int index, 
                                                       List<String> decomposition) {
        
        if(index == str.length()) 
            System.out.println(decomposition);
        
        for(int i=index+1; i<=str.length(); i++) {
            String substr = str.substring(index, i);
            if(isPalindrome(substr)) {
                decomposition.add(substr);
                getAllPalindromicDecompositions(str, i , decomposition);
                decomposition.remove(decomposition.size()-1);
            }
        }
    }
    
    public static boolean isPalindrome(String str) {
        for(int i=0, j=str.length()-1; i<j; i++, j--) {
            if(str.charAt(i) != str.charAt(j)) return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        getAllPalindromicDecompositions("AAA", 0, new ArrayList<String>());
    }
   
}

    