package com.June17;

import java.util.Scanner;

public class work00 {

	public static void main(String[] args) {
		System.out.println("�����������ַ�����");
		String s1 = new Scanner(System.in).nextLine();
		String s2 = new Scanner(System.in).nextLine();
		System.out.println("��һ���ַ��������Ϊ:" + sortString(s1));
		System.out.println("�ڶ����ַ��������Ϊ:" + sortString(s2));
		StringBuilder s = new StringBuilder();
		System.out.println("�����ַ�������֮�������Ϊ:" + sortString(s.append(s1).append(s2).toString()));
	}

	public static String sortString(String str) {
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i > 0; i--)
			for (int j = 0; j < i; j++)
				if (ch[i] < ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
		return new String(ch);
	}
}
