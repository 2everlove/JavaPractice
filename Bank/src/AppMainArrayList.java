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
	10.°í°´ µ¥ÀÌÅÍ Á¦°Å ½Ã °ø¶õÀÌ µÈ °í°´ ¾ÆÀÌµğ ±âÁ¸ °í°´À¸·Î ´ëÃ¼
	11.°í°´º° µî±Ş¿¡ µû¶ó Ãâ±İ ½Ã ¼ö¼ö·á °¨¸é
	12.ÀÚÀßÇÑ ¹ö±× ¼öÁ¤(¼ıÀÚ(°èÁÂ¹øÈ£, ÀÔÃâ±İ¾×)ÀÔ·Â ¶õ¿¡ String ÀÔ·Â ½Ã error ´ë½Å ´Ù½Ã ÀÔ·ÂÇÏ°Ô ¹Ù²Ş)
 */

	private static ArrayList<Account> accountArray = new ArrayList<Account>();
	private static Scanner sc = new Scanner(System.in); 
	private static DecimalFormat formater = new DecimalFormat("###,###");
	

	public static void main(String[] args) {
				
		System.out.println("                ÀºÇà ÇÁ·Î±×·¥ by Ahn            ");
		try {
			while(true) {
				System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
				System.out.println("¦¢ 1. °èÁÂ »ı¼º ¦¢ 2. °èÁÂ¸ñ·Ï ¦¢ 3. ÀÔ±Ş ¦¢ 4. Ãâ±İ ¦¢ 5. °èÁÂ°Ë»ö ¦¢ 6. °èÁÂ»èÁ¦ ¦¢ 7. Á¾·á ¦¢");
				System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
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
					selectAccount();
				} else if(selNum.equals("6")) {
					remobeAccount();
				} else if(selNum.equals("7")) {
					System.out.println("ÇÁ·Î±×·¥ Á¾·á");
					sc.close();
					return;
				} else {
					System.out.println("Áö¿øÇÏÁö ¾Ê´Â ±â´ÉÀÔ´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä.");
					continue;
				}
			}
		}catch(Exception e) {
			e.getMessage();
		}finally {
			System.out.println("ÇÁ·Î±×·¥ Á¾·á");
			sc.close();
		}
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
					if(key.equals("c")||key.equals("C")||key.equals("¤º")) {
						createAccount();
						return;				
					} else if(key.equals("r")||key.equals("R")||key.equals("¤¡")) {
						System.out.println("°èÁÂ ¹øÈ£ : ");
						accountNum = sc.next();
						continue;
							
					} else {
						System.out.println("Á¾·áµÇ¾ú½À´Ï´Ù.");
						break;
					}
				} else {
					System.out.println("Ãâ±İ¾× : ");
					String temp = sc.next();
					while(true) {
						try {
							long money = Long.parseLong(temp);
							if(money>0&&temp.matches("^[0-9]*$")) {
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
												if(key.equals("e")||key.equals("E")||key.equals("¤§")) {
													return;
												} else if(key.equals("r")||key.equals("R")||key.equals("¤¡")) {
													System.out.println("Ãâ±İ¾× : ");
													temp = sc.next();
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
							} else {
								System.out.println("¼ıÀÚ¸¸ ÀÔ·ÂÇÏ¼¼¿ä : ");
								temp = sc.next();
								continue;
							}
						} catch(Exception e) { //pareLongÀ¸·Î tempÀÇ µ¥ÀÌÅÍ¸¦ longÇü º¯È¯ÇÒ¶§ ¿À·ù°¡ ¹ß»ıÇÏ¸é ¿©±â·Î ¿È 
							System.out.println("¼ıÀÚ¸¸ ÀÔ·ÂÇÏ¼¼¿ä : ");
							temp = sc.next();
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
					if(key.equals("c")||key.equals("C")||key.equals("¤º")) {
						createAccount();
						return;				
					} else if(key.equals("r")||key.equals("R")||key.equals("¤¡")) {
						System.out.println("°èÁÂ ¹øÈ£ : ");
						accountNum = sc.next();
						continue;
							
					} else {
						System.out.println("Á¾·áµÇ¾ú½À´Ï´Ù.");
						break;
					}
				} else {
					System.out.println("ÀÔ±İ¾× : ");
					String temp = sc.next();
					while(true) {
						try {
							long money = Long.parseLong(temp);
							if(money>0&&temp.matches("^[0-9]*$")) {
								if(money>=0) {
									account.setBalace(account.getBalance() + money);
									System.out.println("Ã³¸® °á°ú : "+(formater.format(money))+"¿ø ÀÔ±İÀ» ¼º°øÇÏ¿´½À´Ï´Ù.");
									System.out.println("ÀÜ¾× : "+formater.format(account.getBalance())+"¿ø");
									return;
								} else {
									System.out.println("¾ç¼ö¸¸ ÀÔ±İ°¡´ÉÇÕ´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä :");
									temp = sc.next();
									continue;
								}
							} else {
								System.out.println("¼ıÀÚ¸¸ ÀÔ·ÂÇÏ¼¼¿ä : ");
								temp = sc.next();
								continue;
							}
						} catch(Exception e) {
							System.out.println("¼ıÀÚ¸¸ ÀÔ·ÂÇÏ¼¼¿ä : ");
							temp = sc.next();
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
	
	//°èÁÂ »èÁ¦
	private static void remobeAccount() {
		System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
		System.out.println("¦¢ °èÁÂ °Ë»ö¦¢");
		System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
		System.out.println("°èÁÂ ¹øÈ£ : ");
		String accountNum = sc.next();
		for(int i=0; i<accountArray.size();i++) {
			while(true) {
				Account account = findAccount(accountNum);
				if(account==null) {
					System.out.println("Ã³¸® °á°ú : °èÁÂ°¡ ¾ø½À´Ï´Ù, ´Ù½Ã ÀÔ·ÂÇØ ÁÖ¼¼¿ä:");
					System.out.println("°èÁÂ ¹øÈ£ : ");
					accountNum = sc.next();
				} else {
					accountArray.remove(account);
					System.out.println("Ã³¸® °á°ú : °èÁÂ°¡ »èÁ¦µÇ¾ú½À´Ï´Ù.");
					break;
				}
			}
		}
	}
	
	//°èÁÂ °Ë»ö
	private static void selectAccount() {
		System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
		System.out.println("¦¢ °èÁÂ °Ë»ö¦¢");
		System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
		System.out.println("°èÁÂ ¹øÈ£ : ");
		String accountNum = sc.next();
		while(true) {
			Account account = findAccount(accountNum);
			if(account==null) {
				System.out.println("Ã³¸® °á°ú : °èÁÂ°¡ ¾ø½À´Ï´Ù, ´Ù½Ã ÀÔ·ÂÇØ ÁÖ¼¼¿ä:");
				System.out.println("°èÁÂ ¹øÈ£ : ");
				accountNum = sc.next();
				continue;
			} else {
				System.out.println("°èÁÂ ¹øÈ£ : "+account.getAccountNum());
				System.out.println("°èÁÂÁÖ : "+account.getOwner());
				System.out.printf("°èÁÂ ¹øÈ£ : %,d¿ø\n", account.getBalance());
				break;
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
		while(true) {
			final String administration = "admin";  //°ü¸®ÀÚ ÄÚµå
			final String administration2 = "¤±À¸¤Á¤Ì";  //°ü¸®ÀÚ ÄÚµå
			if(accountNum.matches("^[0-9]*$")||accountNum.equals(administration)||accountNum.equals(administration2)) {
				while(true) {
					if(accountNum.equals(administration)||accountNum.equals(administration2)) {
						for(int i=0;i<accountArray.size();i++) {
							Account account = accountArray.get(i);
							System.out.println(("ID : "+account.getCustomerNum())+"¹ø °í°´, °èÁÂ¹øÈ£ : "+formater.format(Long.parseLong(account.getAccountNum()))+", °í°´¸í : "+account.getOwner()+", ÀÜ¾× : "+formater.format(account.getBalance())+", µî±Ş : "+account.getRank()+", °Å·¡È½¼ö : "+account.getTransactionNum());
//							°í°´ ID - static ±¸Çö , Rank ±¸Çö
						}
						System.out.println("d. °í°´µ¥ÀÌÅÍ ¼Ò°Å\n³ª°¡±â¸¦ ¿øÇÏ½Ã¸é ¾Æ¹«Å°³ª ´­·¯ÁÖ¼¼¿ä.");
						String key=sc.next();
						if(key.equals("d")||key.equals("D")||key.equals("¤·")) {
							System.out.println("Áö¿ì°íÀÚÇÏ´Â °í°´ÀÇ ¹øÈ£¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
							String customerNum = sc.next();
							while(true) {
								if(comCustomNum(customerNum)) {
									deleteData(customerNum);
									return;
								} else {
									System.out.println("°èÁÂ°¡ ¾ø½À´Ï´Ù. \n°èÁÂ»ı¼ºÀ» ¿øÇÏ½Ã¸é c¸¦ ´­·¯ÁÖ¼¼¿ä : \n´Ù½Ã ÀÔ·ÂÀ» ¿øÇÏ½Ã¸é rÀ» ´­·¯ÁÖ¼¼¿ä : \n³ª°¡±â¸¦ ¿øÇÏ½Ã¸é ¾Æ¹«Å°³ª ´­·¯ÁÖ¼¼¿ä : ");
									key = sc.next();
									if(key.equals("c")||key.equals("C")||key.equals("¤º")) {
										createAccount();
										return;				
									} else if(key.equals("r")||key.equals("R")||key.equals("¤¡")) {
										System.out.println("°èÁÂ ¹øÈ£ : ");
										customerNum = sc.next();
										continue;
									} else {
										System.out.println("Á¾·áµÇ¾ú½À´Ï´Ù.");
										return;
									}
								} 
							}
						} else {
							System.out.println("Á¾·áµÇ¾ú½À´Ï´Ù.");
							return;
						}
					} else if(comAccount(accountNum)) {
						Account account = findAccount(accountNum);
						System.out.println("°í°´´ÔÀÇ ¼ºÇÔÀ» ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
						String owner = sc.next();
						while(true) {
							if(account.getOwner().equals(owner)) {
								System.out.println("°èÁÂ¹øÈ£ : "+formater.format(Long.parseLong(account.getAccountNum()))+", °í°´¸í : "+account.getOwner()+", ÀÜ¾× : "+formater.format(account.getBalance())+", µî±Ş : "+account.getRank());
								return;
							} else {
								System.out.println("Àß¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù.\n´Ù½Ã ÀÔ·ÂÀ» ¿øÇÏ½Ã¸é rÀ» ´­·¯ÁÖ¼¼¿ä : \n³ª°¡±â¸¦ ¿øÇÏ½Ã¸é ¾Æ¹«Å°³ª ´­·¯ÁÖ¼¼¿ä : ");
								String key = sc.next();
								if(key.equals("r")||key.equals("R")||key.equals("¤¡")) {
									System.out.println("°í°´´ÔÀÇ ¼ºÇÔÀ» ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
									owner = sc.next();
									continue;													
								} else {
									System.out.println("Á¾·áµÇ¾ú½À´Ï´Ù.");
									return;
								}
							}
						}
					} else {
						System.out.println("°èÁÂ°¡ ¾ø½À´Ï´Ù. \n°èÁÂ»ı¼ºÀ» ¿øÇÏ½Ã¸é c¸¦ ´­·¯ÁÖ¼¼¿ä : \n´Ù½Ã ÀÔ·ÂÀ» ¿øÇÏ½Ã¸é rÀ» ´­·¯ÁÖ¼¼¿ä : \n³ª°¡±â¸¦ ¿øÇÏ½Ã¸é ¾Æ¹«Å°³ª ´­·¯ÁÖ¼¼¿ä : ");
						String key = sc.next();
						if(key.equals("c")||key.equals("C")||key.equals("¤º")) {
							createAccount();
							return;				
						} else if(key.equals("r")||key.equals("R")||key.equals("¤¡")) {
							System.out.println("°èÁÂ ¹øÈ£ : ");
							accountNum = sc.next();
							continue;
						} else {
							System.out.println("Á¾·áµÇ¾ú½À´Ï´Ù.");
							return;
						}
					}
				}
			} else {
				System.out.println("¼ıÀÚ¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä");
				accountNum = sc.next();
				continue;
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
			long dbAccNum = accountArray.get(i).getCustomerNum(); // ¹è¿­¿¡ ÀúÀåµÈ °í°´¹øÈ£¸¦ ´ëÀÔ
			long num = Long.parseLong(customerNum);
			if(dbAccNum==num) { //¿ÜºÎ °í°´¹øÈ£¿Í ÀÏÄ¡ÇÏ¸é
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
				System.out.println("ÃÊ±â ÀÔ±İ¾× : ");
				String temp = sc.next();
				while(true){
					try {
						long balance = Long.parseLong(temp);
						if(balance>0&&temp.matches("^[0-9]*$")) {
							Account newAccount = new Account(accountNum, owner, balance);
							accountArray.add(newAccount);
							System.out.println("°èÁÂ¹øÈ£ : "+formater.format(Long.parseLong(newAccount.getAccountNum()))+", °í°´¸í : "+newAccount.getOwner()+", ÀÜ¾× : "+formater.format(newAccount.getBalance())+", µî±Ş : "+newAccount.getRank());
							return;
						} else {
							System.out.println("¾ç¼ö¸¸ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
							temp = sc.next();
							continue;
						}
					}catch(Exception e) {
//						System.out.println("("+e+")\n¼ıÀÚ¸¸ ÀÔ·ÂÇÏ¼¼¿ä : "); //¿À·ù°ª Ãâ·Â
						System.out.println("¼ıÀÚ¸¸ ÀÔ·ÂÇÏ¼¼¿ä : ");
						temp = sc.next();
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
				if(key.equals("y")||key.equals("Y")||key.equals("¤Ë")) {
					accountArray.remove(index); //Á¦°ÅÇÒ ÀÎµ¦½º
					for(int i=index;i<accountArray.size();i++) {
						accountArray.get(i).setCustomerNum(i+1); //staticÀ¸·Î ¼³Á¤µÈ °í°´ num °ø¶õ ¸Ş²Ù±â
					}
					Account.setSerialNum((accountArray.size())); //°í°´ µ¥ÀÌÅÍ »èÁ¦¿¡ µû¸¥ static °í°´ numÀ» ½Å±Ô »ı¼º °í°´ num¿¡ ¿Ã¹Ù¸£°Ô Áõ°¡ÇÏ°Ô ¸¸µé±â
					System.out.println((index+1)+"¹ø °í°´´ÔÀÇ µ¥ÀÌÅÍ¸¦ Áö¿ü½À´Ï´Ù.");
					return;
				} else if(key.equals("n")||key.equals("N")||key.equals("¤Ì")) {
					System.out.println("Ãë¼ÒµÇ¾ú½À´Ï´Ù.");
					return;
				} else {
					System.out.println("Àß¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù.");
				}
			} else {
				System.out.println("Àß¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä : (³ª°¡±â´Â e¸¦ ´­·¯ÁÖ¼¼¿ä.)");
				String key=sc.next();
				if(key.equals("e")||key.equals("E")||key.equals("¤§")) {
					return;
				} else {
					index = (int) sc.nextLong();
					continue;
				}
			}
		}
	}
	
	private static void listSort() {
		
	}
	
	//¿¢¼¿ÆÄÀÏ·Î Ãâ·Â
//	private static void createBook() {
//		HSSFWorkbook workbook = new HSSFWorkbook(); // »õ ¿¢¼¿ »ı¼º
//        HSSFSheet sheet = workbook.createSheet("½ÃÆ®¸í"); // »õ ½ÃÆ®(Sheet) »ı¼º
//        HSSFRow row = sheet.createRow(0); // ¿¢¼¿ÀÇ ÇàÀº 0¹øºÎÅÍ ½ÃÀÛ
//        HSSFCell cell = row.createCell(0); // ÇàÀÇ ¼¿Àº 0¹øºÎÅÍ ½ÃÀÛ
//        cell.setCellValue("Å×½ºÆ® µ¥ÀÌÅÍ"); //»ı¼ºÇÑ ¼¿¿¡ µ¥ÀÌÅÍ »ğÀÔ
//        try {
//            FileOutputStream fileoutputstream = new FileOutputStream("ÀúÀåÇÒ °æ·Î/ÀÌ¸§.xlsx");
//            workbook.write(fileoutputstream);
//            fileoutputstream.close();
//            System.out.println("¿¢¼¿ÆÄÀÏ»ı¼º¼º°ø");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("¿¢¼¿ÆÄÀÏ»ı¼º½ÇÆĞ");
//        }
//	}
}
