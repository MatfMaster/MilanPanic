package milan.panic.master.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Primer korišćenja naprednog Spring aspektno orijentisanog sistema.
 */
public class SpringProgram {
	static ApplicationContext springContainer;

	public static void main(String[] args) {
		springContainer = new ClassPathXmlApplicationContext(
				"spring-new-aop.xml");
		/**
		 * Direktno se mora dohvatiti proksi objekat za dalje korišćenje
		 */
		Service service = (Service) springContainer.getBean("service");
		service.serviceMethod();
	}

}