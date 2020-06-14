// "static void main" must be defined in a public class.
public class Main {
    
    public static int gcd(int m, int n) {
        if(n == 0) return m;
        else return gcd(n, m%n);
    }
    
    public static void main(String[] args) {
        System.out.println(gcd(0,0));
        System.out.println(gcd(65,0));
        System.out.println(gcd(0, 65));
        System.out.println(gcd(19,13));
        System.out.println(gcd(1900, 120));
        
    }
   
}