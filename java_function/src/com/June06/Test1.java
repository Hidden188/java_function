package com.June06;

import java.util.Arrays;

class Test1 {
	public static void main(String[] args) {
		/*
		 * int
		 * 
		 * grade1=70,grade2=67,grade3=99,grade4=54,grade5=43,grade6=88,grade7=87
		 * ,grade8=98,
		 * 
		 * grade9=89,grade10=86,grade11=84,grade12=100; float sum =
		 * 
		 * grade1+grade2+grade3+grade4+grade5+grade6+grade7+grade8+grade9+
		 * grade10+grade11+g
		 * 
		 * rade12; float avg=sum/12; float qualified=10f; float excellent=7f;
		 * 
		 * System.out.println("ƽ���ɼ��ǣ�" +avg); System.out.println("�������ǣ�"
		 * +(100*qualified/12)+"%"); System.out.println("�������ǣ�"
		 * +(100*excellent/12)+"%"); System.out.println("54�ֵ�û���񣬻���"
		 * +(60-54)+"��"); System.out.println("43�ֵ�û���񣬻���" +(60-43)+"��"); } }
		 * 
		 */
		int grade[] = { 70, 67, 99, 54, 43, 88, 87, 98, 89, 86, 84, 100 };
		float qualified = 0;
		float excellent = 0;
		float sum = 0;
		for (int i = 0; i < grade.length; i++) {
			sum += grade[i];
			if (grade[i] >= 60) {
				qualified++;
			}
			if (grade[i] >= 85)
				excellent++;
			if (grade[i] < 60) {
				System.out.println(grade[i] + "û���񣬻���" + (60 - grade[i]) + "��");
			}
		}
		System.out.println("ƽ���ɼ��ǣ�" + sum / grade.length);
		System.out.printf("�������ǣ�" +"%.2f/n",(100 * qualified / grade.length) + "%");
		System.out.printf("�������ǣ�" +"%.2f/n",(100 * excellent / grade.length) + "%");
	}
}