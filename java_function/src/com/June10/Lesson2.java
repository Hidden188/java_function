package com.June10;

public class Lesson2 {
	
	
	private int a=88;
	public int year=2313;
	
	private void test1(int a){
		System.out.println("test1 a=" +a);
		a=9;
		System.out.println("test1 a1=" +a);
	}
	
	private void test2(Test t){
		System.out.println("test2 c="+t.c);
		t.c=33;
		System.out.println("test2 c=" +t.c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	 *��������
	 *ָ��һ��������java�У����˻������ͣ������������� 
	 * 
	 */
		
		int b=77;
		Lesson2 l2=new Lesson2();//l2���������͵ı�����
		/*
		 * ˼���⣺java����ֵ���ݻ������ô��ݣ��α���˵��ֵ����
		 * ֵ���ݣ����ݵĲ���ֵ�ǣ�����ֵ�ĸ��ƣ�����˵������֮������ֵ����������
		 * �������ʹ���Ҳ��ֵ�����ڴ�ռ��ַ��ֵ
		 * ����java�ǰ���ֵ����
		 */
		
		int a=99;
		l2.test1(a);
		System.out.println("test1 a=" +a);//�˴�a=99����Ϊ��һ�е�a��ֵֻ�ǰ�99��ֵ��ȥ
		
		Test t=new Test();
		
		t.c=77;
		
		Test t2=new Test();
		t=t2;
		t2.c=3;
		System.out.println("t֮��="+t.c);
		
		l2.test2(t);
		System.out.println("main c=" +t.c);
		
		
		
	}

}
