package aoptest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory implements InvocationHandler {

	private Object tarjectObject;

	public Object creatProxyInstance(Object obj) {
		this.tarjectObject = obj;
		return Proxy.newProxyInstance(this.tarjectObject.getClass()
				.getClassLoader(), this.tarjectObject.getClass()
				.getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		PersonServiceBean serviceBean = (PersonServiceBean) this.tarjectObject;
		Object result = null;
		if (serviceBean.getUser() != null) {
			result = method.invoke(serviceBean, args);
		}
		return result;
	}
}
