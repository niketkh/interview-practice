// "static void main" must be defined in a public class.
public class Main {
    
    public static void printAllSubstrings(String str) {
        StringBuffer sb;
        for(int i = 0; i < str.length(); i++) {
            sb = new StringBuffer();
            sb.append(str.charAt(i));
            System.out.println(sb);
            for(int j = i + 1; j < str.length(); j++) {
                sb.append(str.charAt(j));
                System.out.println(sb);
            }
        }
    }
    
    public static void main(String[] args) {
        printAllSubstrings("ABCD");
    }
   
}