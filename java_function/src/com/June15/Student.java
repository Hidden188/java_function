package com.June15;


/**
 * 4. дһ����������15��ѧ����������ѧ�ţ������� ���Ұ���ѧ���ĳɼ�������� ѧ�ţ� ������ ������
 * @author ¬쿱�������
 *
 */
public class Student {
	private String name;
	private int num;
	private int score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public void inputInfo(Student student[]){
		/*
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<15;i++){
			//student[i] = new Student();
			System.out.println("�����"+(i+1)+"��ѧ��������ѧ�ţ��ɼ�(�ÿո�ֿ�)��");
			student[i].setName(scan.nextLine());
			student[i].setNum(scan.nextInt());
			student[i].setScore(scan.nextInt());
		}
		*/
	}
	
	
	public String toString(){
		
		return "������"+name+" ѧ�ţ�"+num+" �ɼ���"+score;
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		Student[] s = new Student[15];
		
		for(int i=0; i<15;i++){
			s[i].setName("st1_name_"+i);
			s[i].setNum(i+1);
			s[i].setScore(80+i);
			//s[i]=s1;
		}
		s1.inputInfo(s);
		//s1.scoreDownSort(s);
	}

}
