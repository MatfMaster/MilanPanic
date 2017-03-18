package milan.panic.master.proxy;

/** Trivijalna implementacija zastupnika jednog interfejsa. */
public class ManualProxy implements Interface {

	private Interface interfaceInstance;

	public ManualProxy(Interface interfaceInstance) {
		this.interfaceInstance = interfaceInstance;
	}

	/**
	 * Zastupnik zadržava istu komunikaciju kao i originalni objekat.
	 */
	@Override
	public Object method() {
		/**
		 * Implementacija metode koja se zastupa je proizvoljna, može
		 * da uključi poziv originalnog metoda objekta koji se
		 * zastupa, a i ne mora, što dovodi do toga da se u domenu
		 * aspektno orijentisanog programiranja metod zastupnika
		 * ponaša kao around savet unutar aspektno orijentisanog
		 * programiranja:
		 */
		/** Dodatna logika pre poziva originalnog metoda */
		/** Opcioni poziv originalnog metoda */
		Object returnValue = interfaceInstance.method();
		/** Dodatna logika posle poziva originalnog metoda */

		/**
		 * Povratna vrednost mora biti istog tipa, komunikacija ostaje
		 * ista.
		 */
		return returnValue;
	}

}
