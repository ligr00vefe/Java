package test08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * ��¥ : 2020-05-25
 * �̸� : �Ǳ��
 * ���� : �ζ� ��ȣ ������ ��������
 */

public class JavaTest8 {

	public static void main(String[] args) {
		
		Set<Integer> lottoSet = new HashSet<>();
		
		for(;;) {	// ;; = ���ѹݺ�
			int num = (int) Math.ceil(Math.random()*45);
			
			lottoSet.add(num);
			
			if(lottoSet.size() == 6) {
				break;
			}
		}
		
		// �ζǹ�ȣ ����
		Set<Integer> treeSet = new TreeSet<>(lottoSet);
		
		// �ζǹ�ȣ ���
		Iterator<Integer> iter = treeSet.iterator();	// �ݺ���
		
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
	}
}
