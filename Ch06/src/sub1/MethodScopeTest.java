package sub1;

/*
 * ��¥ : 2020/05/06
 * �̸� : �Ǳ��
 * ���� : �ڹ� �޼���(�Լ�) ���࿵���� �޸� �ǽ��ϱ�
 */

public class MethodScopeTest {
	
	// ��������
	static int result1 = 0;
	
	public static void main(String[] args) {
		
		// ��������
		// - ���������� �ش� ����(scope)������ ���� �����ϴ�.
		int start = 1;
		int end = 10;
		int result = 0;
		
		result = sum(start, end);
		
		System.out.println("result : " + result);
		
		
	} // main end

	public static int sum(int s, int e) {
		
		// ��������
		int sum = 0;
		
		for(int k = s; k <= e; k++) {
			sum += k;
		}
		
		return sum;
	}

}
