package milan.panic.master.proxy;

import java.lang.reflect.Proxy;

/**
 * Kreiranje, odnosno korišćenje zastupnika.
 */
public class ProxyProgram {
	public static void main(String[] args) {
		Interface object = new InterfaceImpl();

		Interface manualProxy = new ManualProxy(object);
		manualProxy.method();

		AdvancedProxy advancedProxy = new AdvancedProxy(object,
				new ProxyHandlerImpl(object));
		advancedProxy.method();

		/**
		 * Univerzalno rešenje podržano od strane Java programskog
		 * jezika za pravljenje zastupaoca: Zastupalac se pravi nad
		 * skupom interfejsa pri čemu se prosleđuje implementacija
		 * presretača svih metoda definisanih interfejsa (slično kao i
		 * unutar AdvanceProxy implementacije) dok eksplicitna
		 * implementacija metoda zastupaoca nije potrebna usled
		 * implementirane podrške za zastupaoca unutar samog
		 * programskog jezika Java.
		 */
		Interface jdkDynamicProxy = (Interface) Proxy
				.newProxyInstance(
						/** Učitavač klasa */
						object.getClass().getClassLoader(),
						/** Skup interfejsa */
						object.getClass().getInterfaces(),
						/** Videti implementaciju klase */
						new JdkInvocationHandlerImpl(object));
		jdkDynamicProxy.method();
	}
}
