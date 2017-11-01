package com.tbtx.learnDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 动态代理的调用处理器
 * @author wuqi
 *
 */
public class MyInvocationHandler implements InvocationHandler {
	
	private ElectricCar car;
	
	public MyInvocationHandler(ElectricCar car){
		this.car = car;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		//前增强
		System.out.println(method.getName() + "目标方法执行之前进行增强...");
		
		Object obj = method.invoke(car, args);
		
		//后增强
		System.out.println(method.getName() + "目标方法执行之后进行增强...");
		
		return obj;
	}

}
