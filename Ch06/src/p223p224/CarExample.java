package p223p224;

public class CarExample {
	
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.setGas(5);	// Car�� setGas() �޼��� ȣ��
		
		boolean gasState = myCar.isLeftGas();	// Car�� isLeftGas() �޼��� ȣ��
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run();    // Car�� run(); �޼��� ȣ��
		}
		
		if(myCar.isLeftGas()) {		// Car�� isLeftGas() �޼��� ȣ��
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("gas�� �����ϼ���.");
		}
	}
}
