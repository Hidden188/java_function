package com.June10;

public class Lesson1 {

	int a=6;//����ֵ������������ı����г�Ա����
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * this �ؼ��ֵ��÷�
		 * 1.��ȡ��Ա����
		 * 
		 */
		int a=9;
		test3();
		
	}

	//�Ǿ�̬������������������κ����������������Ǿ�̬�������·Ǿ�̬�����������Բ���Ҫnew����ֱ��ͨ���������Ƶ��á�
	public void test(){
		int a=8;
		System.out.println("a=" +a);
		System.out.println("a2=" +this.a);//�˴������˳�Ա����
		test2();
		//test3();
	}
	
	public void test2(){
		System.out.println("test2 a="+a);
	}
	
	/**
	 * ��̬�������÷Ǿ�̬����������newһ������ͨ������ȥ����
	 *���þ�̬������ 
	 *
	 */
	public static void test3(){
		//System.out.println(a);
		//test();
		//���newһ������ ���� ��������=new ���췽��������
		Lesson1 l=new Lesson1();
		l.test();
		l.test2();
		test4();
		l.test4();
	}
	
	public static void test4(){
		System.out.println("It's test4");
	}
}
