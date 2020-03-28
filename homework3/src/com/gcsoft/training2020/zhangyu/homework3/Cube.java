package com.gcsoft.training2020.zhangyu.homework3;
/**
 * ������ Cube
 * @author Admin
 *
 */
public class Cube extends RightPrism {

	public Cube(double h, Shape shape) {
		super();
		super.h = h;
		super.shape = shape;
		volume = calcVolume(); // ���
		lateralArea = calcLateralArea(); // ���
		System.out.println("�����������" + volume + "���������" + lateralArea);
	}

	/*
	 * �����
	 */
	@Override
	public double calcVolume() {
		double calc = calcSquare() * h;
		return calc;
	}
	
	/*
	 * ������
	 */
	@Override
	public double calcLateralArea() {
		double calc = calcCircumference() * h;
		return calc;
	}

	/*
	 * �����
	 */
	@Override
	public double calcSquare() {
		double calc;
		calc = shape.Square;
		return calc;
		// TODO Auto-generated method stub
		
	}

	/*
	 * ���ܳ�
	 */
	@Override
	public double calcCircumference() {
		double calc = shape.Circumference;
		return calc;
	}

}
