import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class AppMainArrayList2 {
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
	10.�� ������ ���� �� ������ �� �� ���̵� ���� ������ ��ü
	11.���� ��޿� ���� ��� �� ������ ����
	12.������ ���� ����(����(���¹�ȣ, ����ݾ�)�Է� ���� String �Է� �� error ��� �ٽ� �Է��ϰ� �ٲ�)
	13.����� - �����ڸ��- ����(��������,��������) �߰�
	14.���¹�ȣ �Է� �� �� ������ 0 �ְ� ��� �� 000-000���·� ���
 */

	private static ArrayList<Account> accountArray = new ArrayList<Account>();
	private static Scanner sc = new Scanner(System.in); 
	private static DecimalFormat formater = new DecimalFormat("###,###");
		
	

public static void main(String[] args) {
				
		System.out.println("                ���� ���α׷� by Ahn            ");
//		try {
			while(true) {
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
					System.out.println("���α׷� ����");
					sc.close();
					
					return;
				} else {
					System.out.println("�������� �ʴ� ����Դϴ�. �ٽ� �Է����ּ���.");
					continue;
				}
			}
//		}catch(Exception e) {
//			e.getMessage();
//		}finally {
//			System.out.println("���α׷� ����");
//			sc.close();
//		}
	}

	//���� �޼��� ����
	
	//���
	private static void withdraw() {
		System.out.println("��������������");
		System.out.println("�� ��ݦ�");
		System.out.println("��������������");
		final int fees = 1500;
		System.out.println("���� ��ȣ : ");
		String s = sc.next();
		String accountNum = addZero(s, 6);
		while(true) {		
			Account account = findAccount(accountNum); //ȣ��
			try {
				if(account==null) {
					System.out.println("���°� �����ϴ�. \n���»����� ���Ͻø� C�� �����ּ��� : \n�ٽ� �Է��� ���Ͻø� R�� �����ּ��� : \n�����⸦ ���Ͻø� �ƹ�Ű�� �����ּ��� : ");
					String key = sc.next();
					if(key.equals("c")||key.equals("C")||key.equals("��")) {
						createAccount();
						return;				
					} else if(key.equals("r")||key.equals("R")||key.equals("��")) {
						System.out.println("���� ��ȣ : ");
						s = sc.next();
						accountNum = addZero(s, 6);
						continue;
							
					} else {
						System.out.println("����Ǿ����ϴ�.");
						break;
					}
				} else {
					System.out.println("��ݾ� : ");
					String temp = sc.next();
					while(true) {
						try {
							long money = Long.parseLong(temp);
							if(money>0&&temp.matches("^[0-9]*$")) {
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
											System.out.println("�ܾ��� �����մϴ�.\n��ݾ��� �ٽ� �Է��Ϸ��� R�� �����ּ��� : \n���Ḧ ���Ͻø� E�� �Է����ּ��� : ");
											String key = sc.next();
											while(true) {
												if(key.equals("e")||key.equals("E")||key.equals("��")) {
													return;
												} else if(key.equals("r")||key.equals("R")||key.equals("��")) {
													System.out.println("��ݾ� : ");
													temp = sc.next();
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
							} else {
								System.out.println("���ڸ� �Է��ϼ��� : ");
								temp = sc.next();
								continue;
							}
						} catch(Exception e) { //pareLong���� temp�� �����͸� long�� ��ȯ�Ҷ� ������ �߻��ϸ� ����� �� 
							System.out.println("���ڸ� �Է��ϼ��� : ");
							temp = sc.next();
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
		String s = sc.next();
		String accountNum = addZero(s, 6);
		while(true) {	
			Account account;
			try {
				account = findAccount(accountNum); //ȣ��
				if(account==null) {
					System.out.println("���°� �����ϴ�. \n���»����� ���Ͻø� C�� �����ּ��� : \n�ٽ� �Է��� ���Ͻø� R�� �����ּ��� : \n�����⸦ ���Ͻø� �ƹ�Ű�� �����ּ��� : ");
					String key = sc.next();
					if(key.equals("c")||key.equals("C")||key.equals("��")) {
						createAccount();
						return;				
					} else if(key.equals("r")||key.equals("R")||key.equals("��")) {
						System.out.println("���� ��ȣ : ");
						s = sc.next();
						accountNum = addZero(s, 6);
						continue;
							
					} else {
						System.out.println("����Ǿ����ϴ�.");
						break;
					}
				} else {
					System.out.println("�Աݾ� : ");
					String temp = sc.next();
					while(true) {
						try {
							long money = Long.parseLong(temp);
							if(money>0&&temp.matches("^[0-9]*$")) {
								if(money>=0) {
									account.setBalace(account.getBalance() + money);
									System.out.println("ó�� ��� : "+(formater.format(money))+"�� �Ա��� �����Ͽ����ϴ�.");
									System.out.println("�ܾ� : "+formater.format(account.getBalance())+"��");
									return;
								} else {
									System.out.println("����� �Աݰ����մϴ�. �ٽ� �Է����ּ��� :");
									temp = sc.next();
									continue;
								}
							} else {
								System.out.println("���ڸ� �Է��ϼ��� : ");
								temp = sc.next();
								continue;
							}
						} catch(Exception e) {
							System.out.println("���ڸ� �Է��ϼ��� : ");
							temp = sc.next();
							continue;
						}	
					}
				}			
			} catch (Exception e) {
				System.out.println("���°� �����ϴ�. �ٽ� �Է����ּ��� : ");
				s = sc.next();
				accountNum = addZero(s, 6);
				continue;
			}
		}
	}

	//���� �� �޼���
	private static Account findAccount(String accountNum) {
		Account account = null; //�ʱⰪ ����
		for(Account a : accountArray) {
			String dbAccNum = a.getAccountNum(); // �迭�� ����� ���¹�ȣ�� ����
			if(dbAccNum.equals(accountNum)) { //�ܺ� �Է°��¿� ��ġ�ϸ�
				account = a;
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
		String s = sc.next();
		String accountNum = addZero(s, 6);
		while(true) {
			final String administration = "0admin";  //������ �ڵ�
			final String administration2 = "00��������";  //������ �ڵ�
			if(accountNum.matches("^[0-9]*$")||accountNum.equals(administration)||accountNum.equals(administration2)) {
				while(true) {
					if(accountNum.equals(administration)||accountNum.equals(administration2)) {
						for(int i=0;i<accountArray.size();i++) {
							Account account = accountArray.get(i);
//							System.out.println(("ID : "+account.getCustomerNum())+"�� ��, ���¹�ȣ : "+account.getAccountNum().replaceFirst("(//d{3})(//d{3})", "$2-$2")+", ���� : "+account.getOwner()+", �ܾ� : "+formater.format(account.getBalance())+"��, ��� : "+account.getRank()+", �ŷ�Ƚ�� : "+account.getTransactionNum());
							System.out.println("ID : "+account.getCustomerNum()+"�� ��, ���¹�ȣ : "+dash(account.getAccountNum())+", ���� : "+account.getOwner()+", �ܾ� : "+formater.format(account.getBalance())+"��, ��� : "+account.getRank()+", �ŷ�Ƚ�� : "+account.getTransactionNum());
//							�� ID - static ���� , Rank ����
						}
						System.out.println("D. �������� �Ұ�\nL. �ݾ׺� ����\nM. ����� ����\n�����⸦ ���Ͻø� �ƹ�Ű�� �����ּ���.");
						String key=sc.next();
						if(key.equals("d")||key.equals("D")||key.equals("��")) {
							System.out.println("��������ϴ� ���� ��ȣ�� �Է��ϼ��� : ");
							String customerNum = sc.next();
							while(true) {
								if(comCustomNum(customerNum)) {
									deleteData(customerNum);
									return;
								} else {
									System.out.println("���°� �����ϴ�. \n���»����� ���Ͻø� C�� �����ּ��� : \n�ٽ� �Է��� ���Ͻø� R�� �����ּ��� : \n�����⸦ ���Ͻø� �ƹ�Ű�� �����ּ��� : ");
									key = sc.next();
									if(key.equals("c")||key.equals("C")||key.equals("��")) {
										createAccount();
										return;				
									} else if(key.equals("r")||key.equals("R")||key.equals("��")) {
										System.out.println("�� ��ȣ : ");
										customerNum = sc.next();
										continue;
									} else {
										System.out.println("����Ǿ����ϴ�.");
										return;
									}
								} 
							}
						} else if (key.equals("L")||key.equals("l")||key.equals("��")){
							listSort();
							return;
						} else if (key.equals("M")||key.equals("m")||key.equals("��")){
							System.out.println("����� �����ϰ��� �ϴ� ���� ��ȣ�� �Է��ϼ��� : ");
							String customerNum = sc.next();
							while(true) {
								if(comCustomNum(customerNum)) {
									manageRank(customerNum);
									return;
								} else {
									System.out.println("���°� �����ϴ�. \n���»����� ���Ͻø� C�� �����ּ��� : \n�ٽ� �Է��� ���Ͻø� R�� �����ּ��� : \n�����⸦ ���Ͻø� �ƹ�Ű�� �����ּ��� : ");
									key = sc.next();
									if(key.equals("c")||key.equals("C")||key.equals("��")) {
										createAccount();
										return;				
									} else if(key.equals("r")||key.equals("R")||key.equals("��")) {
										System.out.println("�� ��ȣ : ");
										customerNum = sc.next();
										continue;
									} else {
										System.out.println("����Ǿ����ϴ�.");
										return;
									}
								} 
							}
						}else {
							System.out.println("����Ǿ����ϴ�.");
							return;
						}
					} else if(comAccount(accountNum)) {
						Account account = findAccount(accountNum);
						System.out.println("������ ������ �Է����ּ��� : ");
						String owner = sc.next();
						while(true) {
							if(account.getOwner().equals(owner)) {
								System.out.println("���¹�ȣ : "+dash(account.getAccountNum())+", ���� : "+account.getOwner()+", �ܾ� : "+formater.format(account.getBalance())+"��, ��� : "+account.getRank());
								return;
							} else {
								System.out.println("�߸� �Է��ϼ̽��ϴ�.\n�ٽ� �Է��� ���Ͻø� r�� �����ּ��� : \n�����⸦ ���Ͻø� �ƹ�Ű�� �����ּ��� : ");
								String key = sc.next();
								if(key.equals("r")||key.equals("R")||key.equals("��")) {
									System.out.println("������ ������ �Է����ּ��� : ");
									owner = sc.next();
									continue;													
								} else {
									System.out.println("����Ǿ����ϴ�.");
									return;
								}
							}
						}
					} else {
						System.out.println("���°� �����ϴ�. \n���»����� ���Ͻø� c�� �����ּ��� : \n�ٽ� �Է��� ���Ͻø� r�� �����ּ��� : \n�����⸦ ���Ͻø� �ƹ�Ű�� �����ּ��� : ");
						String key = sc.next();
						if(key.equals("c")||key.equals("C")||key.equals("��")) {
							createAccount();
							return;				
						} else if(key.equals("r")||key.equals("R")||key.equals("��")) {
							System.out.println("���� ��ȣ : ");
							s = sc.next();
							accountNum = addZero(s, 6);
							continue;
						} else {
							System.out.println("����Ǿ����ϴ�.");
							return;
						}
					}
				}
			} else {
				System.out.println("���ڸ� �Է����ּ���");
				s = sc.next();
				accountNum = addZero(s, 6);
				continue;
			}
		}
	}

	//���� ���� �޼���
	private static void createAccount() {
		System.out.println("������������������������");
		System.out.println("�� ���� ������");
		System.out.println("������������������������");
		System.out.println("���¹�ȣ(6�ڸ� ���� ���ڸ�) : ");
		final int accountNumLength = 6; //���¹�ȣ ���� ����
		String accountNum = sc.next();
		while(true) {
			if(accountNum.matches("^[0-9]*$")&&accountNum.length()<=accountNumLength) { //(//d)�̰�, 6�ڸ� �����϶�
				String s = addZero(accountNum, 6);
				while(true) {
					if(accountNum.length()<7) {
						if(accountArray.size()==0) {
							generateAccount(s);
							System.out.println("ó�� ��� : ���°� �����Ǿ����ϴ�.");
							return;
						} else {
							while(true) {
								if(findAccount(accountNum)!=null) {
									System.out.println("���� : �ߺ��� �����Դϴ�, �ٽ� �Է����ּ��� : ");
									accountNum = sc.next();
									continue;
								} else {
									generateAccount(s);
									System.out.println("ó�� ��� : ���°� �����Ǿ����ϴ�.");
									return;
								}
							}
						}
					} else if(accountNum.matches("^[0-9]*$")) {
						System.out.println("���ڸ� �Է����ּ��� : ");
						accountNum = sc.next();
						s = addZero(accountNum, 6);
						continue;
					} else {
						System.out.println("6�ڸ� ���Ϸ� �Է����ּ��� : ");
						accountNum = sc.next();
						s = addZero(accountNum, 6);
						continue;
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
			long dbAccNum = accountArray.get(i).getCustomerNum(); // �迭�� ����� ����ȣ�� ����
			long num = Long.parseLong(customerNum);
			if(dbAccNum==num) { //�ܺ� ����ȣ�� ��ġ�ϸ�
				return true;
			}
		}
		return false;
	}
	
	//���� ���� �μ� �޼���
	private static void generateAccount(String accountNum) {
		System.out.println("������(�ѱ�, ������) : ");
		String owner = sc.next();
		while(true) {
			if(owner.matches("^[��-����-�Ӱ�-�R]*$")||owner.matches("^[a-zA-Z]*$")) { //�ѱ� �Ǵ� ����
				System.out.println("�ʱ� �Աݾ�(���) : ");
				String temp = sc.next();
				while(true){
					try {
						long balance = Long.parseLong(temp);
						if(balance>0&&temp.matches("^[0-9]*$")) {
							Account newAccount = new Account(accountNum, owner, balance);
							accountArray.add(newAccount);
							newAccount.getAccountNum();
//							String c = String.valueOf(Long.parseLong(newAccount.getAccountNum())).replaceFirst("(\\d{3})(^\\d{3})", "$2-$2");
							System.out.println("���¹�ȣ : "+dash(newAccount.getAccountNum())+", ���� : "+newAccount.getOwner()+", �ܾ� : "+formater.format(newAccount.getBalance())+", ��� : "+newAccount.getRank());
							return;
						} else {
							System.out.println("����� �Է����ּ��� : ");
							temp = sc.next();
							continue;
						}
					}catch(Exception e) {
//						System.out.println("("+e+")\n���ڸ� �Է��ϼ��� : "); //������ ���
						System.out.println("���ڸ� �Է��ϼ��� : ");
						temp = sc.next();
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
				System.out.println((index+1)+"�� ������ �����͸� ����ϱ�?, Y/N");
				String key=sc.next();
				if(key.equals("y")||key.equals("Y")||key.equals("��")) {
					accountArray.remove(index); //������ �ε���
					for(int i=index;i<accountArray.size();i++) {
						accountArray.get(i).setCustomerNum(i+1); //static���� ������ �� num ���� �޲ٱ�
					}
					Account.setSerialNum((accountArray.size())); //�� ������ ������ ���� static �� num�� �ű� ���� �� num�� �ùٸ��� �����ϰ� �����
					System.out.println((index+1)+"�� ������ �����͸� �������ϴ�.");
					return;
				} else if(key.equals("n")||key.equals("N")||key.equals("��")) {
					System.out.println("��ҵǾ����ϴ�.");
					return;
				} else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ��� : (������� E�� �����ּ���.)");
				String key=sc.next();
				if(key.equals("e")||key.equals("E")||key.equals("��")) {
					return;
				} else {
					index = (int) sc.nextLong();
					continue;
				}
			}
		}
	}
	
	//�ݾ׺� �� ���� (��������, ��������)
	private static void listSort() {
		//������ ArrayList�� ������ ���ٷ��� ���� ����
		ArrayList<Account> accountArrTemp = new ArrayList<Account>(); 
		ArrayList<Account> accountArrTemp2 = new ArrayList<Account>();
		for(int k=0;k<accountArray.size();k++) {
			accountArrTemp.add(k,accountArray.get(k));
		}
		System.out.println("A. ��������\nD. ��������\n�����⸦ ���Ͻø� �ƹ�Ű�� �����ּ���.");
		String key = sc.next();
		while(true) {
			if(key.equals("d")||key.equals("D")||key.equals("��")) {
				for(int i=0;i<accountArray.size();i++) {
					for(int j=0;j<(accountArray.size()-1);j++) {
						if(accountArrTemp.get(j).getBalance()<accountArrTemp.get(j+1).getBalance()) {
							accountArrTemp2.add(j,accountArrTemp.get(j));
							accountArrTemp.set(j,accountArrTemp.get(j+1));
							accountArrTemp.set(j+1,accountArrTemp2.get(j));
						} else {
							accountArrTemp2.add(j,accountArrTemp.get(j)); //���� ù��° �ε����� j�� j+1���� Ŭ�� temp2���� �ֱ����ؼ�
						}
					}
				}
			} else if(key.equals("a")||key.equals("A")||key.equals("��")) {
				for(int i=0;i<accountArray.size();i++) {
					for(int j=0;j<(accountArray.size()-1);j++) {
						if(accountArrTemp.get(j).getBalance()>accountArrTemp.get(j+1).getBalance()) {
							accountArrTemp2.add(j,accountArrTemp.get(j));
							accountArrTemp.set(j,accountArrTemp.get(j+1));
							accountArrTemp.set(j+1,accountArrTemp2.get(j));
						} else {
							accountArrTemp2.add(j,accountArrTemp.get(j)); //���� ù��° �ε����� j�� j+1���� ������ temp2���� �ֱ����ؼ�
						}
					}
				}
			} else {
				System.out.println("����˴ϴ�.");
				return;
			}
			for(Account account : accountArrTemp) {
//				Account account = accountArrTemp.get(i);
				System.out.println(("ID : "+account.getCustomerNum())+"�� ��, ���¹�ȣ : "+account.getAccountNum().replaceFirst("(\\d{3})(\\d+)", "$2-$2")+", ���� : "+account.getOwner()+", �ܾ� : "+formater.format(account.getBalance())+"��, ��� : "+account.getRank()+", �ŷ�Ƚ�� : "+account.getTransactionNum());
			}
			break;
		}
	}

	//�� ��� ���� �޼���
	private static void manageRank(String customerNum) {
		int index = (Integer.parseInt(customerNum)-1);
		while(true) {
			if(index<=accountArray.size()) {
				String temp = accountArray.get(index).getRank();
				System.out.println((index+1)+"��("+accountArray.get(index).getAccountNum()+") ������ ����� "+temp+"�Դϴ�.\n�����ϰ��� �ϴ� ��ũ�� �Է��ϼ���.\n"+
									"1. White | 2. Brown | 3. Silver | 4. Gold | 5. VIP");
				String key=sc.next();
				if(key.equals("1")) {
					accountArray.get(index).setRank("White");
					System.out.println(accountArray.get(index).getCustomerNum()+"��("+accountArray.get(index).getAccountNum()+")������ ����� "+temp+"���� "+accountArray.get(index).getRank()+"�� �����Ǿ����ϴ�.");
					return;
				} else if (key.equals("2")) {
					accountArray.get(index).setRank("Brown");
					System.out.println(accountArray.get(index).getCustomerNum()+"��("+accountArray.get(index).getAccountNum()+")������ ����� "+temp+"���� "+accountArray.get(index).getRank()+"�� �����Ǿ����ϴ�.");
					return;
				} else if (key.equals("3")) {
					accountArray.get(index).setRank("Silver");
					System.out.println(accountArray.get(index).getCustomerNum()+"��("+accountArray.get(index).getAccountNum()+")������ ����� "+temp+"���� "+accountArray.get(index).getRank()+"�� �����Ǿ����ϴ�.");
					return;
				} else if (key.equals("4")) {
					accountArray.get(index).setRank("Gold");
					System.out.println(accountArray.get(index).getCustomerNum()+"��("+accountArray.get(index).getAccountNum()+")������ ����� "+temp+"���� "+accountArray.get(index).getRank()+"�� �����Ǿ����ϴ�.");
					return;
				} else if (key.equals("5")) {
					accountArray.get(index).setRank("VIP");
					System.out.println(accountArray.get(index).getCustomerNum()+"��("+accountArray.get(index).getAccountNum()+")������ ����� "+temp+"���� "+accountArray.get(index).getRank()+"�� �����Ǿ����ϴ�.");
					return;
				} else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
				
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ��� : (������� E�� �����ּ���.)");
				String key=sc.next();
				if(key.equals("e")||key.equals("E")||key.equals("��")) {
					return;
				} else {
					index = (int) sc.nextLong();
					continue;
				}
			}
		}
	}
	
	//0�ٿ��ֱ�
	public static String addZero(String accountNum, int accountNumLength) {
		String result = "";
		if (accountNumLength < accountNum.length())
			return accountNum;
		for (int i = 0; i < accountNumLength - accountNum.length(); i++)
			result = result + "0";
		return result + accountNum;
	}
	
	//println)���¹�ȣ�� "'000'-000"�ٿ��ֱ� - ��
	private static StringBuilder dash(String accountNum) {
		StringBuilder acccountNumShow = new StringBuilder();
		long num = Long.parseLong(accountNum);
		if(num / 1000==0) {
			acccountNumShow.append("000");
			acccountNumShow.append("-");
			acccountNumShow.append(dashInner(num));
		} else if (num/100>=1000&&num/100<=10000) {
			acccountNumShow.append(num/1000);
			acccountNumShow.append("-");
			acccountNumShow.append(dashInner(num));
		} else if (num/100>=100&&num/100<=999) {
			acccountNumShow.append("0");
			acccountNumShow.append(num/1000);
			acccountNumShow.append("-");
			acccountNumShow.append(dashInner(num));
		} else if (num/100>=10&&num/100<=99) {
			acccountNumShow.append("00");
			acccountNumShow.append(num/1000);
			acccountNumShow.append("-");
			acccountNumShow.append(dashInner(num));
		} else if (num/100>=1&&num/100<=9) {
			acccountNumShow.append(num/10000);
			acccountNumShow.append("-");
			acccountNumShow.append(dashInner(num));
		}
		return acccountNumShow;
	}
	//���¹�ȣ�� "000-'000'"�ٿ��ֱ� - ��
	private static StringBuilder dashInner(long Num) {
		StringBuilder acccountNumShow = new StringBuilder();
		if(Num%1000==0) {
			acccountNumShow.append("000");
		} else if(Num%1000<100&&Num%100>=10) {
			acccountNumShow.append("0");
			Num = Num % 10000;
			acccountNumShow.append(Num);
		} else if(Num%1000<9) {
			acccountNumShow.append("00");
			Num = Num % 1000;
			acccountNumShow.append(Num);
		} else if(Num%1000<1000&&Num%1000>=100) {
			Num = Num % 1000;
			acccountNumShow.append(Num);
		}
		return acccountNumShow;
	}

}
	
	//�������Ϸ� ���
//	private static void createBook() {
//		HSSFWorkbook workbook = new HSSFWorkbook(); // �� ���� ����
//        HSSFSheet sheet = workbook.createSheet("��Ʈ��"); // �� ��Ʈ(Sheet) ����
//        HSSFRow row = sheet.createRow(0); // ������ ���� 0������ ����
//        HSSFCell cell = row.createCell(0); // ���� ���� 0������ ����
//        cell.setCellValue("�׽�Ʈ ������"); //������ ���� ������ ����
//        try {
//            FileOutputStream fileoutputstream = new FileOutputStream("������ ���/�̸�.xlsx");
//            workbook.write(fileoutputstream);
//            fileoutputstream.close();
//            System.out.println("�������ϻ�������");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("�������ϻ�������");
//        }
//	}

