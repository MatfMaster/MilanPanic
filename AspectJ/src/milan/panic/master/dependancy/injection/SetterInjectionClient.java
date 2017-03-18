package milan.panic.master.dependancy.injection;

public class SetterInjectionClient {

	private Service service;

	/**
	 * Seterski princip umetanja zavisnosti. Zavisnost se umeće
	 * metodom, mora se obezbediti postojanje svih implementacija
	 * servisa u vreme njihovog korišćenja. Da bi se ovo obezbedilo
	 * najčešće se pozivaju setuju svi servisi u vreme inicijalizacije
	 * objekta, ali ovaj princip daje mogućnost da se naknadno
	 * implementacija servisa promeni.
	 */
	public void setService(Service service) {
		this.service = service;
	}

}
