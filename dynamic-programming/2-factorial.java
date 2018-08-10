/* 
Given a number n, find nth factorial
*/

public class Main {
    
    // Find Nth Factorial - Recursive Solution
    // Time Complexity: O(n), Space Complexity: O(n)
    public static long factorial(int n) {
        if(n<0)
            return -1;
        if(n<2)
            return 1;
        
        return n * factorial(n-1);
    }
    
    // Find Nth Factorial - Iterative Solution
    // Time Complexity: O(n), Space Complexity: O(1)
    public static long factorialI(int n) {
        if(n<0) return -1;
        
        if(n<2) return 1;
        
        int factorial = 1;
        
        for(int i = 2; i<=n; i++)
            factorial *= i;
        
        return factorial;
    }
    
    public static void main(String[] args) {
        System.out.println("Factorial of first 11 numbers - Recursive Approach");
        for(int i=0; i<=10; i++) {
            System.out.println(i + "! = " + factorial(i) + " ");
        }
        System.out.println();
        
        System.out.println("Factorial of first 11 numbers - Iterative Approach");
        for(int i=0; i<=10; i++) {
            System.out.println(i + "! = " + factorialI(i));
        }
    }
}