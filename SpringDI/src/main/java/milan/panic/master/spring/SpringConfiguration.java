package milan.panic.master.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import milan.panic.master.dependency.injection.ConstructorInjectionClient;
import milan.panic.master.dependency.injection.Service;
import milan.panic.master.dependency.injection.ServiceImpl;
import milan.panic.master.dependency.injection.SetterInjectionClient;

/**
 * Spring učitava metapodatke definisane unutar klase sa
 * predefinisanim Spring anotacijama i od toga pravi gotov sistem. Ova
 * konfiguracije identična je konfiguraciji definisanoj unutar xml
 * fajla.
 */
@Configuration
public class SpringConfiguration {

	/**
	 * Opciono, moguće je eksplicitno definisati ime Spring objekta
	 * preko @Bean(name = "service"), u suprotnom ime metoda koji
	 * kreira objekat postaće ime Spring objekta.
	 */
	@Bean
	public Service service() {
		return new ServiceImpl();
	}

	/**
	 * Konstruktorski tip umetanja zavisnosti.
	 */
	@Bean
	public ConstructorInjectionClient constructorClient() {
		return new ConstructorInjectionClient(service());
	}
	/** Seterski tip umetanja zavisnosti */
	@Bean
	public SetterInjectionClient setterClient() {
		SetterInjectionClient setterClient = new SetterInjectionClient();
		setterClient.setService(service());
		return setterClient;
	}

}
