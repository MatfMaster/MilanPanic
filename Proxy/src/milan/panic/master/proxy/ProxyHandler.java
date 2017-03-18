package milan.panic.master.proxy;

import java.lang.reflect.Method;

/**
 * Zastupnik će koristiti ovaj interfejs za sve metode koje bude zastupao.
 */
public interface ProxyHandler {
	public Object invoke(Object proxy, Method method,
			Object[] args) throws Throwable;
}
