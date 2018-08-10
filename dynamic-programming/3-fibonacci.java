/* 
Given a number n, find nth fibonacci term
*/

public class Main {
    
    // Find Nth Fibonacci - Recursive Solution
    // Time Complexity: O(2^n), Space Complexity: O(n)
    public static int fibonacciNaive(int n) {
        if(n<0) return -1;
        if(n<2) return 1;
        
        return fibonacciNaive(n-1) + fibonacciNaive(n-2);
    }
    
    // Find Nth Fibonacci - DP
    // Time Complexity: O(n), Space Complexity: O(n)
    public static int fibonacciDP(int n) {
        if(n<0) return -1;
        if(n<2) return 1;
        
        int fibo[] = new int[n+1];
        fibo[0] = 1;
        fibo[1] = 1;
        
        for(int i=2; i<=n; i++)
            fibo[i] = fibo[i-1] + fibo[i-2];
        
        return fibo[n];
    }
    
    // Find Nth Fibonacci - Efficient DP
    // Time Complexity: O(n), Space Complexity: O(1)
    public static int fibonacci(int n) {
        if(n<0)
            return -1;
        
        if(n<2) return 1;
        
        int first = 1, second = 1, result = 0;
        for(int i = 2; i<=n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        
        return result;
    }
    
    
    
    public static void main(String[] args) {
        
        System.out.println("Print first 11 Fibonacci Numbers - Recursive Approach");
        for(int i=0; i<=10; i++) {
            System.out.print(fibonacciNaive(i) + " ");
        }
        System.out.println();
        System.out.println();
        
        System.out.println("Print first 11 Fibonacci Numbers - DP");
        for(int i=0; i<=10; i++) {
            System.out.print(fibonacciDP(i) + " ");
        }
        System.out.println();
        System.out.println();
        
         System.out.println("Print first 11 Fibonacci Numbers - Efficient DP");
        for(int i=0; i<=10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }
}