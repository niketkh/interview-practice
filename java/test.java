class Main {

	public static void main(String args[]) {
		String a = "";
		String b = new String("").intern();
		String c = "";

		System.out.println((a==b));
		System.out.println((a.equals(b)));

		System.out.println((a==c));
		System.out.println((b==c));
	}
}