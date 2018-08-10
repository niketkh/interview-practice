// "static void main" must be defined in a public class.
public class Main {
    
    public static void printAll(String str, int l, int r) {
        if(l==r) {
            System.out.println(str);
            return;
        }
        
        for(int i=l; i<=r; i++) {
            str = swap(str, l, i);
            printAll(str, l+1, r);
            str = swap(str, i, l);
        }
        
    }
    
    public static String swap(String str, int a, int b) {
        char array[] = str.toCharArray();
        char temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        
        return String.valueOf(array);
    }
    
    public static void main(String[] args) {
       printAll("ABC", 0, 2);
    }
    
   
}