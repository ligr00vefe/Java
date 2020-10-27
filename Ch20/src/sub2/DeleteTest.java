package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * ��¥ : 2020/05/26
 * �̸� : �Ǳ��
 * ���� : JDBC Delete �ǽ��ϱ�
 */

public class DeleteTest {

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
		Statement stmt = conn.createStatement();
		
		// 4�ܰ� - SQL ����		
		String sql = "DELETE FROM `USER1` WHERE `uid`='C103';";
		stmt.executeUpdate(sql);
	
		// 5�ܰ� - ����� ó��(SELECT���� ��츸 �ش�)				
		// 6�ܰ� - �����ͺ��̽� ����
		stmt.close();
		conn.close();
	
	}
}
