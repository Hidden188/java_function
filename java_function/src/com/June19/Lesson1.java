package com.June19;

public class Lesson1 {
	Lesson1 l1;
	int a=9;
	
	public static void main(String[] args){
		/*
		 * 1.����һ��������TestAbstract�����󷽷�showName����ͨ����showId
		 * 2.����һ���ӿ�TestInterface1��showAge
		 * 3.����һ���ӿ�TestInterface2��showAge��showName
		 * 4.����һ����ͨ��Test���̳�TestAbstract��ʵ�������ӿ�Testface1��Testface2
		 */
		
		/*
		 * �쳣
		 * ������Ͳ���ִ�г�����
		 * try��
		 * ���ܻᷢ���쳣�Ĵ���
		 * ��catch��Exception e1����
		 * ������ΪException1���쳣����
		 * ��catch��Exception e2����
		 * ������ΪException2���쳣����
		 * ��finally��
		 * finally���ʾ�����ǲ��Ƿ����쳣����������������
		 * ��
		 * 1.try catch����Ƕ�ף������try�Ҳ�����Ӧ��exception catch��ʱ�򣬻�ȥ�����try catch�Ҷ�Ӧ��exception catch
		 * 2.catch��exception���ͷ�Χ�������С����
		 * 
		 */
		int[] test={4,6,87};
		try{
			try{
				System.out.println(test[5]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("�˴��������");
			}
		System.out.println(2/0);
		}catch(ArithmeticException ae){
			System.out.println("��ĸ����Ϊ0");
		}finally{
			/*
			 * finally���ʾ�������Ƿ����쳣���������������롣
			 * 1.�ر��ļ�
			 * 2.�ر����ݿ�����
			 * 3.�ر����ݿ�����
			 * 4.�ͷŶ�̬�ֲ����ڴ�
			 * 
			 */
			System.out.println("finally���ʾ�������Ƿ����쳣���������������롣");
		}
		System.out.println("jing");
	}

}
