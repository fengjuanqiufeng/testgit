package com.gcsoft.training2020.zhangyu.homework3;
/**
 * ������
 * 
 * tree():  1.�����������ķ���������һ���������࣬������һ�����ܱߵ����������
 * shape(): 2.����ƽ��ͼ��(shape)����ӵ�������square�����ܳ�(circumference)�������ԣ�
 * 			  ���Ҷ��ڲ�ͬ��ͼ�Σ���Բ�Σ�circle���������Σ�square���������Σ�triangle���������Σ���rectangle�������и��Ե�����Լ��ܳ��ļ��㷽��
 * 
 * @author Admin
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.������
		tree();
		System.out.println();
		System.out.println();
		
		//2.ƽ��ͼ����
		shape();
		System.out.println();
		System.out.println();
		
		//3.����ͼ��
		rightPrism();
	}
	
	/**
	 * ��������peach������apricot����
     * �ֱ����flower()��fruit()����
	 */
	public static void tree() {
		Peach peach = new Peach("��", 10, 2.4f);//��������peach����
		peach.flower();
		peach.fruit();
		
		System.out.println();
		Apricot apricot = new Apricot("��", 14, 3.5f);//��������apricot����
		apricot.flower();
		apricot.fruit();
	}
	
	/**
	 * ����Բ�Ρ������Ρ������Ρ������ζ���
	 */
	public static void shape() {
		Shape circle = new Circle(4);//����Բ�ζ���
		System.out.println();
		
		Shape triangle = new Triangle(3, 4, 5, 4);//���������ζ���
		System.out.println();
		
		Shape rectangle = new Rectangle(3, 2);//���������ζ���
		System.out.println();
		
		Shape square = new Square(3);//���������ζ���
		
	}
	
	/**
	 * ����Բ���塢�������������塢���������
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
