package com.gcsoft.training2020.zhangyu.homework3;
/**
 * �����ࣺ����������
 * @author Admin
 *
 */
public class Apricot extends FruitTree {

	public Apricot(String state, int age, float high) {
		super(state, age, high);
		System.out.println("�����������������" + this.state + "�ģ�����" + this.age + "���ˣ������" + this.high + "�ס�");
		// TODO Auto-generated constructor stub
	}
	@Override
	public void flower() {
		System.out.println("�������ӻ�");
	}
	
	@Override
	public void fruit() {
		System.out.println("����������");
	}
}
