package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * ��¥ : 2020/05/21
 * �̸� : �Ǳ��
 * ���� : �ڹ� ���� ����� �ǽ��ϱ� ���� p1018
 */

public class FileIOTest {

	public static void main(String[] args) throws Exception {
		
		String originFile = "C:\\Users\\bigdata\\Desktop\\Workspace\\file\\sample.txt";
		String targetFile = "C:\\Users\\bigdata\\Desktop\\Workspace\\file\\target.txt";
		
		FileInputStream fis = new FileInputStream(originFile);
		FileOutputStream fos = new FileOutputStream(targetFile);
		
		int value = 0;
		
		while(true) {
			// InputStream���� ������ �о���̱�
			value = fis.read();
			
			if(value == -1) {
				break;
			}
			
			// OutputStream���� ������ ��������
			fos.write(value);
		}
		
		// ��Ʈ�� ����
		fis.close();
		fos.close();
		
		System.out.println("\n���α׷� ����!!!");
	}
}
