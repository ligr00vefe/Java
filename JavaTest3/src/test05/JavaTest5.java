package test05;

/*
 * ��¥ : 2020/05/14
 * �̸� : �Ǳ��
 * ���� : �̱��� ��ü ��������
 */

public class JavaTest5 {

	public static void main(String[] args) {
		
		CarFactory factory = CarFactory.getInstance();
		
		Car avante = factory.createCar("�ƹ���", 2500);
		Car sonata = factory.createCar("�ҳ�Ÿ", 2500);
		
		avante.info();
		sonata.info();
	}
}