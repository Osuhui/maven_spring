package com.huiwl.util.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.huiwl.service.AopService;

public class MyProxy {

	/**
	 * JDK动态代理 :实现类必须要有接口
	 * 
	 */
	public static AopService getProxy(final AopService aopService) {

		ClassLoader loader = aopService.getClass().getClassLoader();
		Class<?>[] interfaces = aopService.getClass().getInterfaces();
		// 方法执行器
		InvocationHandler h = new InvocationHandler() {

			/**
			 * Object proxy：代理对象 Method method：目标方法 Object[] args：目标方法的参数
			 */
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

				System.out.println("JDK动态代理");
				Object result = method.invoke(aopService, null);
				return result;
			}
		};
		Object proxy = Proxy.newProxyInstance(loader, interfaces, h);
		return (AopService) proxy;

	}

}
