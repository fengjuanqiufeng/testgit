package com.gcsoft.training2020.zhangyu.homework3;
/**
 * ������
 * state:����״̬ �� ����
 * age:�������䡣
 * high:������ߡ�
 * FruitTree����:���췽��
 * flower����:��������
 * fruit():�������
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
		System.out.println("����");
	}
	public void fruit() {
		System.out.println("���");
	}
}
