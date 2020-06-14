/* 
Ugly numbers are numbers whose only prime factors are 2, 3 or 5. 
The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, … shows the first 10 ugly numbers. 
By convention, 1 is included.

Given a number n, find nth ugly number
*/

public class Main {
    
    // Check for all numbers until you get nth ugly number
    // Naive Approach 
    // Time Complexity: O(n), Space Complexity: O(1)
    public static int uglyNumberNaive(int n) {
        int count = 0, num = 0;
        
        if(n <= 0)
            return Integer.MIN_VALUE;
        
        while(count < n) {
            num++;
            if(isUgly(num))
                count++;
        }
        
        return num;        
    }
    
    // Efficient approach using Dynamic Programming
    // Based on fact that multiply uglyNumbers sequence
    // With 2, 3 or 5 also gives a sequence which are all uglyNumbers
    // Time Complexity: O(n), Space Complexity: O(n)
    public static int uglyNumber(int n) {
        if(n <= 0)
            return Integer.MIN_VALUE;
        
        if(n == 1)
            return 1;
        
        int uglyNumbers[] = new int[n];
        uglyNumbers[0] = 1;
        
        int i2 = 0, i3 = 0, i5 = 0;
        int nextMultipleOf2 = uglyNumbers[i2] * 2;
        int nextMultipleOf3 = uglyNumbers[i3] * 3;
        int nextMultipleOf5 = uglyNumbers[i5] * 5;
        int nextUgly = 0;
        
        for(int i = 1; i<n; i++) {
            nextUgly = min(nextMultipleOf2, nextMultipleOf3, nextMultipleOf5);
            // System.out.println(Arrays.asList(nextMultipleOf2, nextMultipleOf3, nextMultipleOf5));
            uglyNumbers[i] = nextUgly;
            
            if(nextUgly == nextMultipleOf2) {
                i2++;
                nextMultipleOf2 = uglyNumbers[i2] * 2;
            }
            if(nextUgly == nextMultipleOf3) {
                i3++;
                nextMultipleOf3 = uglyNumbers[i3] * 3;
            }
            if(nextUgly == nextMultipleOf5) {
                i5++;
                nextMultipleOf5 = uglyNumbers[i5] * 5;
            }
                
        }
        
        return uglyNumbers[n-1];
        
    }
    
    public static boolean isUgly(int num) {
        while(num % 2 == 0) {
            num /= 2;
        }
        
        while(num % 3 == 0) {
            num /= 3;
        }
        
        while(num % 5 == 0) {
            num /= 5;
        }
        
        return num == 1;
    }
    
    public static int min(int a, int b, int c) {
         return Math.min(a, Math.min(b, c));
    }
    
    public static void main(String[] args) {
        // Print first 10 Ugly Numbers
        System.out.println("Print first 10 Ugly Numbers using Naive Approach");
        for(int i=1; i<= 10; i++)
            System.out.print(uglyNumberNaive(i) + " ");
        System.out.println();
        
        // Print first 10 Ugly Numbers
        System.out.println("Print first 10 Ugly Numbers using DP Approach");
        for(int i=1; i<= 10; i++)
            System.out.print(uglyNumber(i) + " ");
        System.out.println();
    }
}