package com.June25;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc {

	public static void main (String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//1.�������ݿ�driver��ָ�����ݿ�����
		Class.forName("com.mysql.jdbc.Driver");
		//2.��ȡ����
		Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/student",
				"root","root");
		//3.����һ��statement
		Statement st=con.createStatement();
		//����resultset��ִ��sql
		ResultSet rs=st.executeQuery("select * from car");
		while(rs.next()){
			String name=rs.getString("name");
			int price=rs.getInt("price");
			System.out.println("Name:"+name+"  price:"+price);
		}
		//�ر�jdbc����
		/*ע��Ϳ���˳���෴
		 * 
		 */
		if(rs!=null)rs.close();
		if(st!=null)st.close();
		if(con!=null)con.close();
		Statement std=con.createStatement();
	}

}
