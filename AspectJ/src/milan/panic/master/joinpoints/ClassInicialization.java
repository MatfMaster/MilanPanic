package milan.panic.master.joinpoints;

public class ClassInicialization {

	static {
		// Inicijalizacija klase daje pristup statičkom bloku, čak i ukoliko
		// nije eksplicitno definisan, pa može izvršiti i dodatnu
		// inicijalizaciju klase
	}

	// Definisanje aspektnog ponašanja oko statičkih metoda identično je kao i
	// kod nestatičkih metoda, tj. definiše se oko izvršenja i poziva metoda.
	public static void exampleMetod() {

	}
}
