package com.gcsoft.training2020.zhangyu.homework3;
/**
 * 杏树类：果树的子类
 * @author Admin
 *
 */
public class Apricot extends FruitTree {

	public Apricot(String state, int age, float high) {
		super(state, age, high);
		System.out.println("这棵树是杏树，它是" + this.state + "的，它有" + this.age + "岁了，它身高" + this.high + "米。");
		// TODO Auto-generated constructor stub
	}
	@Override
	public void flower() {
		System.out.println("杏树开杏话");
	}
	
	@Override
	public void fruit() {
		System.out.println("杏树结杏子");
	}
}
