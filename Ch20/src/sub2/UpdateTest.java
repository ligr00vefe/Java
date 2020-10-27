package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * ��¥ : 2020/05/26
 * �̸� : �Ǳ��
 * ���� : JDBC Update �ǽ��ϱ�
 */

public class UpdateTest {
	
	public static void main(String[] args) {
		
		// DB ����
		String host = "jdbc:mysql://192.168.44.7:3306/kkm";
		String user = "kkm";
		String pass = "1234";
		
		
		try {
			// 1�ܰ� - JDBC ����̹� �ε�
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2�ܰ� - �����ͺ��̽� ����
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			if(conn != null) {
				System.out.println("�����ͺ��̽� ���� ����!");
			}
			
			// 3�ܰ� - SQL ���ఴü ����
			Statement stmt = conn.createStatement();
			
			// 4�ܰ� - SQL ����
			String sql = "UPDATE `USER1` SET `uid`='G107' ";
				   sql += "WHERE `name`='������'";
			stmt.executeUpdate(sql);
			
			// 5�ܰ� - ����� ó��(SELECT���� ��츸 �ش�)			
			// 6�ܰ� - �����ͺ��̽� ����
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// e.printStackTrace();
			System.out.println("����̹� �ε忡 �����߽��ϴ�.");
		} catch (SQLException e) {
			// e.printStackTrace();
			System.out.println("�����ͺ��̽� ���ӿ� ������ �߻��߽��ϴ�.");
		}
	}
}
