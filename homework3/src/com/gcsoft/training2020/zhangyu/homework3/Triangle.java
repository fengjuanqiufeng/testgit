package com.gcsoft.training2020.zhangyu.homework3;
/**
 * ������Triangle
 * 
 * ���ߣ�a��b��c
 * ��aΪ�ױߵĸߣ�h
 * @author Admin
 *
 */
public class Triangle extends Shape {
	double a;
	double b;
	double c;
	double h;
	
	public Triangle(double a, double b, double c, double h) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.h = h;
		Square = calcSquare();//���
		Circumference = calcCircumference();//�ܳ�
		System.out.println("������:�����߷ֱ�Ϊ��" + a + "��" + b + "��" + c + "�����S=" + Square + "���ܳ�C=" + Circumference);
	}
	/*
	 * �����
	 */
	@Override
	public double calcSquare() {
		// TODO Auto-generated method stub
		double calc;
		calc = a * h * 0.5;
		return calc;
	}
	
	/*
	 * ���ܳ�
	 */
	@Override
	public double calcCircumference() {
		// TODO Auto-generated method stub
		double calc;
		calc= a + b + c;
		return calc;
	}

}
