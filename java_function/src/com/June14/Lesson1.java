package com.June14;

public class Lesson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ð������
		 * 
		 */
		int a[] = new int[30];
		a[0] = 5;
		a[1] = 32;
		a[2] = 94;
		a[3] = 7;
		a[4] = 13;
		a[5] = 5;
		a[6] = 32;
		a[7] = 94;
		a[8] = 7;
		a[9] = 1;
		a[10] = 5;
		a[11] = 32;
		a[12] = 94;
		a[13] = 7;
		a[14] = 1;
		a[15] = 25;
		a[16] = 32;
		a[17] = 94;
		a[18] = 27;
		a[19] = 41;
		a[20] = 58;
		a[21] = 32;
		a[22] = 41;
		a[23] = 73;
		a[24] = 61;
		a[25] = 54;
		a[26] = 32;
		a[27] = 94;
		a[28] = 72;
		a[29] = 0;
		/************ð�ݷ�����****************/
		int sum=0;
		int sum0=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) { // j�ĳ�ʼֵ��i+1
				/*
				 * i=0��ʱ�򣬱�֤���±�0λ����0��4�е���Сֵ i=1��ʱ�򣬱�֤���±�1λ����1��4�е���Сֵ
				 */
				if (a[i] < a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
					sum++;
				}
				sum0++;
			}
		}
		System.out.println("�Ƚϴ���"+sum0);
		System.out.println("��������"+sum);
		// for (int i : a) {
		// System.out.print(i+" ");//10����
		// System.out.printf("%X\n",i+" ");//16����
		// System.out.printf("%0\n",i+" ");//8����

		/**************** ѡ������ ******************/
		int t;
		int sum2=0;
		int sum3=0;
		for (int i = 0; i < a.length; i++) {
			int lindex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[lindex]) {
					lindex = j;
				}
				sum3++;
			}
			sum2++;
			t=a[i];
			a[i]=a[lindex];
			a[lindex]=t;
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("�Ƚϴ���"+sum3);
		System.out.println("��������"+sum2);

		
	}

}