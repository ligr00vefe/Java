package sub2;

/*
 * ��¥ : 2020/05/18
 * �̸� : �Ǳ��
 * ���� : String ��� �ǽ��ϱ� ���� p496
 */

public class StringMemberTest {

	public static void main(String[] args) {
		
		String str = "Hello Korea";
		
		// length
		System.out.println("str ���ڿ� ���� : " + str.length());
		
		
		// charAt
		System.out.println("str�� 7��° ���� : " + str.charAt(6));
		
		
		// substring
		System.out.println("str�� 0������ 4�������� ���ڿ� : " + str.substring(0, 5));
		System.out.println("str�� 6������ ������������ ���ڿ� : " + str.substring(6));
		
		
		// indexOf, lastIndexOf
		int idx1 = str.indexOf("e");		// ���ڿ� �տ������� ã��
		int idx2 = str.lastIndexOf("e");	// ���ڿ� �ڿ������� ã��
		
		System.out.println("���ڿ� str���� �տ������� ã�� ���� e�� �ε��� �� : " + idx1);
		System.out.println("���ڿ� str���� �ڿ������� ã�� ���� e�� �ε��� �� : " + idx2);
		
		
		// replace - ���ڿ� ��ü
		String newStr = str.replace("Korea", "Busan");
		System.out.println("newStr : " + newStr);
		
				
		// valueOf
		int 	var1 = 1;
		double  var2 = 2.13;
		boolean var3 = true;
		boolean var4 = false;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = String.valueOf(var3);
		String s4 = "" + var4;
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		System.out.println("s4 : " + s4);
		
	}
}
