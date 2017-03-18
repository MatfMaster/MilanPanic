/** Xml definicija aspekta. */
package milan.panic.master.spring.aop;

/**Definicija tačke spajanja iz AspectJ projekta. */
import org.aspectj.lang.JoinPoint;

/**
 * Aspekt se definiše kao najobičniji objekat(registruje se kao Spring
 * objekat). On služi samo za definisanje metoda koji će služiti kao
 * saveti, kasnije, u xml konfiguraciji se registruje pravi aspekt,
 * tačka preseka i ovaj objekat koristi kao referenca prilikom
 * definisanja saveta. Videti spring-new-aop.xml.
 */
public class XmlAspect {
	public void beforeMethod(JoinPoint joinPoint) {
		System.out.println("Before advice-Xml defined aspect.");
	}
}