package sub2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageOutputTest {

public static void main(String[] args) throws Exception {
		
		String originFile = "C:\\Users\\bigdata\\Desktop\\Workspace\\file\\sea.jpg";
		String targetFile = "C:\\Users\\bigdata\\Desktop\\Workspace\\file\\target.jpg";
		
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
