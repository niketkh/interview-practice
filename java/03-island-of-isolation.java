class Main
{
    Main i;
    public static void main(String[] args)  
    {
        Main m1 = new Main();
        Main m2 = new Main();
          
        // Object of m1 gets a copy of m2
        m1.i = m2;
      
        // Object of m2 gets a copy of m1
        m2.i = m1;
          
        // Till now no object eligible
        // for garbage collection 
        m1 = null;
         
        // now two objects are eligible for
        // garbage collection 
        m2 = null;
         
        // calling garbage collector
        System.gc();

    }
 
    @Override
    protected void finalize() throws Throwable 
    { 
        System.out.println("Finalize method called"); 
    }
}
