package com.gcsoft.training2020.zhangyu.homework3;
/**
 * 长方形Rectangle
 * 
 * 长：a
 * 宽：b
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
		Square = calcSquare();//面积
		Circumference = calcCircumference();//周长
		System.out.println("长方形:长和宽分别为：" + a + "、" + b + "；面积S=" + Square + "；周长C=" + Circumference);
	}
	/*
	 * 求面积
	 */
	@Override
	public double calcSquare() {
		// TODO Auto-generated method stub
		double calc;
		calc = a * b;
		return calc;
	}

	/*
	 * 求周长
	 */
	@Override
	public double calcCircumference() {
		// TODO Auto-generated method stub
		double calc;
		calc = (a + b) * 2;
		return calc;
	}

}
