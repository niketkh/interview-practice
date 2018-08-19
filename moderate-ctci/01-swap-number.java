class Main {
	public static void main(String args[]) {
		int a = 5, b = 7;

		System.out.println("Before Swap");
		System.out.println("a: " + a + " b: " + b);

		/*a = a + b; 		
		b = a - b; 		
		a = a - b;*/ 

		// OR

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;		

		System.out.println("After Swap");
		System.out.println("a: " + a + " b: " + b);


	}
}