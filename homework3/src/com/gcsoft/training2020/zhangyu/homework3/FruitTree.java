package com.gcsoft.training2020.zhangyu.homework3;
/**
 * 果树类
 * state:树的状态 生 死。
 * age:树的年龄。
 * high:树的身高。
 * FruitTree（）:构造方法
 * flower（）:果树开花
 * fruit():果树结果
 * @author Admin
 *
 */
public class FruitTree {
	String state; 
	int age;
	float high;
	public FruitTree(String state, int age, float high) {
		this.state = state;
		this.age = age;
		this.high = high;
	}
	public void flower() {
		System.out.println("开花");
	}
	public void fruit() {
		System.out.println("结果");
	}
}
