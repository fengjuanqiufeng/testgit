package com.gcsoft.training2020.zhangyu.homework3;
/**
 * �����ࣺ����������
 * 
 * @author Admin
 *
 */
public class Peach extends FruitTree {

	public Peach(String state, int age, float high) {
		super(state, age, high);
		System.out.println("�����������������" + this.state + "�ģ�����" + this.age + "���ˣ������" + this.high + "�ס�");
	}
	@Override
	public void flower() {
		System.out.println("�������һ�");
	}
	
	@Override
	public void fruit() {
		System.out.println("����������");
	}
}
