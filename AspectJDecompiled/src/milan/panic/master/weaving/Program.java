/**Program u kome su utkani saveti */
package milan.panic.master.weaving;

public class Program {
	public static void main(String[] args) {
		new Program();
		/**
		 * Aspektni savet utkan je pre poziva metoda, kao što je
		 * definisano jezikom
		 */
		ExampleAspect.aspectOf().beforeCall();
		/**
		 * Regularan poziv metoda
		 */
		method();
	}

	public static void method() {
		/**
		 * Aspektni savet utkan je pre izvršenja metoda(na početku
		 * izvršenja metoda) kao što je definisano jezikom
		 */
		ExampleAspect.aspectOf().beforeExecution();
		System.out.println("method");
	}
}
