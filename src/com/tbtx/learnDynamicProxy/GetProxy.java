package com.tbtx.learnDynamicProxy;

import java.lang.reflect.Proxy;

/**
 * 获得电动汽车的代理类
 * @author wuqi
 *
 */
public class GetProxy {

	public static void main(String[] args) {
		//目标类
		ElectricCar car = new ElectricCar();
		//类加载器 代理类通过类加载器将目标类的字节码加载到内存来构建Class对象从而通过反射获取目标类方法的信息
		ClassLoader classLoader = car.getClass().getClassLoader();
		//目标类实现的接口信息 jdk动态代理是通过和目标类实现相同的接口的方式来拥有和目标类具有相同方法的方式
		Class[] interfaces = car.getClass().getInterfaces();
		//调用处理器  调用代理类的方法时，代理类会交由调用处理器去处理。
		MyInvocationHandler h = new MyInvocationHandler(car);
		//获取代理类
		Vehicle vehicleProxy = (Vehicle)Proxy.newProxyInstance(classLoader, interfaces, h);
		RechargeAble rechargeProxy = (RechargeAble)Proxy.newProxyInstance(classLoader, interfaces, h);
		
		//调用代理类的方法
		vehicleProxy.drive();
		System.out.println("=========================");
		rechargeProxy.recharge();
	}

}
