package com.gcsoft.training2020.zhangyu.homework3;
/**
 * ������ Square
 * @author Admin
 *
 */
public class Square extends Rectangle {
	double a;
	public Square(double a) {
		super();
		this.a = a;
		Square = calcSquare();//���
		Circumference = calcCircumference();//�ܳ�
		System.out.println("������:�߳�Ϊ��" + a + "�����S=" + Square + "���ܳ�C=" + Circumference);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * �����
	 */
	@Override
	public double calcSquare() {
		// TODO Auto-generated method stub
		double calc;
		calc = a * a;
		return calc;
	}

	/*
	 * ���ܳ�
	 */
	@Override
	public double calcCircumference() {
		// TODO Auto-generated method stub
		double calc;
		calc= a * 4;
		return calc;
	}

}
