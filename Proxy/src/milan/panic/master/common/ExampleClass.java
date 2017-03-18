package milan.panic.master.common;

public class ExampleClass {

	// Aspektni kod smesta kod oko samog tela metoda
	public ReturnType exampleMethod() {
		// Before savet smesta kod pre tela metoda
		return new ReturnType();
		// After savet smesta kod posle tela metoda
	}
	// Aspektni kod smesta kod oko samog tela konstruktora
	public ExampleClass() {
		// Before savet smesta kod pre tela metoda
		// Telo konstruktora
		// After savet smesta kod posle tela metoda
	}

}
