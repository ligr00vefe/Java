package sub2;

	/*
	 * ��¥ : 2020/04/29
	 * �̸� : �Ǳ��
	 * ���� : ������ �ڷ���(������ Ÿ��) �ǽ��ϱ� 
	 */

public class DataTypeTest {
	
	public static void main(String[] args) {
		
		// ������
		byte var1 = 1;			// byte�� 8bit�� 127���� �ۿ� ������ �� ����. 2(7��)*2(6��)*2(5��)*2(4��)*2(3��)*2(2��)*2(1��)*2(0��) = 127
		short var2 = 2;
		int var3 = 2147483647;
		long var4 = 465146516854168516L;			// int���� ū ������ ���̻� L�� �ٿ����Ѵ�.
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		
		
		
		// �Ǽ���
		float var5 = 1.123456789f;					// float�� ���̻� f�� �ݵ�� �� ���� �ٿ�����Ѵ�.	�Ҽ��� 7�ڸ����� ����. �Ҽ���7�ڸ� ���� ���ڴ� �ݿø� �ȴ�.
		double var6 = 1.23456789123546388469;		// double�� �Ҽ��� 16�ڸ����� ���´�.
		
		System.out.println("var5 : " + var5);
		System.out.println("var6 : " + var6);
		
		
		
		// ����
		boolean var7 = true;
		boolean var8 = false;
		
		System.out.println("var7 : " + var7);
		System.out.println("var8 : " + var8);
		
		
		
		// ������
		char ch1 = 'A';
		char ch2 = '��';
		
		System.out.println("ch1 : " + ch1);
		System.out.println("ch2 : " + ch2);
		
		// ���ڿ�(�ܾ�)
		String str1 = "A";
		String str2 = "Hello";
		String str3 = "�ȳ�";
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
	}
	
}
