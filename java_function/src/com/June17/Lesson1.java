package com.June17;

public class Lesson1 {

	public static void main(String[] args) {
		{//��һ�ڿ�
			String name = "  �ٸ����԰ lin gang  di shui hu  ";
			String name2 = "����44";
			System.out.println(name.length());
			System.out.println(name.charAt(2));
			System.out.println(name.trim());
			System.out.println(name);
			System.out.println(name.compareTo("hidde"));
			System.out.println(name.concat("hidden"));
			System.out.println(name.hashCode());
			// name="shanghaihaiyang university";
			// System.out.println(name.hashCode());
			System.out.println(name.contains(name));
			System.out.println(name.indexOf("li"));
			System.out.println(name.endsWith(" "));
			System.out.println(name.startsWith(" "));
			System.out.println(name.substring(2));
			System.out.println(name2 == name.intern());
			System.out.println(name.replace("i", "o"));
			String[] temp = name.split(" ");
			System.out.println(temp);
			for (String i : temp) {
				System.out.println(i);
			}
			System.out.println(name.toString());
			String x = String.valueOf("2+3");
			System.out.println(x);
		}
		
		{//�ڶ��ڿ�
			String s="good";
			s="good day";
			//���ַ��������Ƚ϶�ʱ��StringBuilder
			StringBuilder sd=new StringBuilder();
			sd.append("Bless you buffer");
			System.out.println();
		}
		
	}
}
