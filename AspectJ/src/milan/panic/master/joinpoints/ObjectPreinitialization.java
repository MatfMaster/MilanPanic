package milan.panic.master.joinpoints;

import milan.panic.master.common.ExampleClass;

public class ObjectPreinitialization extends ExampleClass {

	public ObjectPreinitialization() {
		// Aspektno ponašanje koje se definiše pre poziva nadkonstruktora
		super();
		// Aspektno ponašanje koje se definiše posle poziva nadkonstruktora

		// Telo konstruktora
	}

	public void exceptionMethod() {
		try {
			// ...
			throw new ExampleException();
		} catch (ExampleException e) {
			// Aspektno ponašanje pre procesiranja izuzetka

			// Procesiranje izuzetka

			// Aspektno ponašanje posle procesiranja izuzetka
		}
	}

}
