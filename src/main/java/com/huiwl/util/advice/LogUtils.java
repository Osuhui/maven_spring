package com.huiwl.util.advice;

import java.util.Date;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

/**
 *
 * @author huiweilong
 *MethodInterceptor:环绕通知
 */

@Component
public class LogUtils implements MethodInterceptor {

	public void before() {
		System.out.println("目标方法执行前：" + new Date());
	}

	public void after() {
		System.out.println("目标方法执行后：" + new Date());
	}

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		before();
		// 手动执行目标方法
		Object ojb = invocation.proceed();
		after();
		return ojb;
	}

}
