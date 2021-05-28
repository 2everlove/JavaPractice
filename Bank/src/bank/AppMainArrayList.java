package bank;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class AppMainArrayList {
/*
  ���� list
	1.�����ߺ� x (method)
	2.����ȣ �ο�(Account.class -> Static)
	3.���� �ŷ�Ƚ��(Account.class)
	4.�ݾ׺� �� ��� �ο�
	5.���»���x -> ����� �� ���»���
	6.���¹�ȣ&����ݾ׿� ����� �Է�
	7.������(�ѱ�, ����) �Է�
	8.����� ����� �Է�
	9.����� - ������ ��� �߰� - �� ������ ����
	10. �� ������ ���� �� ������ �� �� ���̵� ���� ������ ��ü
	11.���� ��޿� ���� ��� �� ������ ����
 */

	private static ArrayList<Account> accountArray = new ArrayList<Account>();
	private static Scanner sc = new Scanner(System.in); 
	private static DecimalFormat formater = new DecimalFormat("###,###");
	

	public static void main(String[] args) {
		
		boolean run = true;
		
		System.out.println("                ���� ���α׷� by Ahn            ");
		while(run) {
			System.out.println("��������������������������������������������������������������������������������������������������������������������������");
			System.out.println("�� 1. ���� ���� �� 2. ���� ��� �� 3. �Ա� �� 4. ��� �� 5. ���� ��");
			System.out.println("��������������������������������������������������������������������������������������������������������������������������");
			System.out.println("����> ");
			String selNum = sc.next();
			if(selNum.equals("1")) {
				createAccount();
			} else if(selNum.equals("2")) {
				accountList();
			} else if(selNum.equals("3")) {
				deposit();
			} else if(selNum.equals("4")) {
				withdraw();
			} else if(selNum.equals("5")) {
				run = false;
			} else {
				System.out.println("�������� �ʴ� ����Դϴ�. �ٽ� �Է����ּ���.");
				continue;
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
		final int fees = 1500;
		System.out.println("���� ��ȣ : ");
		String accountNum = sc.next();
		while(true) {		
			Account account = findAccount(accountNum); //ȣ��
			try {
				if(account==null) {
					System.out.println("���°� �����ϴ�. \n���»����� ���Ͻø� c�� �����ּ��� : \n�ٽ� �Է��� ���Ͻø� r�� �����ּ��� : \n�����⸦ ���Ͻø� �ƹ�Ű�� �����ּ��� : ");
					String key = sc.next();
					if(key.equals("c")||key.equals("C")) {
						createAccount();
						return;				
					} else if(key.equals("r")||key.equals("R")) {
						System.out.println("���� ��ȣ : ");
						accountNum = sc.next();
						continue;
							
					} else {
						System.out.println("����Ǿ����ϴ�.");
						break;
					}
				} else {
					System.out.println("��ݾ� : ");
					long money = sc.nextLong();
					while(true) {
						if(money>=0) {
							while(true) {
								if(account.getBalance()>(money+fees)) {
									if(account.getRank()=="Silver"||account.getRank()=="Gold"||account.getRank()=="VIP") {
										System.out.println("�����(������ ����)");
										account.setBalace(account.getBalance() - money);
										System.out.println("ó�� ��� : "+(formater.format(money))+"�� ����� �����Ͽ����ϴ�.");
										System.out.println("�ܾ� : "+formater.format(account.getBalance())+"��");
										return;
									} else {
										System.out.println("�Ϲݰ�");
										account.setBalace(account.getBalance() - money + fees);
										System.out.println("ó�� ��� : "+(formater.format(money+fees))+"��(������ : " +(formater.format(fees))+") ����� �����Ͽ����ϴ�.");
										System.out.println("�ܾ� : "+formater.format(account.getBalance())+"��");
										return;
									}
									
								} else {
									System.out.println("�ܾ��� �����մϴ�.\n��ݾ��� �ٽ� �Է��Ϸ��� r�� �����ּ��� : \n���Ḧ ���Ͻø� e�� �Է����ּ��� : ");
									String key = sc.next();
									while(true) {
										if(key.equals("e")||key.equals("E")) {
											return;
										} else if(key.equals("r")||key.equals("R")) {
											System.out.println("��ݾ� : ");
											money = sc.nextLong();
											break;
										} else {
											System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ��� : ");
											key = sc.next();
											continue;
										}
									}
								}
							}
						} else {
							System.out.println("����� ��ݰ����մϴ�. �ٽ� �Է����ּ��� :");
							money = sc.nextInt();
							continue;
						}
					}
				}	
			} catch(Exception e) {
				System.out.println("���°� �����ϴ�. �ٽ� �Է����ּ��� : ");
				accountNum = sc.next();
				continue;
			}
		}
	}

	//�Ա�
	private static void deposit() {
		System.out.println("��������������");
		System.out.println("�� �Աݦ�");
		System.out.println("��������������");
		
		System.out.println("���� ��ȣ : ");
		String accountNum = sc.next();
		while(true) {	
			Account account;
			try {
				account = findAccount(accountNum); //ȣ��
				if(account==null) {
					System.out.println("���°� �����ϴ�. \n���»����� ���Ͻø� c�� �����ּ��� : \n�ٽ� �Է��� ���Ͻø� r�� �����ּ��� : \n�����⸦ ���Ͻø� �ƹ�Ű�� �����ּ��� : ");
					String key = sc.next();
					if(key.equals("c")||key.equals("C")) {
						createAccount();
						return;				
					} else if(key.equals("r")||key.equals("R")) {
						System.out.println("���� ��ȣ : ");
						accountNum = sc.next();
						continue;
							
					} else {
						System.out.println("����Ǿ����ϴ�.");
						break;
					}
				} else {
					System.out.println("�Աݾ� : ");
					long money = sc.nextLong();
					while(true) {
						if(money>=0) {
							account.setBalace(account.getBalance() + money);
							System.out.println("ó�� ��� : "+(formater.format(money))+"�� �Ա��� �����Ͽ����ϴ�.");
							System.out.println("�ܾ� : "+formater.format(account.getBalance())+"��");
							return;
						} else {
							System.out.println("����� ��ݰ����մϴ�. �ٽ� �Է����ּ��� :");
							money = sc.nextInt();
							continue;
						}
					}
				}			
			} catch (Exception e) {
				System.out.println("���°� �����ϴ�. �ٽ� �Է����ּ��� : ");
				accountNum = sc.next();
				continue;
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
		System.out.println("���� ��ȣ : ");
		String accountNum = sc.next();
		final String administration = "admin";  //������ �ڵ�
		
		while(true) {
			if(accountNum.equals(administration)) {
				for(int i=0;i<accountArray.size();i++) {
					Account account = accountArray.get(i);
					System.out.println(("ID : "+account.getCustomerNum())+"�� ��, ���¹�ȣ : "+account.getAccountNum()+", ���� : "+account.getOwner()+", �ܾ� : "+formater.format(account.getBalance())+", ��� : "+account.getRank()+", �ŷ�Ƚ�� : "+account.getTransactionNum());
//					�� ID - static ���� , Rank ����
				}
				System.out.println("d. �������� �Ұ�\n�����⸦ ���Ͻø� �ƹ�Ű�� �����ּ���.");
				String key=sc.next();
				if(key.equals("d")||key.equals("D")) {
					System.out.println("��������ϴ� ���� ��ȣ�� �Է��ϼ��� : ");
					String customerNum = sc.next();
					while(true) {
						if(comCustomNum(customerNum)) {
							deleteData(customerNum);
							return;
						} else {
							System.out.println("���°� �����ϴ�. \n���»����� ���Ͻø� c�� �����ּ��� : \n�ٽ� �Է��� ���Ͻø� r�� �����ּ��� : \n�����⸦ ���Ͻø� �ƹ�Ű�� �����ּ��� : ");
							String key1 = sc.next();
							if(key1.equals("c")||key1.equals("C")) {
								createAccount();
								return;				
							} else if(key1.equals("r")||key1.equals("R")) {
								System.out.println("���� ��ȣ : ");
								customerNum = sc.next();
								continue;
							} else {
								System.out.println("����Ǿ����ϴ�.");
								break;
							}
						} 
					}
				} else {
					System.out.println("����Ǿ����ϴ�.");
					return;
				}
			} else if(comAccount(accountNum)) {
				Account account = findAccount(accountNum);
				System.out.println(account.getAccountNum()+"   "+account.getOwner()+"   "+formater.format(account.getBalance())+"   "+account.getRank());
				break;
			} else {
				System.out.println("���°� �����ϴ�. \n���»����� ���Ͻø� c�� �����ּ��� : \n�ٽ� �Է��� ���Ͻø� r�� �����ּ��� : \n�����⸦ ���Ͻø� �ƹ�Ű�� �����ּ��� : ");
				String key = sc.next();
				if(key.equals("c")||key.equals("C")) {
					createAccount();
					return;				
				} else if(key.equals("r")||key.equals("R")) {
					System.out.println("���� ��ȣ : ");
					accountNum = sc.next();
					continue;
				} else {
					System.out.println("����Ǿ����ϴ�.");
					break;
				}
			}
		}
	}

	//���� ���� �޼���
	private static void createAccount() {
		System.out.println("������������������������");
		System.out.println("�� ���� ������");
		System.out.println("������������������������");
		System.out.println("���¹�ȣ : ");
		String accountNum = sc.next();
		while(true) {
			if(accountNum.matches("^[0-9]*$")) {
				if(accountArray.size()==0) {
					generateAccount(accountNum);
					System.out.println("ó�� ��� : ���°� �����Ǿ����ϴ�.");
					break;
				} else {
					while(true) {
						if(comAccount(accountNum)) {
							System.out.println("���� : �ߺ��� �����Դϴ�, �ٽ� �Է����ּ��� : ");
							accountNum = sc.next();
							continue;
						} else {
							generateAccount(accountNum);
							System.out.println("ó�� ��� : ���°� �����Ǿ����ϴ�.");
							return;
						}
					}
				}
			} else {
				System.out.println("���ڸ� �Է����ּ��� : ");
				accountNum = sc.next();
				continue;
			}
		}
	}
	
	//���� �ߺ� ���� �޼���
	private static boolean comAccount(String accountNum) {
		for(int i=0; i<accountArray.size(); i++) {
			String dbAccNum = accountArray.get(i).getAccountNum(); // �迭�� ����� ���¹�ȣ�� ����
			if(dbAccNum.equals(accountNum)) { //�ܺ� �Է°��¿� ��ġ�ϸ�
				return true;
			}
		}
		return false;
	}
	
	//�� ��ȣ ���� �޼���
	private static boolean comCustomNum(String customerNum) {
		for(int i=0; i<accountArray.size(); i++) {
			long dbAccNum = accountArray.get(i).getCustomerNum(); // �迭�� ����� ���¹�ȣ�� ����
			long num = Long.parseLong(customerNum);
			if(dbAccNum==num) { //�ܺ� �Է°��¿� ��ġ�ϸ�
				return true;
			}
		}
		return false;
	}
	
	//���� ���� �μ� �޼���
	private static void generateAccount(String accountNum) {
		System.out.println("������ : ");
		String owner = sc.next();
		while(true) {
			if(owner.matches("^[��-����-�Ӱ�-�R]*$")||owner.matches("^[a-zA-Z]*$")) { //�ѱ� �Ǵ� ����
				while(true){
					System.out.println("�ʱ� �Աݾ� : ");
					long balance = sc.nextLong();
					if(balance>0) {
						Account newAccount = new Account(accountNum, owner, balance);
						accountArray.add(newAccount);
						System.out.println(newAccount.getAccountNum()+"   "+newAccount.getOwner()+"   "+formater.format(newAccount.getBalance())+"   "+newAccount.getRank());
						return;
					} else {
						System.out.println("����� �Է����ּ��� : ");	
						continue;
					}
				}
			} else {
				System.out.println("[�ѱ�] �Ǵ� [����]�� �Է����ּ��� : ");
				owner = sc.next();
				continue;
			}
		}
	}
	
	//�� ������ ���� �޼���
	private static void deleteData(String customerNum) {
		int index = (Integer.parseInt(customerNum)-1);
		while(true) {
			if(index<=accountArray.size()) {
				System.out.println((index+1)+"�� ������ �����͸� ����ϱ�?, y/n");
				String key=sc.next();
				if(key.equals("y")||key.equals("Y")) {
					accountArray.remove(index); //������ �ε���
					for(int i=index;i<accountArray.size();i++) {
						accountArray.get(i).setCustomerNum(i+1); //�� num ���� �޲ٱ�
					}
					Account.setSerialNum((accountArray.size())); //�ű� ���� �� num ���߱�
					System.out.println((index+1)+"�� ������ �����͸� �������ϴ�.");
					return;
				} else if(key.equals("n")||key.equals("N")) {
					System.out.println("��ҵǾ����ϴ�.");
					return;
				} else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ��� : (������� e�� �����ּ���.)");
				String key=sc.next();
				if(key.equals("e")||key.equals("E")) {
					return;
				} else {
					index = (int) sc.nextLong();
					continue;
				}
				
			}
		}
	}
}
