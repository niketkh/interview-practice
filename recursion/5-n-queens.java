// "static void main" must be defined in a public class.
public class Main {
    
    public static void solveNQueens(int n, int row, List<Integer> colPlacement, 
                                    List<List<Integer>> result) {
        if(row == n) {
            // All queens are legally placed
            result.add(new ArrayList<>(colPlacement));
        }
        else {
            for(int col=0; col<n; col++) {
                colPlacement.add(col);
                if(isValid(colPlacement)) {
                    solveNQueens(n, row + 1, colPlacement, result);
                }
                colPlacement.remove(colPlacement.size() - 1);
            }
        }
    }
    
    public static boolean isValid(List<Integer> colPlacement) {
        int rowID = colPlacement.size() - 1;
        for(int i=0; i<rowID; i++) {
            int diff = Math.abs(colPlacement.get(i) - colPlacement.get(rowID));
            if(diff == 0 || diff == rowID - i) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        solveNQueens(8, 0, new ArrayList<Integer>(), result);
        System.out.println(result);
        System.out.println(result.size());
    }
   
}