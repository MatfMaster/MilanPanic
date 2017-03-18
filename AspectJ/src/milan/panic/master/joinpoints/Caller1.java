package milan.panic.master.joinpoints;

import milan.panic.master.common.ExampleClass;

public class Caller1 {
	// Aspektni kod definiše se oko poziva metoda
	public void callMethod1(ExampleClass exampleClass) {
		// Before savet izvršava se pre poziva metoda
		exampleClass.exampleMethod();
		// After savet izvršava se poziva metoda
	}
}
