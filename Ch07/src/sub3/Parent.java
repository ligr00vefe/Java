package sub3;

public class Parent extends GrandParent {
	
	// Override �����   -  �ڽĿ�ҿ��� �θ��ҿ� ���� �޼��带 ������ؼ� ����Ѵ�.
	final public void method1() {				// final ������ �ϸ� �ڽ� ��ҿ� ���̻� Override �� �� ����
		System.out.println("Parent - method1...");
	}
	
	// Overloading
	public void method2(int a) {
		System.out.println("Parent - method2...");
	}
	
	@Override
	public void method3() {
		System.out.println("Parent - method3...");
	}
}
