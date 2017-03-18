package milan.panic.master.dependancy.injection;

/**
 * Aplikacije koje koriste princip umetanja zavisnosti konceptualno
 * treba da poseduju mesto(idealno samo jedno) u kodu, modul tzv.
 * umetač zavisnosti, najčešće programski okvir(eng. framework) oko
 * aplikacije, gde se konkretne implementacije servisa umeću u kod i
 * pokreću ostale module programa.
 */
public class Injector {

	/**
	 * Trivijalna implementacija umetača zavisnosti unutar main metoda
	 * programa.
	 */
	public static void main(String[] args) {

		Service service = new ServiceImpl();

		ConstructorInjectionClient constructorInjectionClient = new ConstructorInjectionClient(
				service);

		SetterInjectionClient setterInjectionClient = new SetterInjectionClient();
		setterInjectionClient.setService(service);

		/**
		 * Glavna prednost umetanja zavisnosti preko interfejsa jeste
		 * što umetač ne mora da vodi računa o tipu objekta kome umeće
		 * zavisnost, već dohvata objekat ako je instanca interfjesa.
		 * Mana je to što objekti potencijalno mogu da zavise od mnogo
		 * servisa što može dovesti do zabune i prljanja koda.
		 */
		ServiceSetter serviceSetter = new InterfaceInjectionClient();
		serviceSetter.setService(service);
	}
}
