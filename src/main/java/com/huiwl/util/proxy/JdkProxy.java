package com.huiwl.util.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.huiwl.service.AopService;
import com.huiwl.util.advice.LogUtils;

public class JdkProxy {

	/**
	 * JDK动态代理 :实现类必须要有接口
	 *
	 */
	public static AopService getProxy(final AopService aopService) {

		// 切面类
		final LogUtils logUtils = new LogUtils();

		/*
		 *  类加载器
		 *  1.当前类.MyProxy.class.getClassLoader();
		 *  2.目标实现类.getClass().getClassLoader();
		 */
		ClassLoader loader = aopService.getClass().getClassLoader();

		// 代理类需要实现的所有接口
		Class<?>[] interfaces = aopService.getClass().getInterfaces();
		// 方法执行器
		InvocationHandler h = new InvocationHandler() {

			/**
			 * Object proxy：代理对象
			 * Method method：目标方法 Object[]
			 *  args：目标方法的参数
			 */
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

				System.out.println("---------JDK动态代理---------");

				// 前执行
				logUtils.before();

				Object result = method.invoke(aopService, args);

				// 后执行
				logUtils.after();

				System.out.println("---------JDK动态代理---------");
				return result;
			}
		};
		Object proxy = Proxy.newProxyInstance(loader, interfaces, h);
		return (AopService) proxy;

	}

}
