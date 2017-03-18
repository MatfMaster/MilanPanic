package milan.panic.master.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import milan.panic.master.dependency.injection.ConstructorInjectionClient;
import milan.panic.master.dependency.injection.Service;
import milan.panic.master.dependency.injection.SetterInjectionClient;

/** Spring automatsko umetanje zavisnosti */
public class SpringProgram {
	/**
	 * ApplicationContext je centralna klasa unutar Spring projekta i
	 * predstavlja kontainer koji sadrži sve kreirane, povezane Spring
	 * objekte dobijene od predefinisanih metapodataka korišćenjem
	 * umetanja zavisnosti. Valja napomenuti da će Spring sve objekte
	 * kreirati kao singltone ukoliko nije drugačije navedeno u
	 * konfiguraciji.
	 */
	static ApplicationContext springContainer;

	public static void xmlDependancyInjection() {
		/**
		 * Učitavanje metapodataka i kreiranje Spring kontainera preko
		 * konfiguracije definisane unutar xml fajla.
		 */
		springContainer = new ClassPathXmlApplicationContext(
				"dependency-injection.xml");
	}
	public static void annotationDependencyInjection() {
		/**
		 * Učitavanje metapodataka i kreiranje Spring kontainera
		 * konfiguracije definisane unutar klase koja sadrži
		 * specijalne konfiguracion anotacije definisane unutar Spring
		 * projekta.
		 */
		springContainer = new AnnotationConfigApplicationContext(
				SpringConfiguration.class);

	}

	public static void main(String[] args) {
		if (args.length == 1
				&& args[0].equalsIgnoreCase("xml")) {
			xmlDependancyInjection();
		} else {
			annotationDependencyInjection();
		}

		/**
		 * Objekti su automatksi kreirani, umetnute su sve definisane
		 * zavisnosti pri čemu su provereno postojanje svih
		 * zavisnosti, kompatibilnost tipova itd. Odavde na dalje,
		 * moguće je koristiti objekte iz Spring kontainera. Jedan od
		 * načina jeste korišćenja je dohvatanje Spring objekata
		 * eksplicitno na sledeći način:
		 */
		Service springObjectService = (Service) springContainer
				.getBean("service");
		ConstructorInjectionClient springObjectConstructorClient = 
				(ConstructorInjectionClient) springContainer.getBean("constructorClient");
		SetterInjectionClient springObjectSetterClient = 
				(SetterInjectionClient) springContainer.getBean("setterClient");

	}

}