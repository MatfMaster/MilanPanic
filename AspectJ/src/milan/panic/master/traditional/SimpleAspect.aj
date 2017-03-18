package milan.panic.master.traditional;

import milan.panic.master.common.ReturnType;
import milan.panic.master.common.SomeInterface; 
import milan.panic.master.common.ExampleClass;
 
/** Definicija aspekta */
public aspect SimpleAspect {
	/** Definicija ta�?ke preseka */
	pointcut PointcutName() : execution(* *.*(..));

	/**
	 * Definicija saveta - jedne od najvažnijih konstrukcija koje dodaje ili
	 * menja ponašanje u ta�?kama preseka. Mogući tipovi saveta su:
	 */
	before() : PointcutName() {
		/** Telo saveta se izvršava pre ta�?ke preseka. */
	}
	after() returning: PointcutName(){
		/**
		 * Telo saveta se izvršava nakon izvršenja koda koji je definisan ta�?kom
		 * preseka, ali samo ukoliko se nije dogodio izuzetak.
		 */
	}
	after() throwing: PointcutName(){
		/**
		 * Telo saveta se izvršava nakon izvršenja koda koji je definisan ta�?kom
		 * preseka, ali samo ukoliko se dogodio izuzetak.
		 */
	}
	after(): PointcutName() {
		/**
		 * Telo saveta se izvršava nakon izvršenja koda koji je definisan ta�?kom
		 * preseka. Objedinjuje after returning i after throwing savet.
		 */
	}
//	ReturnType around() : PointcutName(){
//		/**
//		 * Savet koji potpuno okružuje ta�?ku preseka i daje mogućnost izvršenja
//		 * proizvoljnog koda oko ta�?ke preseka. Savet around() ima i povratnu
//		 * vrednost koja predstavlja povratnu vrednost koda ta�?ke preseka koji
//		 * je u�?auren. Kod ta�?ke preseka se, ukoliko se to želi, izvršava
//		 * pozivanjem specijalne funkcije proceed().
//		 */
//		return proceed();
//	}
	declare precedence: Aspect1, Aspect2;
	/** Definicija konstrukcija koje menjaju stati�?ku strukturu programa: */
	/** 1.Dodavanje definicije interfejsa klasi */
	//declare parents: SomeClass implements SomeInterface;
	/** 2.Dodavanje atributa klasi */
//	private long SomeClass.additionalAttribute;
	/** 3.Dodavanje metoda klasi */
//	public ReturnType SomeClass.additionalMethod() {
//		return null;
//	}
}
