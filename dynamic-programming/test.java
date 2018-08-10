import java.util.*;

/* 
    Genrate Pascal Triangle
*/

class Main {
    public static final int MAX = 5;
    // Naive Approach - Recursive 
    // Time Complexity: O(2^n), Space Complexity: O(n)
    public static int binomialCoefficientNaive(int n, int r) {
        if(n == r || r == 0)
            return 1;
        
        return binomialCoefficientNaive(n-1, r-1) + binomialCoefficientNaive(n-1, r);
    }
    
    // DP Approach - Memoization - Top Down
    // Time Complexity: O(n^2), Space Complexity: O(n^2)
    public static List<List<Integer>> binomialCoefficients = new ArrayList<>(MAX + 1);
    public static int binomialCoefficient(int n, int r) {
        
        
        if(n == r || r == 0) return 1;
        
        if(binomialCoefficients.get(n).get(r) != -1) {
            return binomialCoefficients.get(n).get(r);
        }
        
        int coefficient = binomialCoefficient(n-1, r-1) 
                                        + binomialCoefficient(n-1, r);
        binomialCoefficients.get(n).set(r, coefficient);
                                               
        return binomialCoefficients.get(n).get(r);
        
    }
    
    // DP Approach - Tabulation - Bottom Up
    // Time Complexity: O(n^2), Space Complexity: O(n^2)
    public static void binomialCoefficientBU(int n, int r) {
    	
    	binomialCoefficients.get(0).set(0, 1);
    	
    	for(int i = 1; i <= n; i++) {
    		binomialCoefficients.get(i).set(0, 1);
    		binomialCoefficients.get(i).set(i, 1);
    		for(int j = 1; j < i; j++) {
    			int coefficient = binomialCoefficients.get(i-1).get(j-1) + binomialCoefficients.get(i-1).get(j);
    			binomialCoefficients.get(i).set(j, coefficient);
    		}
    	}
    	
    }
    
    
    public static void main(String[] args) {
        System.out.println("Binomial Coefficients - Pascal Triangle - Naive Recursive Approach");
        for(int n = 0; n <= MAX; n++) {
            for(int r = 0; r <= n; r++) 
                System.out.print(binomialCoefficientNaive(n, r) + " ");
            System.out.println();
        }
        
        System.out.println();
        
        // Initialise List of binomial Coefficients
        for(int n=0; n <= MAX; n++) {
            binomialCoefficients.add(new ArrayList<>());
            for(int r=0; r <= n; r++)
                binomialCoefficients.get(n).add(-1);
        }
        
        System.out.println("Binomial Coefficients - Pascal Triangle - DP Memoization Approach");
		for(int n = 0; n <= MAX; n++) {
		    for(int r = 0; r <= n; r++) 
		        System.out.print(binomialCoefficient(n, r) + " ");
		    System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Binomial Coefficients - Pascal Triangle - DP Tabulation Approach");
		binomialCoefficientBU(MAX, MAX);
		for(int n = 0; n <= MAX; n++) {
		    for(int r = 0; r <= n; r++) 
		        System.out.print(binomialCoefficients.get(n).get(r) + " ");
		    System.out.println();
		}
        
    }
}
