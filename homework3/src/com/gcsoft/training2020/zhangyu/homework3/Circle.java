package com.gcsoft.training2020.zhangyu.homework3;
/**
 * 圆形Circle
 * 
 * 半径：r
 * 圆周率：PI
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
		Square = calcSquare();//面积
		Circumference = calcCircumference();//周长
		System.out.println( "圆形半径为：" + r + "；面积S=" + Square + "；周长C=" + Circumference);
	}
	/*
	 * 求面积
	 */
	@Override 
	public double calcSquare() {
		double calc;
		calc = PI * r * r;
		return calc;
		// TODO Auto-generated method stub
		
	}

	/*
	 * 求周长
	 */
	@Override
	public double calcCircumference() {
		double calc;
		calc = 2 * PI * r;
		return calc;
		// TODO Auto-generated method stub

	}

}
