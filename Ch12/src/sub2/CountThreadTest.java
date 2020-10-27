package sub2;

/*
 * ��¥ : 2020/05/19
 * �̸� : �Ǳ��
 * ���� : ������(Thread) Ȱ�� �ǽ��ϱ� ���� p576
*/ 

public class CountThreadTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		// run(); main() �޼��忡�� �̱۽������ �۾��ϴ� Thread ���� �޼���. ���� �޼��带 ����� �������� �޼��带 ����ϰ� �̵�
		// start(); ���꽺���带 ���ļ� ���ķ� ���� �޼��带 �����ؼ� ����ϴ� Thread ���� �޼���
		// start() �޼��带 �׳� ����� ��� �����۾��� ������ �� �޼��� ������ �����ȴ�.
		// start()�� ���� setNum() �޼��带 ������ num++�� +1������ ct1�� ct2���� ���ÿ� �Ͼ�ٸ� +2�� �Ǵ� ���� �ƴ϶� �ϳ��� ������ �����ȴ�.
		// �׷��� run()���� ������ ����  ������� 3000������ start()�� ������ ���� 3000�� ���� �ʴ� ��찡 �߻��Ѵ�.
		// ���� �޼��忡 synchronized�� �߰��ϸ� �����۾����� ���� ���������� ������ �� �ִ�.
		ct1.start();
		ct2.start();
		ct3.start();
		
		// ���ν����忡�� �Ļ��� ���꽺������ �۾��� �Ϸ�� �� �ٽ� ���ν������ �շ��Ǵ� ���� ����
		ct1.join();
		ct2.join();
		ct3.join();
		
		System.out.println("��� : " + count.getNum());
	}
	
}
