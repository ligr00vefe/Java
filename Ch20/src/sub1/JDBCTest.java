package sub1;

import java.sql.Connection;
import java.sql.DriverManager;



/*
 * ��¥ : 2020/05/26
 * �̸� : �Ǳ��
 * ���� : JDBC �ǽ��ϱ�
 */

public class JDBCTest {

	public static void main(String[] args) throws Exception {
		
		// DB����
		String host = "jdbc:mysql://192.168.44.7:3306/kkm";
		String user = "kkm";
		String pass = "1234";

	
		// 1�ܰ� - JDBC ����̹� �����ε�
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2�ܰ� - �����ͺ��̽� ����
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		if(conn != null) {
			System.out.println("�����ͺ��̽� ���� ����!");
		}
		
		// 3�ܰ� - SQL ���ఴü ����
		// 4�ܰ� - SQL ����		
		// 5�ܰ� - ����� ó��(SELECT���� ��츸 �ش�)				
		// 6�ܰ� - �����ͺ��̽� ����
		conn.close();
	
	}
}

