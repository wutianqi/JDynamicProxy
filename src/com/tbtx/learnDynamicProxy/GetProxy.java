package com.tbtx.learnDynamicProxy;

import java.lang.reflect.Proxy;

/**
 * ��õ綯�����Ĵ�����
 * @author wuqi
 *
 */
public class GetProxy {

	public static void main(String[] args) {
		//Ŀ����
		ElectricCar car = new ElectricCar();
		//������� ������ͨ�����������Ŀ������ֽ�����ص��ڴ�������Class����Ӷ�ͨ�������ȡĿ���෽������Ϣ
		ClassLoader classLoader = car.getClass().getClassLoader();
		//Ŀ����ʵ�ֵĽӿ���Ϣ jdk��̬������ͨ����Ŀ����ʵ����ͬ�Ľӿڵķ�ʽ��ӵ�к�Ŀ���������ͬ�����ķ�ʽ
		Class[] interfaces = car.getClass().getInterfaces();
		//���ô�����  ���ô�����ķ���ʱ��������ύ�ɵ��ô�����ȥ����
		MyInvocationHandler h = new MyInvocationHandler(car);
		//��ȡ������
		Vehicle vehicleProxy = (Vehicle)Proxy.newProxyInstance(classLoader, interfaces, h);
		RechargeAble rechargeProxy = (RechargeAble)Proxy.newProxyInstance(classLoader, interfaces, h);
		
		//���ô�����ķ���
		vehicleProxy.drive();
		System.out.println("=========================");
		rechargeProxy.recharge();
	}

}
