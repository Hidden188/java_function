package com.June19;

public class Lesson2 {

	public static void main(String[] args) {
		/*
		 * try,catch,finally�����Ĺ�ϵ
		 * 1.try���ܵ���ʹ�ã���������catch��finally
		 * 2.������Ϸ�ʽ��try catch��try catch finally��try finally
		 * 3.try��������ж��catch�����ϵ��£���Χ����Ӵ�С
		 * 
		 */
		
		//�ǳ����ص��쳣����������Ͳ�Ӧ�ü���ִ��
		try{
			System.out.println("2/0:"+2/0);
		}finally{
			System.out.println("welcome");
		}
		System.out.println("overcome");
		
	}

}
