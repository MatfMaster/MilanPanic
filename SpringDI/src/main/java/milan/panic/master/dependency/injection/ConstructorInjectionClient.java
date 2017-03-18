package milan.panic.master.dependency.injection;

public class ConstructorInjectionClient {

	private Service service;

	/**
	 * Konstruktorsi princip umetanja zavisnosti: Objekat se kreira
	 * konstruktorom Ä?iji su parametri svi interfejsi servisa od kojih zavisi, a
	 * prilikom pozivanja konstruktora proseÄ‘uju se konkretni tipovi servisa.
	 */
	public ConstructorInjectionClient(Service service) {
		this.service = service;
	}

	/** ------------- Object logic --------------------- */
}
