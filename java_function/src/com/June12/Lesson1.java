package com.June12;

public class Lesson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ���飺��ͬ���͵����ɸ�������ɵļ��ϣ�����ı�������������
		 * ���������ʽ������ ��������[]��
		 * 
		 */
		int a[]={1,2,54,6};//������һ����Ϊa�����飬����洢int��������.���ҳ�ʼ��
		System.out.println(a[3]);
		MyPoint points[];
		
		points=new MyPoint[4];
		MyPoint p1=new MyPoint(1,1);
		MyPoint p2=new MyPoint(2,1);
		MyPoint p3=new MyPoint(3,3);
		MyPoint p4=new MyPoint(4,2);
		
		//��ֵ����������[�±�λ��]=Ҫ����ֵ
		points[0]=p3;
		points[1]=p4;
		points[2]=p1;
		points[3]=p2;
		
		//����ȡֵ����������[�±�λ��]
		System.out.println(points[1].toString());
		
		//����һ�����飬������float
		
		float t[]={1.4f,3.5f,6.5f,9.0f,0.43f};
		System.out.println(t[3]);
		for(int i=0;i<t.length;i++){
			System.out.println("��"+i+"���ǣ�"+t[i]);
		}
		//jdk5.0��ʼ�ṩ�˸��õ�forѭ��д��
		for(float i:t){
			System.out.println(i);
		}
		
		
		
	}

}
