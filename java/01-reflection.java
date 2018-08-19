import java.lang.reflect.Method;
import java.lang.reflect.Field;

class Main {
	public String helloWorld = "Hello World";

	public String helloWorld() {
		return helloWorld;
	}

	public static void main(String args[]) {
		Main main = new Main();

		Class c1 = main.getClass();

		System.out.println("Class Name: " + c1.getName());

		Method methods[] = c1.getDeclaredMethods();

		System.out.println("Methods: ");
		for(Method method: methods) {
			System.out.println(method.getName());
		}

		System.out.println("Fields: ");
		Field f[] = c1.getDeclaredFields();
        for (Field field : f)
            System.out.println(field.getName());


	}
}