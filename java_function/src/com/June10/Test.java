package com.June10;

public class Test {
	int c=9;
	
	//���췽������дvoid����û���κη���ֵ
	public Test(){
		//this��Ϊ������������ʼ������
		this(9);
		//this�൱�ڷ�������
		this.test1();//����ǰ����
		System.out.println("�����޲ι��췽��");
	}
	
	public Test(int a){
		System.out.println("�����вι��췽��");
	}
	
	public void test1(){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		Test t2=new Test(4);
		
	}

}
