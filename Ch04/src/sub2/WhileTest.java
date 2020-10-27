package sub2;

/*
 * ��¥ : 2020/05/04
 * �̸� : �Ǳ��
 * ���� : �ݺ��� while �ǽ��ϱ� 
 */

public class WhileTest {
	
	public static void main(String[] args) {
	
		// 1���� 10���� ��
		int sum = 0;
		int k = 1;
		
		while( k <= 10 ) {
			sum += k;			// ��������� �ϸ� +1 +1 +1 ... ���� �ݺ� �ȴ�.
			k++;
		}
		
		System.out.println("1���� 10���� �� : " + sum);
		
		
		
		// do-while
		int eSum = 0;
		int i = 1;
		
		do {
			if( i%2 == 0) {
				eSum += i;				
			}
			
			i++;
			
		}while(i <= 10);
		
		System.out.println("1���� 10���� ¦���� : " + eSum);
		
	
		
		// break
		int num = 0;	// declare(����)���� initialize(�ʱ�ȭ)                  
						// �ʱ�ȭ�� RAM�� ���ʷ� �����͸� �����س��� ���� ���Ѵ�.
		
		while(true) {
			
			num++;
			
			if(num%5 == 0 && num%7 == 0) {
				break;
			}
			
		}
		
		System.out.println("5�� 7�� �ּҰ���� : " + num);
		
		
		
		// continue
		int total = 0;
		
		for(int j = 1; j<=10; j++) {
			if(j % 2 == 1){
				continue;					// continue�� break�� �ٸ��� ������ ���ߴ� ���� �ƴ϶� �����ϰ� ���� �������� �ѱ��.
											// �ݺ��� ������ �̵�
			}
			
			total += j;

		}
		
		System.out.println("1���� 10���� ¦���� : " + total);
		
	}
}
