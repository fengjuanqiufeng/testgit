package com.gcsoft.training2020.zhangyu.homework3;
/**
 * 立体图形 RightPrism
 * 高 h
 * 
 * @author Admin
 *
 */
public abstract class RightPrism extends Shape {
	double h;
	Shape shape; 
	double volume;// 体积
	double lateralArea;// 侧面积
	
	public RightPrism() {}
	public RightPrism(double h, Shape shape) {
		this.h = h;
		
	}
	public abstract double calcVolume(); // 体积公式
	public abstract double calcLateralArea(); // 侧面积公式



}
