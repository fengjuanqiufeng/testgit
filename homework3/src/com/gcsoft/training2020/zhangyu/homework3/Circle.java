package com.gcsoft.training2020.zhangyu.homework3;
/**
 * Բ��Circle
 * 
 * �뾶��r
 * Բ���ʣ�PI
 * @author Admin
 *
 */
public class Circle extends Shape {
	public static final double PI = 3.14;
	double r;
	public Circle() {
		System.out.println();
	}
	public Circle(double r) {
		this.r = r;
		Square = calcSquare();//���
		Circumference = calcCircumference();//�ܳ�
		System.out.println( "Բ�ΰ뾶Ϊ��" + r + "�����S=" + Square + "���ܳ�C=" + Circumference);
	}
	/*
	 * �����
	 */
	@Override 
	public double calcSquare() {
		double calc;
		calc = PI * r * r;
		return calc;
		// TODO Auto-generated method stub
		
	}

	/*
	 * ���ܳ�
	 */
	@Override
	public double calcCircumference() {
		double calc;
		calc = 2 * PI * r;
		return calc;
		// TODO Auto-generated method stub

	}

}
