package milan.panic.master.dependency.injection;

/**
 * Aplikacije koje koriste princip umetanja zavisnosti konceptualno
 * treba da poseduju mesto(idealno samo jedno) u kodu, modul tzv.
 * umeta�? zavisnosti, naj�?ešće programski okvir(eng. framework) oko
 * aplikacije, gde se konkretne implementacije servisa umeću u kod i
 * pokreću ostale module programa.
 */
public class SimpleInjector {

	/**
	 * Trivijalna implementacija umeta�?a zavisnosti unutar main metoda
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
		 * što umeta�? ne mora da vodi ra�?una o tipu objekta kome umeće
		 * zavisnost, već dohvata objekat ako je instanca interfjesa.
		 * Mana je to što objekti potencijalno mogu da zavise od mnogo
		 * servisa što može dovesti do zabune i prljanja koda.
		 */
		ServiceSetter serviceSetter = new InterfaceInjectionClient();
		serviceSetter.setService(service);
	}
}
