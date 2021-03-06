package sub1;

/*
 * 날짜 : 2020/05/06
 * 이름 : 권기민
 * 내용 : 자바 메서드(함수) 타입 실습하기
 */

public class MethodtypeTest {
	
	// 자바 프로그램 시작 메서드
	public static void main(String[] args) {
		
	// 메서드 호출(실행)
	double r1 = type1(1.1);
	System.out.println("r1 : " + r1);
	
	type2(true); 	// return 값이 없기 때문에 =(대입연산자)는 필요 없다.
	
	boolean r2 = type3();
	System.out.println("r2 : " + r2);
		
	
	type4();
	
	
	// 연습문제
	gugudan(2);
	gugudan(5);
	gugudan(7);
	
	} // main end
	
	
	// type1 : 매개변수 O, 리턴값 O;
	public static double type1(double a) {
		double result = a + 3.14;
		
		return result;
	}
	
	
	// type2 : 매개변수 O, 리턴값 X;
	public static void type2(boolean isOk) {
		
		if(isOk) {
			System.out.println("참 입니다.");
		}else {
			System.out.println("거짓 입니다.");
		}
	}
	
	
	// type3 : 매개변수 X, 리턴값 O;
	public static boolean type3() {
		
		int num1 = 1, num2 = 2;
		
		if(num1 > num2) {
			return true;
		}else {
			return false;
		}
	}
	
	
	// type4 : 매개변수 X, 리턴값 X;
	public static void type4() {
		
		System.out.println("type1(0.1) : " + type1(0.1));
	}
	
	
	// 연습문제(구구단)
	public static void gugudan(int a) {
		
		System.out.println(a + "단");
		
		for(int i = 1; i < 10; i++) {	
			System.out.println(a + " x " + i + " = " + a * i);
		}
		
	}

}

