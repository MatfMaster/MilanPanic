package milan.panic.master.joinpoints;

import milan.panic.master.common.ExampleClass;

public class Caller2 {
	public void callMethod1(ExampleClass exampleClass) {
		// Potpuno nova tačka spajanja koja može, ali ne mora biti, obuhvaćena
		// aspektom
		exampleClass.exampleMethod();
	}
}
