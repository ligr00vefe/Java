package sub6;

/*
 * ��¥ : 2020/05/13
 * �̸� : �Ǳ��
 * ���� : �߻�Ŭ���� �ǽ��ϱ� ���� p329
 * 
 * �߻�Ŭ����
 * 	- Ŭ������ �߻�޼��尡 ����� Ŭ����
 * 	- �߻�Ŭ������ ��� �޾� ���ϼ��ִ� ������ ���� Ŭ������ ����
 */

public class AbstractClassTest {

	public static void main(String[] args) {
		
		// �߻�Ŭ������ ��ü���� �ȵ�
		// Unit nnit = new Unit();
		
		Marine   u1 = new Marine();
		Zergling u2 = new Zergling();
		Zealot   u3 = new Zealot();
		
		u1.move();
		u1.attack();
		
		u2.move();
		u2.attack();
		
		u3.move();
		u3.attack();
	}
}
