package sub3;

/*
 * ��¥ : 2020/05/12
 * �̸� : �Ǳ��
 * ���� : �������̵� �޼��� �ǽ��ϱ� ���� p295
 */

public class OverrideTest {
	public static void main(String[] args) {
		
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		// final : ���
		// final �޼��� : �������̵� ����
		// final Ŭ���� : ��� ����
		final int Num = 1;
		final double Pi = 3.14;
		// Num = 2; final ������ �߱� ������ �������� ������ �� ����
		
		
	}
	
	
}
