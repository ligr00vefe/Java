package sub4;

public class Increment {

	private int num1;			// Java���� int�� ������ �⺻���� 0;
	
	// ��������(Ŭ���� ����)
	private static int num2;
	
	// �ش� Ŭ���� ǥ�� ������(�ʼ�)
	public Increment(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	// ����� ���� ������(�ɼ�)
	public Increment() {
		num1++;
		num2++;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}

	// ���� �޼���(Ŭ���� �޼���)
	public static void add() {
		// num1++;		static �޸𸮿���(Method Area)�� �������� ���� ������ static �޼��忡�� ���� �Ұ����ϴ�.
		num2++;					// static ������ static �޼��忡���� ��������!!!
	}
}
