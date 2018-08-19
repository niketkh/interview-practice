class Main {
	public static void main(String args[]) {
		Main m1 = new Main();
		Main m2 = new Main();

		// Nullifying reference variable
		m1 = null;

		// Request JVM to run garbage collector
		System.gc();


		// Nullifying reference variable
		m2 = null;

		// Request JVM to run garbage collector
		Runtime.getRuntime().gc();

	}

    // finalize method is called on object once 
    // before garbage collecting it
	@Override
    protected void finalize() throws Throwable
    {
        System.out.println("Garbage collector called");
        System.out.println("Object garbage collected : " + this);
    }
}