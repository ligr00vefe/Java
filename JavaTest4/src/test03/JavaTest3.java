package test03;

/*
 * ��¥ : 2020-05-25
 * �̸� : �Ǳ��
 * ���� : String Ŭ���� ��������
 */

public class JavaTest3 {

	public static void main(String[] args) {
		
		String fileName = "�ڹ� ������.hwp";
		
		int idx = fileName.indexOf(".");
		System.out.println("idx�� �ε��� ��ȣ : "+idx);
		
		String title = fileName.substring(0, idx);
		String ext = fileName.substring(idx+1);
		
		System.out.println("���ϸ� : "+title);
		System.out.println("Ȯ���� : "+ext);
	}
}
