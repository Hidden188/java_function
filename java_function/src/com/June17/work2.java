package com.June17;

public class work2 {

	public static void me(String a, String b) {
		if (a.length() > b.length()) {
			System.out.println(a + "��" + b + "��");
		} else if (a.length() < b.length()) {
			System.out.println(a + "��" + b + "С");
		} else
			System.out.println(a + "����" + b);
	}

	public static void main(String[] args) {
		me("A", "B");
		me("A", "A1");
		me("ABC", "BCD");
	}
}
