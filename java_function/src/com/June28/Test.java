package com.June28;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		User[] arrayUsers=new User[10];//����
		List lUser=new ArrayList<User>();
		for(int i=0;i<10;i++){
			User user=new User();
			user.setName("test"+i);
			user.setSex("F");
			lUser.add(user);
		}
		User user1=new User();
		user1.setId(15);
		lUser.add(1, user1);
		lUser.remove(0);
		
		lUser.clear();
		
		System.out.println(lUser.size());
		for(int i=0;i<lUser.size();i++){
			int id=((User)lUser.get(i)).getId();
			String name=((User)lUser.get(i)).getName();
			System.out.println(id);
			System.out.println(name);
		}
		
		//����List�ķ���
		Iterator<User> it=lUser.iterator();//����List��<>��ʾ���ͣ�Ҫ���������͵�ֵ
		while(it.hasNext()){
			System.out.println(it.next().getId());
		}
		
		List lUser2=new LinkedList<User>();
		lUser2.iterator();
		
		List lUser3=new Vector<User>();
		
		Set sUser=new HashSet<User>();
		for(int i=0;i<10;i++){
			User user=new User();
			user.setName("test"+i);
			user.setSex("F");
			sUser.add(user);
			sUser.add(user);//�ظ���ӣ����Զ��滻�ظ���
		}
		Iterator<User> it1=sUser.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next().getId());
		}
		
		/****************************/
		Properties pps=new Properties(); 
		
	}

}
