package sub3;

public class Calc {

	// �̱��� ��ü
	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {}		// �ܺο��� Calc Ŭ������ ��ü(�ν��Ͻ�) ������ ���ϵ��� ����.
	
	public int plus(int x, int y) {
		
		int z = x + y;
		
		return z;
	}
	
	public int minus(int x, int y) {
		
		int z = x - y;
		
		return z;
	}
	
	public int multi(int x, int y) {
		
		int z = x * y;
		
		return z;
	}
	
//	public int div(int x, int y) {
//		
//		int z = 0;
//		
//		try {			
//			z =  x / y;
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		return z;
//	}
		
	// div �޼���� ������ �߻��� �� �ִٴ� ���ɼ��� throws ������ ���� ȣ���ϴ� �ʿ� �˸�
	public int div(int x, int y) throws Exception {
		
		if(y<=1) {
			
			// ����
			// ������ �߻��Ҷ� �޼��带 ȣ���ϴ� ������ ������ ������.
//			Exception e = new Exception("y�� 1���� �Դϴ�.");
//			throw e;
			
			// ���
			throw new Exception("y�� 1���� �Դϴ�.");
		}
		
		if(y<0) {
			throw new Exception("y�� ������� �մϴ�.");
		}else if(y==1) {
			Exception e = new Exception("y�� 1�� �Ǹ� �ȵ˴ϴ�.");
			throw e;
		}
		
		int z =  x / y;
			
			return z;
	}
	
	
}
