package com.June19;

public class Lesson3 {

	public static void main(String[] args) throws Exception {
		/*
		 * throw
		 * �����׳��쳣
		 * 
		 */
		int a[]={4,5,6};
		try{
			System.out.println(a[5]);
		}catch (ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.fillInStackTrace());
			
			throw new Exception("��ĸ����Ϊ0");
		}
	}

}
