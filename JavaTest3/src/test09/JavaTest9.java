package test09;

/*
 * ��¥ : 2020/05/14
 * �̸� : �Ǳ��
 * ���� : �߻� Ŭ����, ������ ��������
 */

public class JavaTest9 {
	
	public static void main(String[] args) {
		
		JavaTest9 here = new JavaTest9();
				
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		here.paint(circle);
		here.paint(triangle);
		
	}
	
	public void paint(Shape obj) {
		obj.draw();
	}
}
