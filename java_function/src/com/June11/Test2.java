package com.June11;

public class Test2 extends Parent {

	private float r = 22;

//	public test2() {
//		super(5);
//		r = 88;
//		System.out.println("��������Ĺ��췽��");
//		showName();
//		super.showName();
//		System.out.println("���������b=" + super.b);
//	}

	public void showName() {
		System.out.println("���������showName����");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t2 = new Test2();
		//t2.test2();
		System.out.println("t2.r=" + t2.r);
		System.out.println("t2.b=" + t2.b);
	}

}
