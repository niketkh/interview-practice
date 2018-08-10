// "static void main" must be defined in a public class.
public class Main {
    
    
    public static void main(String[] args) {
        List<Interval> list = new ArrayList<>();
        list.add(new Interval(2, 3));
        list.add(new Interval(1, 2));
        
        Collections.sort(list, new Comparator<Interval>(){
            public int compare(Interval i1, Interval i2) {
                return i1.end.compareTo(i2.end);
            }
        });
        
        System.out.println(list);
    }
   
}

class Interval {
        Integer start, end;
        
        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
        
        public String toString() {
            return "(" + start + "," + end + ")";
        }
}
    