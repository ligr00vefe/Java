package sub1;

/*
 * ��¥ : 2020/05/14
 * �̸� : �Ǳ��
 * ���� : ����ó�� �ǽ��ϱ� ���� p422
 */

public class ExceptionTest {

	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 0;
		
		// int r1 = num1 + num2;
		// int r2 = num1 - num2;
		// int r3 = num1 * num2;
		// int r4 = num1 / num2;			// ���� 2�� 0�� �� ��� 0���δ� � �͵� ���� �� �����Ƿ� ������ ���꿡�� ������ �߻�
		int r1 = 0, r2 = 0, r3 = 0;
		
		int r4 = 0;						// try �޼��� ������ ������ �ҷ��� �� ���� ������ ���� ������ �����صд�.
										// try������ ������ ���� ��� ������ ������ ���� �������� �ʰ� �����ص� ������ �״�� ����Ѵ�.
		
		try {
			// �ڵ��� �ϰ����� �����ϱ�(������) ���ؼ� ������ �߻��� ���ɼ��� ������ try�޼��忡 ���� ���ش�. 
			r1 = num1 + num2;
			r2 = num1 - num2;
			r3 = num1 * num2;
			
			// ������ �߻��� ���ɼ��� �ִ� ����
			r4 = num1 / num2;			// ���� 2�� 0�� �� ��� 0���δ� � �͵� ���� �� �����Ƿ� ������ ���꿡�� ������ �߻�
			
		}catch (Exception e){
			
			// ������ �߻����� �� ó���� ����
			e.printStackTrace();
		}
		
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);
		
		
		
		System.out.println("���α׷� ����...");
	}
	
}
