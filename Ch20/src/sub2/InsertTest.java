package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2020/05/26
 * 이름 : 권기민
 * 내용 : JDBC INSERT 실습하기
 */

public class InsertTest {
	
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
		Statement stmt = conn.createStatement();
		
		// 4단계 - SQL 실행
		String sql = "INSERT INTO `USER1` VALUES ('C103', '양만춘', '010-1234-3333', 47)";
		stmt.executeUpdate(sql);		// () = 쿼리문 쓰는 란
		
		// 5단계 - 결과셋(ResultSet) 처리(SELECT일 경우만 해당)			
		// 6단계 - 데이터베이스 종료(해제)
		stmt.close();
		conn.close();
		
		System.out.println("INSERT 완료...");
	}

}
