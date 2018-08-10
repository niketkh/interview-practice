// "static void main" must be defined in a public class.
public class Main {
    
    public static List<String> generateBalancedParentheses(int numOfPairs) {
        List<String> result = new ArrayList<>();
        directedGenerateBalancedParentheses(numOfPairs, numOfPairs, "", result);
        return result;
    }
    
    public static void directedGenerateBalancedParentheses(int numOfLeftParensNeeded, 
        int numOfRightParensNeeded, String validPrefix, List<String> result) {
        if(numOfLeftParensNeeded == 0 && numOfRightParensNeeded == 0) {
            System.out.println(validPrefix);
            result.add(validPrefix);
            return;
        }
        
        if(numOfLeftParensNeeded > 0) {
            //System.out.println("Calling with " + numOfLeftParensNeeded + " " +    
            // numOfRightParensNeeded + " " + validPrefix);
            directedGenerateBalancedParentheses(numOfLeftParensNeeded - 1, 
                    numOfRightParensNeeded, validPrefix + "(", result);
            
        }
        
        if(numOfLeftParensNeeded < numOfRightParensNeeded) {
             //System.out.println("Calling with " + numOfLeftParensNeeded + " " +    
             // numOfRightParensNeeded + " " + validPrefix);
            directedGenerateBalancedParentheses(numOfLeftParensNeeded, 
                    numOfRightParensNeeded - 1, validPrefix + ")", result);
        }
    }
    
    public static void main(String[] args) {
        generateBalancedParentheses(2);
    }
   
}