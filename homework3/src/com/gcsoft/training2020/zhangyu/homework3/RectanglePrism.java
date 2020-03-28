package com.gcsoft.training2020.zhangyu.homework3;
/**
 * 长方体  RectanglePrism
 * @author Admin
 *
 */
public class RectanglePrism extends RightPrism {



	public RectanglePrism(double h, Shape shape) {
		super();
		super.h = h;
		super.shape = shape;
		volume = calcVolume(); // 体积
		lateralArea = calcLateralArea(); // 面积
		System.out.println("长方体体积：" + volume + "；侧面积：" + lateralArea);
	}

	/*
	 * 求体积
	 */
	@Override
	public double calcVolume() {
		double calc = calcSquare() * h;
		return calc;
	}
	
	/*
	 * 求侧面积
	 */
	@Override
	public double calcLateralArea() {
		double calc = calcCircumference() * h;
		return calc;
	}

	/*
	 * 求面积
	 */
	@Override
	public double calcSquare() {
		double calc;
		calc = shape.Square;
		return calc;
		// TODO Auto-generated method stub
		
	}

	/*
	 * 求周长
	 */
	@Override
	public double calcCircumference() {
		double calc = shape.Circumference;
		return calc;
		// TODO Auto-generated method stub

	}

}
