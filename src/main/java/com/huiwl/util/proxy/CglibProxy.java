package com.huiwl.util.proxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import com.huiwl.service.impl.AopServiceImpl;
import com.huiwl.util.advice.LogUtils;

public class CglibProxy {

	private CglibProxy() {

	}

	/**
	 * cglib代理 :底层创建目标类的子类
	 *
	 */
	public static AopServiceImpl createProxy() {

		// 目标类
		final AopServiceImpl aopService = new AopServiceImpl();

		// 切面类
		final LogUtils logUtils = new LogUtils();

		// 核心类
		Enhancer enhancer = new Enhancer();

		// 确定父类
		enhancer.setSuperclass(aopService.getClass());

		enhancer.setCallback(new MethodInterceptor() {

			@Override
			public Object intercept(Object proxy, Method mehtod, Object[] args, MethodProxy methodProxy)
					throws Throwable {

				System.out.println("---------cglib代理---------");
				logUtils.before();

				// 执行目标方法
//				Object ojb = mehtod.invoke(aopService, args);

				// 执行代理类的父类，执行目标类(确定父子关系)
				Object invokeSuper = methodProxy.invokeSuper(proxy, args);

				logUtils.after();
				System.out.println("---------cglib代理---------");
				return invokeSuper;
			}
		});

		return (AopServiceImpl) enhancer.create();

	}

}
