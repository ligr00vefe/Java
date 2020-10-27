package sub2;

public class Account {
	// Ư��(�������)
	// 	- ���ٱ��� private �������� ������ ĸ��ȭ�Ѵ�.
	private String bank;
	private String id;
	private String name;
	private int money;
	
	// ������
	// ��ü�� ������ �� ��������� �ʱ�ȭ�ϴ� �޼���
	Account(String bank, String id, String name, int money){
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	// ���(�޼���)
	public void deposit(int money) {
		this.money += money; 			// this�� class(Account)�� �ǹ��Ѵ�.
	}
	
	public void withdraw(int money) {
		this.money -= money;
	}
	
	public void info() {
		System.out.println("====================");
		System.out.println("�� �� �� : " + bank);			// this.bank�� �ᵵ��
		System.out.println("���¹�ȣ : " + id);			// this.id
		System.out.println("�� �� �� : " + name);			// this.name
		System.out.println("�����ܾ� : " + money);			// this.money
		System.out.println("====================");
	}
}
