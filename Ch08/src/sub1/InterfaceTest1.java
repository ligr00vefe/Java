package sub1;

/*
 * ��¥ : 2020/05/13
 * �̸� : �Ǳ��
 * ���� : �������̽� �ǽ��ϱ�
 */

public class InterfaceTest1 {

	public static void main(String[] args) {
		
		RemoteControl lg = new RemoteLG();
		RemoteControl samsung = new RemoteSamsung();
		
		lg.powerOn();
		lg.powerOff();
		lg.chUp();
		lg.chDown();
		lg.soundUp();
		lg.soundDown();
		
		samsung.powerOn();
		samsung.powerOff();
		samsung.chUp();
		samsung.chDown();
		samsung.soundUp();
		samsung.soundDown();
	}
}
