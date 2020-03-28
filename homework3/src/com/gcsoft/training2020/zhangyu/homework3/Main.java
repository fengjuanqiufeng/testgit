package com.gcsoft.training2020.zhangyu.homework3;
/**
 * 运行类
 * 
 * tree():  1.请用面向对象的方法，生成一定数量的类，来描述一组你周边的事物。果树。
 * shape(): 2.对于平面图形(shape)，都拥有面积（square）和周长(circumference)两个属性，
 * 			  而且对于不同的图形，如圆形（circle）、正方形（square）、三角形（triangle）、长方形：（rectangle）、都有各自的面积以及周长的计算方法
 * 
 * @author Admin
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.果树类
		tree();
		System.out.println();
		System.out.println();
		
		//2.平面图形类
		shape();
		System.out.println();
		System.out.println();
		
		//3.立体图形
		rightPrism();
	}
	
	/**
	 * 创建桃树peach、杏树apricot对象
     * 分别调用flower()、fruit()方法
	 */
	public static void tree() {
		Peach peach = new Peach("生", 10, 2.4f);//创建桃树peach对象
		peach.flower();
		peach.fruit();
		
		System.out.println();
		Apricot apricot = new Apricot("死", 14, 3.5f);//创建杏树apricot对象
		apricot.flower();
		apricot.fruit();
	}
	
	/**
	 * 创建圆形、三角形、长方形、正方形对象
	 */
	public static void shape() {
		Shape circle = new Circle(4);//创建圆形对象
		System.out.println();
		
		Shape triangle = new Triangle(3, 4, 5, 4);//创建三角形对象
		System.out.println();
		
		Shape rectangle = new Rectangle(3, 2);//创建长方形对象
		System.out.println();
		
		Shape square = new Square(3);//创建正方形对象
		
	}
	
	/**
	 * 创建圆柱体、三棱柱、长方体、正方体对象
	 */
	public static void rightPrism() {
		RightPrism cylinder = new CircularCylinder(10, new Circle(4));
		System.out.println();
		
		RightPrism triprism = new TriangularPrism(10, new Triangle(3, 4, 5, 4));
		System.out.println();
		
		RightPrism rectprism = new RectanglePrism(10, new Rectangle(3, 4));
		System.out.println();
		
		RightPrism cube = new Cube(10, new Square(10));
	}
}
