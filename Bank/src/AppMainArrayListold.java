

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class AppMainArrayListold {
	
	private static ArrayList<Account> accountArray = new ArrayList<Account>();
	private static Scanner sc = new Scanner(System.in); 
	private static DecimalFormat formater = new DecimalFormat("###,###");
	

	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
			System.out.println("��������������������������������������������������������������������������������������������������������������������������");
			System.out.println("�� 1. ���� ���� �� 2. ���� ��� �� 3. �Ա� �� 4. ��� �� 5. ���� ��");
			System.out.println("��������������������������������������������������������������������������������������������������������������������������");
			System.out.println("����> ");
			int selNum = sc.nextInt();
			if(selNum==1) {
				createAccount();
			} else if(selNum==2) {
				accountList();
			} else if(selNum==3) {
				deposit();
			} else if(selNum==4) {
				withdraw();
			} else if(selNum==5) {
				run = false;
			} else {
				System.out.println("�������� �ʴ� ����Դϴ�. �ٽ� �Է����ּ���.");
			}
		}
		System.out.println("���α׷� ����");		
		sc.close();
	}

	//���� �޼��� ����
	
	//���
	private static void withdraw() {
		System.out.println("��������������");
		System.out.println("�� ��ݦ�");
		System.out.println("��������������");
		
		while(true) {		
			System.out.println("���� ��ȣ : ");
			String accountNum = sc.next();
			try {
				Account account = findAccount(accountNum); //ȣ��
				if(account.equals(null)) {
					System.out.println("���°� �����ϴ�.");
					accountNum = sc.next();
					continue;
				} else {
					System.out.println("��ݾ� : ");
					long money = sc.nextLong();
					while(true) {
						if(account.getBalance()>money) {
							account.setBalace(account.getBalance() - money);
							break;
						} else {
							System.out.println("�ܾ��� �����մϴ�.\n��ݾ��� �ٽ� �Է����ּ��� :");
							money = sc.nextInt();
						}
					}
					System.out.println("ó�� ��� : "+(formater.format(money))+"�� ����� �����Ͽ����ϴ�.");
					System.out.println("�ܾ� : "+formater.format(account.getBalance())+"��");
					break;
				}	
			} catch(Exception e) {
				System.out.println("���°� �����ϴ�.");
			}
		}
	}

	//�Ա�
	private static void deposit() {
		System.out.println("��������������");
		System.out.println("�� �Աݦ�");
		System.out.println("��������������");
		
		while(true) {
			System.out.println("���� ��ȣ : ");
			String accountNum = sc.next();
					
			Account account;
			try {
				account = findAccount(accountNum); //ȣ��
				if(account.equals(null)) {
					System.out.println("���°� �����ϴ�.");
					accountNum = sc.next();
					continue;
				} else {
					System.out.println("�Աݾ� : ");
					long money = sc.nextLong();
					account.setBalace(account.getBalance() + money);
					System.out.println("ó�� ��� : "+formater.format(money)+"�� �Ա��� �����Ͽ����ϴ�.");
					System.out.println("�ܾ� : "+formater.format(account.getBalance())+"��");
					break;
				}			
			} catch (Exception e) {
				System.out.println("���°� �����ϴ�.");
			}
		}
	}

	//���� �� �޼���
	private static Account findAccount(String accountNum) {
		Account account = null; //�ʱⰪ ����
		for(int i=0; i<accountArray.size(); i++) {
			String dbAccNum = accountArray.get(i).getAccountNum(); // �迭�� ����� ���¹�ȣ�� ����
			if(dbAccNum.equals(accountNum)) { //�ܺ� �Է°��¿� ��ġ�ϸ�
				account = accountArray.get(i);
				break;
			}
		}
		return account;
	}
	

	//���� ��� �޼���
	private static void accountList() {
		System.out.println("������������������������");
		System.out.println("�� ���� ��Ϧ�");
		System.out.println("������������������������");
		
		for(int i=0;i<accountArray.size();i++) {
			Account account = accountArray.get(i);
			System.out.println(account.getAccountNum()+"   "+account.getOwner()+"   "+formater.format(account.getBalance()));
			}

	}

	//���� ���� �޼���
	private static void createAccount() {
		System.out.println("������������������������");
		System.out.println("�� ���� ������");
		System.out.println("������������������������");
		
		System.out.println("���¹�ȣ : ");
		String accountNum = sc.next();
//		boolean run = true;
		if(accountArray.size()==0) {
			generateAccount(accountNum);
			System.out.println("ó�� ��� : ���°� �����Ǿ����ϴ�.");
		} else {
			while(true) {
//				for(Account a:accountArray) {
					Account account = findAccount(accountNum);
					if(account != null) {
						System.out.println("���� : �ߺ��� �����Դϴ�, �ٽ� �Է����ּ��� : ");
						accountNum = sc.next();
						continue;
					} else {
						generateAccount(accountNum);
						System.out.println("ó�� ��� : ���°� �����Ǿ����ϴ�.");
						break;
					}
//				}
			}
			
		}
	}
	
//	//���� �ߺ� ���� �޼���
//	private static boolean comAccount(String accountNum) {
//		for(int i=0; i<accountArray.size(); i++) {
//			String dbAccNum = accountArray.get(i).getAccountNum(); // �迭�� ����� ���¹�ȣ�� ����
//			if(dbAccNum.equals(accountNum)) { //�ܺ� �Է°��¿� ��ġ�ϸ�
//				return true;
//			}
//		}
//		return false;
//	}
	
	//���� ���� �μ� �޼���
	private static void generateAccount(String accountNum) {
		System.out.println("������ : ");
		String owner = sc.next();
		System.out.println("�ʱ� �Աݾ� : ");
		long balance = sc.nextLong();
		Account newAccount = new Account(accountNum, owner, balance);
		accountArray.add(newAccount);
	}
}
