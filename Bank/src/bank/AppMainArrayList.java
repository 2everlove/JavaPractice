package bank;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class AppMainArrayList {
/*
  ±¸Çö list
	1.°èÁÂÁßº¹ x (method)
	2.°í°´¹øÈ£ ºÎ¿©(Account.class -> Static)
	3.°í°´º° °Å·¡È½¼ö(Account.class)
	4.±İ¾×º° °í°´ µî±Ş ºÎ¿©
	5.°èÁÂ»ı¼ºx -> ÀÔÃâ±İ ½Ã °èÁÂ»ı¼º
	6.°èÁÂ¹øÈ£&ÀÔÃâ±İ¾×¿¡ ¾ç¼ö¸¸ ÀÔ·Â
	7.°èÁÂÁÖ(ÇÑ±Û, ¿µ¹®) ÀÔ·Â
	8.ÀÔÃâ±İ ¾ç¼ö¸¸ ÀÔ·Â
	9.°í°´¸ñ·Ï - °ü¸®ÀÚ ¸ğµå Ãß°¡ - °í°´ µ¥ÀÌÅÍ Á¦°Å
	10. °í°´ µ¥ÀÌÅÍ Á¦°Å ½Ã °ø¶õÀÌ µÈ °í°´ ¾ÆÀÌµğ ±âÁ¸ °í°´À¸·Î ´ëÃ¼
	11.°í°´º° µî±Ş¿¡ µû¶ó Ãâ±İ ½Ã ¼ö¼ö·á °¨¸é
 */

	private static ArrayList<Account> accountArray = new ArrayList<Account>();
	private static Scanner sc = new Scanner(System.in); 
	private static DecimalFormat formater = new DecimalFormat("###,###");
	

	public static void main(String[] args) {
		
		boolean run = true;
		
		System.out.println("                ÀºÇà ÇÁ·Î±×·¥ by Ahn            ");
		while(run) {
			System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
			System.out.println("¦¢ 1. °èÁÂ »ı¼º ¦¢ 2. °èÁÂ ¸ñ·Ï ¦¢ 3. ÀÔ±Ş ¦¢ 4. Ãâ±İ ¦¢ 5. Á¾·á ¦¢");
			System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
			System.out.println("¼±ÅÃ> ");
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
				System.out.println("Áö¿øÇÏÁö ¾Ê´Â ±â´ÉÀÔ´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä.");
				continue;
			}
		}
		System.out.println("ÇÁ·Î±×·¥ Á¾·á");		
		sc.close();
	}

	//¸ŞÀÎ ¸Ş¼­µå ½ÃÀÛ
	
	//Ãâ±İ
	private static void withdraw() {
		System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¤");
		System.out.println("¦¢ Ãâ±İ¦¢");
		System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¥");
		final int fees = 1500;
		System.out.println("°èÁÂ ¹øÈ£ : ");
		String accountNum = sc.next();
		while(true) {		
			Account account = findAccount(accountNum); //È£Ãâ
			try {
				if(account==null) {
					System.out.println("°èÁÂ°¡ ¾ø½À´Ï´Ù. \n°èÁÂ»ı¼ºÀ» ¿øÇÏ½Ã¸é c¸¦ ´­·¯ÁÖ¼¼¿ä : \n´Ù½Ã ÀÔ·ÂÀ» ¿øÇÏ½Ã¸é rÀ» ´­·¯ÁÖ¼¼¿ä : \n³ª°¡±â¸¦ ¿øÇÏ½Ã¸é ¾Æ¹«Å°³ª ´­·¯ÁÖ¼¼¿ä : ");
					String key = sc.next();
					if(key.equals("c")||key.equals("C")) {
						createAccount();
						return;				
					} else if(key.equals("r")||key.equals("R")) {
						System.out.println("°èÁÂ ¹øÈ£ : ");
						accountNum = sc.next();
						continue;
							
					} else {
						System.out.println("Á¾·áµÇ¾ú½À´Ï´Ù.");
						break;
					}
				} else {
					System.out.println("Ãâ±İ¾× : ");
					long money = sc.nextLong();
					while(true) {
						if(money>=0) {
							while(true) {
								if(account.getBalance()>(money+fees)) {
									if(account.getRank()=="Silver"||account.getRank()=="Gold"||account.getRank()=="VIP") {
										System.out.println("¿ì¼ö°í°´(¼ö¼ö·á °¨¸é)");
										account.setBalace(account.getBalance() - money);
										System.out.println("Ã³¸® °á°ú : "+(formater.format(money))+"¿ø Ãâ±İÀ» ¼º°øÇÏ¿´½À´Ï´Ù.");
										System.out.println("ÀÜ¾× : "+formater.format(account.getBalance())+"¿ø");
										return;
									} else {
										System.out.println("ÀÏ¹İ°í°´");
										account.setBalace(account.getBalance() - money + fees);
										System.out.println("Ã³¸® °á°ú : "+(formater.format(money+fees))+"¿ø(¼ö¼ö·á : " +(formater.format(fees))+") Ãâ±İÀ» ¼º°øÇÏ¿´½À´Ï´Ù.");
										System.out.println("ÀÜ¾× : "+formater.format(account.getBalance())+"¿ø");
										return;
									}
									
								} else {
									System.out.println("ÀÜ¾×ÀÌ ºÎÁ·ÇÕ´Ï´Ù.\nÃâ±İ¾×À» ´Ù½Ã ÀÔ·ÂÇÏ·Á¸é rÀ» ´­·¯ÁÖ¼¼¿ä : \nÁ¾·á¸¦ ¿øÇÏ½Ã¸é eÀ» ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
									String key = sc.next();
									while(true) {
										if(key.equals("e")||key.equals("E")) {
											return;
										} else if(key.equals("r")||key.equals("R")) {
											System.out.println("Ãâ±İ¾× : ");
											money = sc.nextLong();
											break;
										} else {
											System.out.println("Àß¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
											key = sc.next();
											continue;
										}
									}
								}
							}
						} else {
							System.out.println("¾ç¼ö¸¸ Ãâ±İ°¡´ÉÇÕ´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä :");
							money = sc.nextInt();
							continue;
						}
					}
				}	
			} catch(Exception e) {
				System.out.println("°èÁÂ°¡ ¾ø½À´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
				accountNum = sc.next();
				continue;
			}
		}
	}

	//ÀÔ±İ
	private static void deposit() {
		System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¤");
		System.out.println("¦¢ ÀÔ±İ¦¢");
		System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¥");
		
		System.out.println("°èÁÂ ¹øÈ£ : ");
		String accountNum = sc.next();
		while(true) {	
			Account account;
			try {
				account = findAccount(accountNum); //È£Ãâ
				if(account==null) {
					System.out.println("°èÁÂ°¡ ¾ø½À´Ï´Ù. \n°èÁÂ»ı¼ºÀ» ¿øÇÏ½Ã¸é c¸¦ ´­·¯ÁÖ¼¼¿ä : \n´Ù½Ã ÀÔ·ÂÀ» ¿øÇÏ½Ã¸é rÀ» ´­·¯ÁÖ¼¼¿ä : \n³ª°¡±â¸¦ ¿øÇÏ½Ã¸é ¾Æ¹«Å°³ª ´­·¯ÁÖ¼¼¿ä : ");
					String key = sc.next();
					if(key.equals("c")||key.equals("C")) {
						createAccount();
						return;				
					} else if(key.equals("r")||key.equals("R")) {
						System.out.println("°èÁÂ ¹øÈ£ : ");
						accountNum = sc.next();
						continue;
							
					} else {
						System.out.println("Á¾·áµÇ¾ú½À´Ï´Ù.");
						break;
					}
				} else {
					System.out.println("ÀÔ±İ¾× : ");
					long money = sc.nextLong();
					while(true) {
						if(money>=0) {
							account.setBalace(account.getBalance() + money);
							System.out.println("Ã³¸® °á°ú : "+(formater.format(money))+"¿ø ÀÔ±İÀ» ¼º°øÇÏ¿´½À´Ï´Ù.");
							System.out.println("ÀÜ¾× : "+formater.format(account.getBalance())+"¿ø");
							return;
						} else {
							System.out.println("¾ç¼ö¸¸ Ãâ±İ°¡´ÉÇÕ´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä :");
							money = sc.nextInt();
							continue;
						}
					}
				}			
			} catch (Exception e) {
				System.out.println("°èÁÂ°¡ ¾ø½À´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
				accountNum = sc.next();
				continue;
			}
		}
	}

	//°èÁÂ ºñ±³ ¸Ş¼­µå
	private static Account findAccount(String accountNum) {
		Account account = null; //ÃÊ±â°ª ÁöÁ¤
		for(int i=0; i<accountArray.size(); i++) {
			String dbAccNum = accountArray.get(i).getAccountNum(); // ¹è¿­¿¡ ÀúÀåµÈ °èÁÂ¹øÈ£¸¦ ´ëÀÔ
			if(dbAccNum.equals(accountNum)) { //¿ÜºÎ ÀÔ·Â°èÁÂ¿Í ÀÏÄ¡ÇÏ¸é
				account = accountArray.get(i);
				break;
			}
		}
		return account;
	}
	

	//°èÁÂ ¸ñ·Ï ¸Ş¼­µå
	private static void accountList() {
		System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
		System.out.println("¦¢ °èÁÂ ¸ñ·Ï¦¢");
		System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
		System.out.println("°èÁÂ ¹øÈ£ : ");
		String accountNum = sc.next();
		final String administration = "admin";  //°ü¸®ÀÚ ÄÚµå
		
		while(true) {
			if(accountNum.equals(administration)) {
				for(int i=0;i<accountArray.size();i++) {
					Account account = accountArray.get(i);
					System.out.println(("ID : "+account.getCustomerNum())+"¹ø °í°´, °èÁÂ¹øÈ£ : "+account.getAccountNum()+", °í°´¸í : "+account.getOwner()+", ÀÜ¾× : "+formater.format(account.getBalance())+", µî±Ş : "+account.getRank()+", °Å·¡È½¼ö : "+account.getTransactionNum());
//					°í°´ ID - static ±¸Çö , Rank ±¸Çö
				}
				System.out.println("d. °í°´µ¥ÀÌÅÍ ¼Ò°Å\n³ª°¡±â¸¦ ¿øÇÏ½Ã¸é ¾Æ¹«Å°³ª ´­·¯ÁÖ¼¼¿ä.");
				String key=sc.next();
				if(key.equals("d")||key.equals("D")) {
					System.out.println("Áö¿ì°íÀÚÇÏ´Â °í°´ÀÇ ¹øÈ£¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
					String customerNum = sc.next();
					while(true) {
						if(comCustomNum(customerNum)) {
							deleteData(customerNum);
							return;
						} else {
							System.out.println("°èÁÂ°¡ ¾ø½À´Ï´Ù. \n°èÁÂ»ı¼ºÀ» ¿øÇÏ½Ã¸é c¸¦ ´­·¯ÁÖ¼¼¿ä : \n´Ù½Ã ÀÔ·ÂÀ» ¿øÇÏ½Ã¸é rÀ» ´­·¯ÁÖ¼¼¿ä : \n³ª°¡±â¸¦ ¿øÇÏ½Ã¸é ¾Æ¹«Å°³ª ´­·¯ÁÖ¼¼¿ä : ");
							String key1 = sc.next();
							if(key1.equals("c")||key1.equals("C")) {
								createAccount();
								return;				
							} else if(key1.equals("r")||key1.equals("R")) {
								System.out.println("°èÁÂ ¹øÈ£ : ");
								customerNum = sc.next();
								continue;
							} else {
								System.out.println("Á¾·áµÇ¾ú½À´Ï´Ù.");
								break;
							}
						} 
					}
				} else {
					System.out.println("Á¾·áµÇ¾ú½À´Ï´Ù.");
					return;
				}
			} else if(comAccount(accountNum)) {
				Account account = findAccount(accountNum);
				System.out.println(account.getAccountNum()+"   "+account.getOwner()+"   "+formater.format(account.getBalance())+"   "+account.getRank());
				break;
			} else {
				System.out.println("°èÁÂ°¡ ¾ø½À´Ï´Ù. \n°èÁÂ»ı¼ºÀ» ¿øÇÏ½Ã¸é c¸¦ ´­·¯ÁÖ¼¼¿ä : \n´Ù½Ã ÀÔ·ÂÀ» ¿øÇÏ½Ã¸é rÀ» ´­·¯ÁÖ¼¼¿ä : \n³ª°¡±â¸¦ ¿øÇÏ½Ã¸é ¾Æ¹«Å°³ª ´­·¯ÁÖ¼¼¿ä : ");
				String key = sc.next();
				if(key.equals("c")||key.equals("C")) {
					createAccount();
					return;				
				} else if(key.equals("r")||key.equals("R")) {
					System.out.println("°èÁÂ ¹øÈ£ : ");
					accountNum = sc.next();
					continue;
				} else {
					System.out.println("Á¾·áµÇ¾ú½À´Ï´Ù.");
					break;
				}
			}
		}
	}

	//°èÁÂ »ı¼º ¸Ş¼­µå
	private static void createAccount() {
		System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
		System.out.println("¦¢ °èÁÂ »ı¼º¦¢");
		System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
		System.out.println("°èÁÂ¹øÈ£ : ");
		String accountNum = sc.next();
		while(true) {
			if(accountNum.matches("^[0-9]*$")) {
				if(accountArray.size()==0) {
					generateAccount(accountNum);
					System.out.println("Ã³¸® °á°ú : °èÁÂ°¡ »ı¼ºµÇ¾ú½À´Ï´Ù.");
					break;
				} else {
					while(true) {
						if(comAccount(accountNum)) {
							System.out.println("¿À·ù : Áßº¹µÈ °èÁÂÀÔ´Ï´Ù, ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
							accountNum = sc.next();
							continue;
						} else {
							generateAccount(accountNum);
							System.out.println("Ã³¸® °á°ú : °èÁÂ°¡ »ı¼ºµÇ¾ú½À´Ï´Ù.");
							return;
						}
					}
				}
			} else {
				System.out.println("¼ıÀÚ¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
				accountNum = sc.next();
				continue;
			}
		}
	}
	
	//°èÁÂ Áßº¹ À¯¹« ¸Ş¼­µå
	private static boolean comAccount(String accountNum) {
		for(int i=0; i<accountArray.size(); i++) {
			String dbAccNum = accountArray.get(i).getAccountNum(); // ¹è¿­¿¡ ÀúÀåµÈ °èÁÂ¹øÈ£¸¦ ´ëÀÔ
			if(dbAccNum.equals(accountNum)) { //¿ÜºÎ ÀÔ·Â°èÁÂ¿Í ÀÏÄ¡ÇÏ¸é
				return true;
			}
		}
		return false;
	}
	
	//°í°´ ¹øÈ£ À¯¹« ¸Ş¼­µå
	private static boolean comCustomNum(String customerNum) {
		for(int i=0; i<accountArray.size(); i++) {
			long dbAccNum = accountArray.get(i).getCustomerNum(); // ¹è¿­¿¡ ÀúÀåµÈ °èÁÂ¹øÈ£¸¦ ´ëÀÔ
			long num = Long.parseLong(customerNum);
			if(dbAccNum==num) { //¿ÜºÎ ÀÔ·Â°èÁÂ¿Í ÀÏÄ¡ÇÏ¸é
				return true;
			}
		}
		return false;
	}
	
	//°èÁÂ »ı¼º ºÎ¼Ó ¸Ş¼­µå
	private static void generateAccount(String accountNum) {
		System.out.println("°èÁÂÁÖ : ");
		String owner = sc.next();
		while(true) {
			if(owner.matches("^[¤¡-¤¾¤¿-¤Ó°¡-ÆR]*$")||owner.matches("^[a-zA-Z]*$")) { //ÇÑ±Û ¶Ç´Â ¿µ¾î
				while(true){
					System.out.println("ÃÊ±â ÀÔ±İ¾× : ");
					long balance = sc.nextLong();
					if(balance>0) {
						Account newAccount = new Account(accountNum, owner, balance);
						accountArray.add(newAccount);
						System.out.println(newAccount.getAccountNum()+"   "+newAccount.getOwner()+"   "+formater.format(newAccount.getBalance())+"   "+newAccount.getRank());
						return;
					} else {
						System.out.println("¾ç¼ö¸¸ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");	
						continue;
					}
				}
			} else {
				System.out.println("[ÇÑ±Û] ¶Ç´Â [¿µ¹®]À» ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
				owner = sc.next();
				continue;
			}
		}
	}
	
	//°í°´ µ¥ÀÌÅÍ Á¦°Å ¸Ş¼­µå
	private static void deleteData(String customerNum) {
		int index = (Integer.parseInt(customerNum)-1);
		while(true) {
			if(index<=accountArray.size()) {
				System.out.println((index+1)+"¹ø °í°´´ÔÀÇ µ¥ÀÌÅÍ¸¦ Áö¿ó´Ï±î?, y/n");
				String key=sc.next();
				if(key.equals("y")||key.equals("Y")) {
					accountArray.remove(index); //Á¦°ÅÇÒ ÀÎµ¦½º
					for(int i=index;i<accountArray.size();i++) {
						accountArray.get(i).setCustomerNum(i+1); //°í°´ num °ø¶õ ¸Ş²Ù±â
					}
					Account.setSerialNum((accountArray.size())); //½Å±Ô »ı¼º °í°´ num ¸ÂÃß±â
					System.out.println((index+1)+"¹ø °í°´´ÔÀÇ µ¥ÀÌÅÍ¸¦ Áö¿ü½À´Ï´Ù.");
					return;
				} else if(key.equals("n")||key.equals("N")) {
					System.out.println("Ãë¼ÒµÇ¾ú½À´Ï´Ù.");
					return;
				} else {
					System.out.println("Àß¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù.");
				}
			} else {
				System.out.println("Àß¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä : (³ª°¡±â´Â e¸¦ ´­·¯ÁÖ¼¼¿ä.)");
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
