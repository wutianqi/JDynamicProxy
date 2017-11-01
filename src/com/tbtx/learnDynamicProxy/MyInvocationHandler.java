package com.tbtx.learnDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * ��̬����ĵ��ô�����
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
		
		//ǰ��ǿ
		System.out.println(method.getName() + "Ŀ�귽��ִ��֮ǰ������ǿ...");
		
		Object obj = method.invoke(car, args);
		
		//����ǿ
		System.out.println(method.getName() + "Ŀ�귽��ִ��֮�������ǿ...");
		
		return obj;
	}

}
