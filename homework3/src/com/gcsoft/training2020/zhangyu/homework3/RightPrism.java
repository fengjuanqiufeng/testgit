package com.gcsoft.training2020.zhangyu.homework3;
/**
 * ����ͼ�� RightPrism
 * �� h
 * 
 * @author Admin
 *
 */
public abstract class RightPrism extends Shape {
	double h;
	Shape shape; 
	double volume;// ���
	double lateralArea;// �����
	
	public RightPrism() {}
	public RightPrism(double h, Shape shape) {
		this.h = h;
		
	}
	public abstract double calcVolume(); // �����ʽ
	public abstract double calcLateralArea(); // �������ʽ



}