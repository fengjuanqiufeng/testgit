package com.gcsoft.training2020.zhangyu.homework3;
/**
 * 正方形 Square
 * @author Admin
 *
 */
public class Square extends Rectangle {
	double a;
	public Square(double a) {
		super();
		this.a = a;
		Square = calcSquare();//面积
		Circumference = calcCircumference();//周长
		System.out.println("正方形:边长为：" + a + "；面积S=" + Square + "；周长C=" + Circumference);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * 求面积
	 */
	@Override
	public double calcSquare() {
		// TODO Auto-generated method stub
		double calc;
		calc = a * a;
		return calc;
	}

	/*
	 * 求周长
	 */
	@Override
	public double calcCircumference() {
		// TODO Auto-generated method stub
		double calc;
		calc= a * 4;
		return calc;
	}

}
