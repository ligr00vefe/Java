package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.imageio.IIOException;

/*
 * ��¥ : 2020/05/21
 * �̸� : �Ǳ��
 * ���� : �ڹ� ���� ����� �ǽ��ϱ� ���� p1018
 */

public class FileInputTest {

	public static void main(String[] args) {
		
		String file = "C:\\Users\\bigdata\\Desktop\\Workspace\\file\\sample.txt";
		
		try {
			FileInputStream fis = new FileInputStream(file);
			// ���� ���� �� �ʱ�ȭ
			int value = 0;
			
			while(true) {
				
				// �Է½�Ʈ�� ����
				value = fis.read();
				
				if(value == -1) {
				
					// �� �̻� ���� �����Ͱ� ���� ��� 
					break;
				}
				
				char c = (char) value;	// ������ �����͸� ������ �����ͷ� ġȯ
				System.out.print(c);
			}
			
			// �Է½�Ʈ�� ����
			fis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		  // ������ ������ �߻��� �� ���� �������� catch�� �޾� �� ���� �ְ� ��ǥ Exception ������ �Ἥ �ϳ��� ���� �� ���� �ִ�.
		  // ���� ��Ȳ�� �ϳ��ϳ� �˾ƾ��� ��� ���� Exception�� ���� �ʴ´�.
		  // catch (FileNotFoundException e) {
		  // e.printStackTrace();
		  //} catch (IOException e) {
		  // e.printStackTrace();
		  // } 
		
		System.out.println("\n���α׷� ����!!!");
		
		
	}
}
