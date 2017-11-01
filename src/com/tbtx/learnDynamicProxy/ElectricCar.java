package com.tbtx.learnDynamicProxy;
/**
 * 电动汽车
 * @author wuqi
 *
 */
public class ElectricCar implements Vehicle, RechargeAble {

	@Override
	public void recharge() {
		System.out.println("电动汽车充电...");
	}

	@Override
	public void drive() {
		System.out.println("电动汽车可以驾驶...");
	}

}
