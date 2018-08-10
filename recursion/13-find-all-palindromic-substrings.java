// "static void main" must be defined in a public class.
public class Main {
    
    public static void palindromicSubstrings(String str) {
        StringBuffer sb;
        for(int i = 0; i < str.length(); i++) {
            sb = new StringBuffer();
            sb.append(str.charAt(i));
            if(isPalindrome(sb)) System.out.println(sb);
            for(int j = i + 1; j < str.length(); j++) {
                sb.append(str.charAt(j));
                if(isPalindrome(sb)) System.out.println(sb);
            }
        }
    }
    
    public static boolean isPalindrome(StringBuffer str) {
        int i = 0, j = str.length() - 1;
        while(i<j) {
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        palindromicSubstrings("ABA");
    }
   
}