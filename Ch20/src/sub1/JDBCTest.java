package sub1;

import java.sql.Connection;
import java.sql.DriverManager;



/*
 * 날짜 : 2020/05/26
 * 이름 : 권기민
 * 내용 : JDBC 실습하기
 */

public class JDBCTest {

	public static void main(String[] args) throws Exception {
		
		// DB정보
		String host = "jdbc:mysql://192.168.44.7:3306/kkm";
		String user = "kkm";
		String pass = "1234";

	
		// 1단계 - JDBC 드라이버 동적로드
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2단계 - 데이터베이스 접속
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		if(conn != null) {
			System.out.println("데이터베이스 접속 성공!");
		}
		
		// 3단계 - SQL 실행객체 생성
		// 4단계 - SQL 실행		
		// 5단계 - 결과셋 처리(SELECT문일 경우만 해당)				
		// 6단계 - 데이터베이스 종료
		conn.close();
	
	}
}

