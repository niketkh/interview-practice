// "static void main" must be defined in a public class.
public class Main {
    
    public static void toh(int n, int from, int to, int aux) {
        if(n > 0) {
            toh(n-1, from, aux, to);
            System.out.println("Move " + n + " from " + from + " to " + to);
            toh(n-1, aux, to, from);
            
            
        }
        
        
    }
    
    public static void main(String[] args) {
               
        toh(3, 0, 1, 2);
    }
   
}