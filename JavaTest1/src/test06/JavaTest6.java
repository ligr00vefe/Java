package test06;

/*
 * ��¥ : 2020/05/01
 * �̸� : �Ǳ��
 * ���� : �ڹ� ������ �������� 
 */

public class JavaTest6 {
	
	public static void main(String[] args) {
		
		int num = 0;
		int result;
		
		result = num++;
		System.out.println("result : " + result);
		
		result = ++num;
		System.out.println("result : " + result);
		
		result = num--;
		System.out.println("result : " + result);
		
		result = --num;
		System.out.println("result : " + result);
	}
}
