package com.June11;

public class Lesson1 {
	int a=99;//����ʵ������
	static float b=88;//�༶��
	private double c=55;//����ʵ������
	
	static void test(float a){
		int g=77;//��������
		a=4;//��������
	}
	
	static void test2(Test t){
		t.name="t de breakfast";//��������
	}
	
	{
		int r=90;//�鼶��
		a=8;//����ʵ������
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*�βκ�ʵ��
		 * �βΣ����巽����ʱ��������ʶ�����������
		 * ʵ�Σ����÷�����ʱ��ʵ�ʴ���������ֵ
		 * 1.�βκ�ʵ�Σ����ͱ���һ�£����߷�������ת������
		 * 2.�β��ǻ������ͣ����÷�����ʱ����ֵ���ݡ�����ִ�е�ʱ���βκ�ʵ���ǲ�ͬ�ı������洢�ڲ�ͬ���ڴ�λ�á�����������ʱ���βλᱻ�ͷ�,ʵ�β����ܵ�Ӱ�졣
		 * 3.�β����������ͣ����÷�����ʱ�򣬴��ݵ����ڴ��ַ��ֵ
		 * 
		 */
		int a=7;//�������double�Ͳ�������//a���ھֲ���������������
		Lesson1 l1=new Lesson1();//��������
		System.out.println("a1=" +l1.a);//static�����ﲻ��ֱ����this����Ҫͨ���������
		test(a);
		System.out.println("a=" +a);
		
		Test t1=new Test();//��������
		t1.name="t1 de breakfast";
		test2(t1);
		System.out.println("name=" +t1.name);
		
		/*�����ķ�Χ
		 * 1.�༶��:ȫ�ֱ������������֮ǰ�Ѿ����ڡ���static���ε�
		 * 2.����ʵ�����𣺳�Ա������ʵ��������
		 * 3.�������𣺾ֲ��������ڷ������涨���
		 * 4.�鼶�𣺶����ڿ�����ģ��������������ھ�������飬��������飬�����ͱ�ע����
		 * 
		 */
	}

}
