package com.tbtx.learnDynamicProxy;
/**
 * �綯����
 * @author wuqi
 *
 */
public class ElectricCar implements Vehicle, RechargeAble {

	@Override
	public void recharge() {
		System.out.println("�綯�������...");
	}

	@Override
	public void drive() {
		System.out.println("�綯�������Լ�ʻ...");
	}

}
