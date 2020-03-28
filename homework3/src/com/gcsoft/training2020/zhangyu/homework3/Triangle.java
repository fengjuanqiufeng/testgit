package com.gcsoft.training2020.zhangyu.homework3;
/**
 * 三角形Triangle
 * 
 * 三边：a、b、c
 * 以a为底边的高：h
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
		Square = calcSquare();//面积
		Circumference = calcCircumference();//周长
		System.out.println("三角形:三条边分别为：" + a + "、" + b + "、" + c + "；面积S=" + Square + "；周长C=" + Circumference);
	}
	/*
	 * 求面积
	 */
	@Override
	public double calcSquare() {
		// TODO Auto-generated method stub
		double calc;
		calc = a * h * 0.5;
		return calc;
	}
	
	/*
	 * 求周长
	 */
	@Override
	public double calcCircumference() {
		// TODO Auto-generated method stub
		double calc;
		calc= a + b + c;
		return calc;
	}

}
