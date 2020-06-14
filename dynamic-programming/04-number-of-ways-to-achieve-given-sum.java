/* 
    Given 3 numbers [1, 3, 5] we need to tell, 
    the total number of ways we can form a number 'N' using the sum of the given three numbers.
*/

public class Main {
    
    // Naive Recursive Approach
    // Time Complexity: O(3^n), Space Complexity: O(3^n);
    public static int numOfWaysNaive(int n) {
        if(n<0) return 0;
        if(n == 0) return 1;
        
        return numOfWaysNaive(n-1) + numOfWaysNaive(n-3) + numOfWaysNaive(n-5);
    }
    
    // DP Approach
    // Time Complexity: O(n), Space Complexity: O(n)
    public static int numOfWays(int n) {
        if(n<0) return 0;
        if(n == 0) return 1;
        
        int ways[] = new int[n + 1];
        ways[0] = 1;
        
        for(int i = 1; i<=n; i++) {
            ways[i] = ways[i-1];
            if(i-3 >= 0)
                ways[i] += ways[i-3];
            
            if(i-5 >= 0)
                ways[i] += ways[i-5];
        }
        
        return ways[n];
    }
    
    
    
    public static void main(String[] args) {
        System.out.println("Number Of Ways - Naive Recursive Approach");
        for(int i=0; i<=20; i++) {
            System.out.println("Sum: " + i + " Ways: " + numOfWaysNaive(i));
        }
        System.out.println();
        System.out.println("Number Of Ways - DP Approach");
        for(int i=0; i<=20; i++) {
            System.out.println("Sum: " + i + " Ways: " + numOfWays(i));
        }
        
    }
}