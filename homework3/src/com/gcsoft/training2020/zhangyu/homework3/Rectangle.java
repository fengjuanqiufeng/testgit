package com.gcsoft.training2020.zhangyu.homework3;
/**
 * ������Rectangle
 * 
 * ����a
 * ��b
 * @author Admin
 *
 */
public class Rectangle extends Shape {
	double a;
	double b;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
		Square = calcSquare();//���
		Circumference = calcCircumference();//�ܳ�
		System.out.println("������:���Ϳ�ֱ�Ϊ��" + a + "��" + b + "�����S=" + Square + "���ܳ�C=" + Circumference);
	}
	/*
	 * �����
	 */
	@Override
	public double calcSquare() {
		// TODO Auto-generated method stub
		double calc;
		calc = a * b;
		return calc;
	}

	/*
	 * ���ܳ�
	 */
	@Override
	public double calcCircumference() {
		// TODO Auto-generated method stub
		double calc;
		calc = (a + b) * 2;
		return calc;
	}

}
