package com.gcsoft.training2020.zhangyu.homework3;
/**
 * 平面图形类：Shape
 * 
 * Square:面积
 * Circumference:周长
 * calcSquare():计算面积方法。
 * calcCircumference（）：计算周长方法。
 * @author Admin
 *
 */
public abstract class Shape {
	double Square;//面积
	double Circumference;//周长

	
	public abstract double calcSquare();
	
	public abstract double calcCircumference();
}
