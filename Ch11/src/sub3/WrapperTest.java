package sub3;

/*
 * ��¥ : 2020/05/18
 * �̸� : �Ǳ��
 * ���� : Wrapper Ŭ���� �ǽ��ϱ� ���� p527
 */

public class WrapperTest {
	public static void main(String[] args) {
		
		// �⺻����(primitive type - stack�� ����)
		int 	var1 = 1;
		double  var2 = 2.13;
		boolean var3 = true;
		char 	var4 = 'A';
		
		
		// Wrapper Ŭ����			// �⺻Ÿ�� ������ ��ü�� ������ش�.
		Integer w1 = new Integer(var1);
		Double w2 = new Double(var2);
		Boolean w3 = new Boolean(var3);
		Character w4 = new Character(var4);
		
		System.out.println("w1 : " + w1 + ", " + w1.getClass().getName());
		System.out.println("w2 : " + w2 + ", " + w2.getClass().getName());
		System.out.println("w3 : " + w3 + ", " + w3.getClass().getName());
		System.out.println("w4 : " + w4 + ", " + w4.getClass().getName());
		
		
		
		// ���ڿ�	  ->   �⺻Ÿ�� ��ȯ
		String str1 = "1";
		String str2 = "2.13";
		String str3 = "false";
		
		int 	v1 = Integer.parseInt(str1);
		double  v2 = Double.parseDouble(str2);
		boolean v3 = Boolean.parseBoolean(str3);
		
		System.out.println("v1 : " + v1 + ", " + str1.getClass().getName());
		System.out.println("v2 : " + v2 + ", " + str2.getClass().getName());
		System.out.println("v3 : " + v3 + ", " + str1.getClass().getName());
		
		
		
		// ���ڿ�   ->   Wrapper ��ȯ
		Integer wr1 = Integer.valueOf(str1);
		Double wr2 = Double.valueOf(str2);
		Boolean wr3 = Boolean.valueOf(str3);
		
		System.out.println("wr1 : " + wr1 + ", " + wr1.getClass().getName());
		System.out.println("wr2 : " + wr2 + ", " + wr2.getClass().getName());
		System.out.println("wr3 : " + wr3 + ", " + wr3.getClass().getName());
		
				
		
		// Wrapper   ->   ���ڿ� ��ȯ
		String s1 = w1.toString();
		String s2 = w2.toString();
		String s3 = w3.toString();
		
		System.out.println("s1 : " + s1 + ", " + s1.getClass().getName());
		System.out.println("s2 : " + s2 + ", " + s2.getClass().getName());
		System.out.println("s3 : " + s3 + ", " + s3.getClass().getName());
		
	}
}
