package milan.panic.master.joinpoints;

import milan.panic.master.common.ExampleClass;

public class Caller1 {
	// Aspektni kod defini�e se oko poziva metoda
	public void callMethod1(ExampleClass exampleClass) {
		// Before savet izvr�ava se pre poziva metoda
		exampleClass.exampleMethod();
		// After savet izvr�ava se poziva metoda
	}
}
