package sub3;

/*
 * ��¥ : 2020/05/14
 * �̸� : �Ǳ��
 * ���� : ���� ���ѱ�� �ǽ��ϱ� ���� p440
 */

public class ThrowsTest {

	public static void main(String[] args) {			// public static void main(String[] args) throws Exception {} 
														// main()�޼��忡���� throws Exception�� �����ؼ� JVM�� ������ �ȴ�.
														// �׷��� �ϴ��� ���꿡 try,catch�� �Ƚᵵ ��
		
		// �̱��� ��ü ������
		Calc c = Calc.getInstance();
		
		int r1 = c.plus(1, 2);
		int r2 = c.minus(1, 2);
		int r3 = c.multi(2, 3);
		
		// ������ �߻��� throws �����  �޼���(div)�� ȣ���ϴ� �ʿ����� ����ó��(try-catch)�� �ؾ���
		// �Ǵ� �ٽ� throws �������� main�� ȣ���ϴ� �ڹ� JVM���� ���ܸ� ����
		int r4 = 0;
		
		try {
			r4 = c.div(4, -41);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);
	}
}
