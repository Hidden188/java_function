package com.June06;

public class Lesson4{

public static void main(String[] args){
int a=4;
float b=2f;
char c='c';

//��ϵ����
System.out.println("��ϵ����");
System.out.println("a==b  " +(a==b));
System.out.println("a!=b  " +(a!=b));
System.out.println("a>b  " +(a>b));
System.out.println("a<b  " +(a<b));
System.out.println("a!=c  " +(a!=c));
System.out.println("a==c  " +(a==c));

//�߼�����
System.out.println("�߼�����");
System.out.println("(a==b)&&(a!=c)  " +((a==b)&&(a!=c)));
System.out.println("(a!=c)&&(a==b)  " +((a!=c)&&(a==b)));
System.out.println("(a!=b)&&(a!=c)  " +((a!=b)&&(a!=c)));
System.out.println("(a<b)&&(a==b)  " +((a<b)&&(a==b)));
System.out.println("(a!=b)||(a!=c)  " +((a!=b)||(a!=c)));
System.out.println("(a>b)||(a==b)  " +((a>b)||(a==b)));
System.out.println("(a==b)||(a>b)  " +((a==b)||(a>b)));
System.out.println("(a<b)||(a==b)  " +((a<b)||(a==b)));
System.out.println("a>b  " +(a>b));
System.out.println("a<b  " +(a<b));
System.out.println("a!=c  " +(a!=c));
System.out.println("a==c  " +(a==c));
}}