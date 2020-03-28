package com.gcsoft.training2020.zhangyu.homework3;
/**
 * 桃树类：果树的子类
 * 
 * @author Admin
 *
 */
public class Peach extends FruitTree {

	public Peach(String state, int age, float high) {
		super(state, age, high);
		System.out.println("这棵树是桃树，它是" + this.state + "的，它有" + this.age + "岁了，它身高" + this.high + "米。");
	}
	@Override
	public void flower() {
		System.out.println("桃树开桃花");
	}
	
	@Override
	public void fruit() {
		System.out.println("桃树结桃子");
	}
}
