package p383p384;

public class Test1 {

	public static void main(String[] args) {
		
		ChildInterface1 ci1 = new ChildInterface1() {
			
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void method3() {
				// TODO Auto-generated method stub
				
			}
		};
		
		ci1.method1();
		ci1.method2();	// ParentInterface�� method2() ȣ��
		ci1.method3();
	}
	
}
