package com.June06;

/**
 * @author Administrator
 *
 */
public class Lesson5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ֵ����
		int a;
		a=3;
		int b=6;
		b+=a;
		System.out.println("b��ֵ�ǣ�" +b);
		int c=8;
		c-=a;
		System.out.println("c��ֵ�ǣ�" +c);
		int d=9;
		d/=a;
		System.out.println("d��ֵ�ǣ�" +d);
		int e=4;
		e*=a;
		System.out.println("e��ֵ�ǣ�" +e);
		int g=12;
		System.out.println("ʮ�����ƣ�" +Integer.toHexString(g));
		System.out.println("�����ƣ�" +Integer.toBinaryString(g));
		System.out.println("�˽��ƣ�" +Integer.toOctalString(g));
	}

}
