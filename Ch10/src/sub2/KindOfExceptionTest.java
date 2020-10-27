package sub2;

/*
 * ��¥ : 2020/05/14
 * �̸� : �Ǳ��
 * ���� : �پ��� ����ó�� �ǽ��ϱ� ���� p433
 */

public class KindOfExceptionTest {

	public static void main(String[] args) {
		
		// �迭�� ũ�⿡�� ��� �ε����� ��������
		int arr[] = new int[3];
		
		for(int i=0; i<=3; i++) {
		
			try {
				
				arr[i] = (i+1);
				
			}catch(ArrayIndexOutOfBoundsException e){		// �迭 ���� ������ ������ �߻����� �� ���		// Exception e �� �ᵵ �������
				System.out.println("�迭�� �ε������� �����ϴ�.");
			}		
		}
		
		for(int num : arr) {
			System.out.println(num);
		}
		
		
		
		// NullPoint ����
//		Tiger tiger;		// stack�� null���� �����.
//		tiger.move();		// null�� ������ stack������ move();�Ӹ޼��带 ������ �Ϸ����ϴ� ������ �߻�
//		tiger.hunt();
		
		try {
			Tiger tiger = null;
			
			tiger.move();
			tiger.hunt();
		}catch (NullPointerException e) {
			System.out.println("Tiger ��ü�� �������� �ʾҽ��ϴ�.");
		}
		
		
		
		// ĳ���� ����
		
		try {
		Animal a1 = new Eagle();		// ��ĳ����(������)
		Animal a2 = new Shark();		// ��ĳ����(������)
		
		Shark shark = (Shark) a1;				// �ٿ�ĳ����
		shark.move();
		}catch(ClassCastException e) {
			System.out.println("ĳ���� ������ �߸��Ǿ����ϴ�.");
		}
		
		
		
		System.out.println("���α׷� ����...");
	}
}
