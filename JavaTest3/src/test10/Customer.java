package test10;

public class Customer implements Buyer, Seller{
	
	@Override
	public void buy() {
		System.out.println("�����ϱ�");
	}

	@Override
	public void sell() {
		System.out.println("�Ǹ��ϱ�");		
	}
	
}
