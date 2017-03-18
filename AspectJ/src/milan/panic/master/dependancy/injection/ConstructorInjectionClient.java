package milan.panic.master.dependancy.injection;

public class ConstructorInjectionClient {

	private Service service;

	/**
	 * Konstruktorski princip umetanja zavisnosti: Objekat se kreira
	 * konstruktorom čiji su parametri svi interfejsi servisa od kojih
	 * zavisi, a prilikom pozivanja konstruktora proseđuju se
	 * konkretni tipovi servisa.
	 */
	public ConstructorInjectionClient(Service service) {
		this.service = service;
	}

}
