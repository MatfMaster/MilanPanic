package milan.panic.master.proxy;

import java.lang.reflect.Method;

public class ProxyHandlerImpl implements ProxyHandler {
	private Object obj;
	public ProxyHandlerImpl(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method,
			Object[] args) throws Throwable {
		System.out.println("AdvancedProxy: Additional logic");
		return method.invoke(obj, args);
	}
}
