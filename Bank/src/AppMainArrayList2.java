import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class AppMainArrayList2 {
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
	13.°í°´¸ñ·Ï - °ü¸®ÀÚ¸ğµå- Á¤·Ä(¿À¸§Â÷¼ø,³»¸²Â÷¼ø) Ãß°¡
	14.°èÁÂ¹øÈ£ ÀÔ·Â ½Ã ºó °ø°£¿¡ 0 ³Ö°í Ãâ·Â ½Ã 000-000ÇüÅÂ·Î Ãâ·Â
 */

	private static ArrayList<Account> accountArray = new ArrayList<Account>();
	private static Scanner sc = new Scanner(System.in); 
	private static DecimalFormat formater = new DecimalFormat("###,###");
		
	

public static void main(String[] args) {
				
		System.out.println("                ÀºÇà ÇÁ·Î±×·¥ by Ahn            ");
//		try {
			while(true) {
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
					System.out.println("ÇÁ·Î±×·¥ Á¾·á");
					sc.close();
					
					return;
				} else {
					System.out.println("Áö¿øÇÏÁö ¾Ê´Â ±â´ÉÀÔ´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä.");
					continue;
				}
			}
//		}catch(Exception e) {
//			e.getMessage();
//		}finally {
//			System.out.println("ÇÁ·Î±×·¥ Á¾·á");
//			sc.close();
//		}
	}

	//¸ŞÀÎ ¸Ş¼­µå ½ÃÀÛ
	
	//Ãâ±İ
	private static void withdraw() {
		System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¤");
		System.out.println("¦¢ Ãâ±İ¦¢");
		System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¥");
		final int fees = 1500;
		System.out.println("°èÁÂ ¹øÈ£ : ");
		String s = sc.next();
		String accountNum = addZero(s, 6);
		while(true) {		
			Account account = findAccount(accountNum); //È£Ãâ
			try {
				if(account==null) {
					System.out.println("°èÁÂ°¡ ¾ø½À´Ï´Ù. \n°èÁÂ»ı¼ºÀ» ¿øÇÏ½Ã¸é C¸¦ ´­·¯ÁÖ¼¼¿ä : \n´Ù½Ã ÀÔ·ÂÀ» ¿øÇÏ½Ã¸é RÀ» ´­·¯ÁÖ¼¼¿ä : \n³ª°¡±â¸¦ ¿øÇÏ½Ã¸é ¾Æ¹«Å°³ª ´­·¯ÁÖ¼¼¿ä : ");
					String key = sc.next();
					if(key.equals("c")||key.equals("C")||key.equals("¤º")) {
						createAccount();
						return;				
					} else if(key.equals("r")||key.equals("R")||key.equals("¤¡")) {
						System.out.println("°èÁÂ ¹øÈ£ : ");
						s = sc.next();
						accountNum = addZero(s, 6);
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
											System.out.println("ÀÜ¾×ÀÌ ºÎÁ·ÇÕ´Ï´Ù.\nÃâ±İ¾×À» ´Ù½Ã ÀÔ·ÂÇÏ·Á¸é RÀ» ´­·¯ÁÖ¼¼¿ä : \nÁ¾·á¸¦ ¿øÇÏ½Ã¸é EÀ» ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
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
		String s = sc.next();
		String accountNum = addZero(s, 6);
		while(true) {	
			Account account;
			try {
				account = findAccount(accountNum); //È£Ãâ
				if(account==null) {
					System.out.println("°èÁÂ°¡ ¾ø½À´Ï´Ù. \n°èÁÂ»ı¼ºÀ» ¿øÇÏ½Ã¸é C¸¦ ´­·¯ÁÖ¼¼¿ä : \n´Ù½Ã ÀÔ·ÂÀ» ¿øÇÏ½Ã¸é RÀ» ´­·¯ÁÖ¼¼¿ä : \n³ª°¡±â¸¦ ¿øÇÏ½Ã¸é ¾Æ¹«Å°³ª ´­·¯ÁÖ¼¼¿ä : ");
					String key = sc.next();
					if(key.equals("c")||key.equals("C")||key.equals("¤º")) {
						createAccount();
						return;				
					} else if(key.equals("r")||key.equals("R")||key.equals("¤¡")) {
						System.out.println("°èÁÂ ¹øÈ£ : ");
						s = sc.next();
						accountNum = addZero(s, 6);
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
				s = sc.next();
				accountNum = addZero(s, 6);
				continue;
			}
		}
	}

	//°èÁÂ ºñ±³ ¸Ş¼­µå
	private static Account findAccount(String accountNum) {
		Account account = null; //ÃÊ±â°ª ÁöÁ¤
		for(Account a : accountArray) {
			String dbAccNum = a.getAccountNum(); // ¹è¿­¿¡ ÀúÀåµÈ °èÁÂ¹øÈ£¸¦ ´ëÀÔ
			if(dbAccNum.equals(accountNum)) { //¿ÜºÎ ÀÔ·Â°èÁÂ¿Í ÀÏÄ¡ÇÏ¸é
				account = a;
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
		String s = sc.next();
		String accountNum = addZero(s, 6);
		while(true) {
			final String administration = "0admin";  //°ü¸®ÀÚ ÄÚµå
			final String administration2 = "00¤±À¸¤Á¤Ì";  //°ü¸®ÀÚ ÄÚµå
			if(accountNum.matches("^[0-9]*$")||accountNum.equals(administration)||accountNum.equals(administration2)) {
				while(true) {
					if(accountNum.equals(administration)||accountNum.equals(administration2)) {
						for(int i=0;i<accountArray.size();i++) {
							Account account = accountArray.get(i);
//							System.out.println(("ID : "+account.getCustomerNum())+"¹ø °í°´, °èÁÂ¹øÈ£ : "+account.getAccountNum().replaceFirst("(//d{3})(//d{3})", "$2-$2")+", °í°´¸í : "+account.getOwner()+", ÀÜ¾× : "+formater.format(account.getBalance())+"¿ø, µî±Ş : "+account.getRank()+", °Å·¡È½¼ö : "+account.getTransactionNum());
							System.out.println("ID : "+account.getCustomerNum()+"¹ø °í°´, °èÁÂ¹øÈ£ : "+dash(account.getAccountNum())+", °í°´¸í : "+account.getOwner()+", ÀÜ¾× : "+formater.format(account.getBalance())+"¿ø, µî±Ş : "+account.getRank()+", °Å·¡È½¼ö : "+account.getTransactionNum());
//							°í°´ ID - static ±¸Çö , Rank ±¸Çö
						}
						System.out.println("D. °í°´µ¥ÀÌÅÍ ¼Ò°Å\nL. ±İ¾×º° Á¤·Ä\nM. °í°´µî±Ş °ü¸®\n³ª°¡±â¸¦ ¿øÇÏ½Ã¸é ¾Æ¹«Å°³ª ´­·¯ÁÖ¼¼¿ä.");
						String key=sc.next();
						if(key.equals("d")||key.equals("D")||key.equals("¤·")) {
							System.out.println("Áö¿ì°íÀÚÇÏ´Â °í°´ÀÇ ¹øÈ£¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
							String customerNum = sc.next();
							while(true) {
								if(comCustomNum(customerNum)) {
									deleteData(customerNum);
									return;
								} else {
									System.out.println("°èÁÂ°¡ ¾ø½À´Ï´Ù. \n°èÁÂ»ı¼ºÀ» ¿øÇÏ½Ã¸é C¸¦ ´­·¯ÁÖ¼¼¿ä : \n´Ù½Ã ÀÔ·ÂÀ» ¿øÇÏ½Ã¸é RÀ» ´­·¯ÁÖ¼¼¿ä : \n³ª°¡±â¸¦ ¿øÇÏ½Ã¸é ¾Æ¹«Å°³ª ´­·¯ÁÖ¼¼¿ä : ");
									key = sc.next();
									if(key.equals("c")||key.equals("C")||key.equals("¤º")) {
										createAccount();
										return;				
									} else if(key.equals("r")||key.equals("R")||key.equals("¤¡")) {
										System.out.println("°í°´ ¹øÈ£ : ");
										customerNum = sc.next();
										continue;
									} else {
										System.out.println("Á¾·áµÇ¾ú½À´Ï´Ù.");
										return;
									}
								} 
							}
						} else if (key.equals("L")||key.equals("l")||key.equals("¤Ó")){
							listSort();
							return;
						} else if (key.equals("M")||key.equals("m")||key.equals("¤Ñ")){
							System.out.println("µî±ŞÀ» Á¶Á¤ÇÏ°íÀÚ ÇÏ´Â °í°´ÀÇ ¹øÈ£¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
							String customerNum = sc.next();
							while(true) {
								if(comCustomNum(customerNum)) {
									manageRank(customerNum);
									return;
								} else {
									System.out.println("°èÁÂ°¡ ¾ø½À´Ï´Ù. \n°èÁÂ»ı¼ºÀ» ¿øÇÏ½Ã¸é C¸¦ ´­·¯ÁÖ¼¼¿ä : \n´Ù½Ã ÀÔ·ÂÀ» ¿øÇÏ½Ã¸é RÀ» ´­·¯ÁÖ¼¼¿ä : \n³ª°¡±â¸¦ ¿øÇÏ½Ã¸é ¾Æ¹«Å°³ª ´­·¯ÁÖ¼¼¿ä : ");
									key = sc.next();
									if(key.equals("c")||key.equals("C")||key.equals("¤º")) {
										createAccount();
										return;				
									} else if(key.equals("r")||key.equals("R")||key.equals("¤¡")) {
										System.out.println("°í°´ ¹øÈ£ : ");
										customerNum = sc.next();
										continue;
									} else {
										System.out.println("Á¾·áµÇ¾ú½À´Ï´Ù.");
										return;
									}
								} 
							}
						}else {
							System.out.println("Á¾·áµÇ¾ú½À´Ï´Ù.");
							return;
						}
					} else if(comAccount(accountNum)) {
						Account account = findAccount(accountNum);
						System.out.println("°í°´´ÔÀÇ ¼ºÇÔÀ» ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
						String owner = sc.next();
						while(true) {
							if(account.getOwner().equals(owner)) {
								System.out.println("°èÁÂ¹øÈ£ : "+dash(account.getAccountNum())+", °í°´¸í : "+account.getOwner()+", ÀÜ¾× : "+formater.format(account.getBalance())+"¿ø, µî±Ş : "+account.getRank());
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
							s = sc.next();
							accountNum = addZero(s, 6);
							continue;
						} else {
							System.out.println("Á¾·áµÇ¾ú½À´Ï´Ù.");
							return;
						}
					}
				}
			} else {
				System.out.println("¼ıÀÚ¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä");
				s = sc.next();
				accountNum = addZero(s, 6);
				continue;
			}
		}
	}

	//°èÁÂ »ı¼º ¸Ş¼­µå
	private static void createAccount() {
		System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
		System.out.println("¦¢ °èÁÂ »ı¼º¦¢");
		System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
		System.out.println("°èÁÂ¹øÈ£(6ÀÚ¸® ÀÌÇÏ ¼ıÀÚ¸¸) : ");
		final int accountNumLength = 6; //°èÁÂ¹øÈ£ ±æÀÌ Á¦ÇÑ
		String accountNum = sc.next();
		while(true) {
			if(accountNum.matches("^[0-9]*$")&&accountNum.length()<=accountNumLength) { //(//d)ÀÌ°í, 6ÀÚ¸® ÀÌÇÏÀÏ¶§
				String s = addZero(accountNum, 6);
				while(true) {
					if(accountNum.length()<7) {
						if(accountArray.size()==0) {
							generateAccount(s);
							System.out.println("Ã³¸® °á°ú : °èÁÂ°¡ »ı¼ºµÇ¾ú½À´Ï´Ù.");
							return;
						} else {
							while(true) {
								if(findAccount(accountNum)!=null) {
									System.out.println("¿À·ù : Áßº¹µÈ °èÁÂÀÔ´Ï´Ù, ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
									accountNum = sc.next();
									continue;
								} else {
									generateAccount(s);
									System.out.println("Ã³¸® °á°ú : °èÁÂ°¡ »ı¼ºµÇ¾ú½À´Ï´Ù.");
									return;
								}
							}
						}
					} else if(accountNum.matches("^[0-9]*$")) {
						System.out.println("¼ıÀÚ¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
						accountNum = sc.next();
						s = addZero(accountNum, 6);
						continue;
					} else {
						System.out.println("6ÀÚ¸® ÀÌÇÏ·Î ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
						accountNum = sc.next();
						s = addZero(accountNum, 6);
						continue;
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
		System.out.println("°èÁÂÁÖ(ÇÑ±Û, ¿µ¹®¸¸) : ");
		String owner = sc.next();
		while(true) {
			if(owner.matches("^[¤¡-¤¾¤¿-¤Ó°¡-ÆR]*$")||owner.matches("^[a-zA-Z]*$")) { //ÇÑ±Û ¶Ç´Â ¿µ¾î
				System.out.println("ÃÊ±â ÀÔ±İ¾×(¾ç¼ö) : ");
				String temp = sc.next();
				while(true){
					try {
						long balance = Long.parseLong(temp);
						if(balance>0&&temp.matches("^[0-9]*$")) {
							Account newAccount = new Account(accountNum, owner, balance);
							accountArray.add(newAccount);
							newAccount.getAccountNum();
//							String c = String.valueOf(Long.parseLong(newAccount.getAccountNum())).replaceFirst("(\\d{3})(^\\d{3})", "$2-$2");
							System.out.println("°èÁÂ¹øÈ£ : "+dash(newAccount.getAccountNum())+", °í°´¸í : "+newAccount.getOwner()+", ÀÜ¾× : "+formater.format(newAccount.getBalance())+", µî±Ş : "+newAccount.getRank());
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
				System.out.println((index+1)+"¹ø °í°´´ÔÀÇ µ¥ÀÌÅÍ¸¦ Áö¿ó´Ï±î?, Y/N");
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
				System.out.println("Àß¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä : (³ª°¡±â´Â E¸¦ ´­·¯ÁÖ¼¼¿ä.)");
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
	
	//±İ¾×º° °í°´ Á¤·Ä (¿À¸§Â÷¼ø, ³»¸²Â÷¼ø)
	private static void listSort() {
		//±âÁ¸ÀÇ ArrayList¿¡ ¿µÇâÀ» ¾ÈÁÙ·Á°í »õ·Î ¸¸µë
		ArrayList<Account> accountArrTemp = new ArrayList<Account>(); 
		ArrayList<Account> accountArrTemp2 = new ArrayList<Account>();
		for(int k=0;k<accountArray.size();k++) {
			accountArrTemp.add(k,accountArray.get(k));
		}
		System.out.println("A. ¿À¸§Â÷¼ø\nD. ³»¸²Â÷¼ø\n³ª°¡±â¸¦ ¿øÇÏ½Ã¸é ¾Æ¹«Å°³ª ´­·¯ÁÖ¼¼¿ä.");
		String key = sc.next();
		while(true) {
			if(key.equals("d")||key.equals("D")||key.equals("¤·")) {
				for(int i=0;i<accountArray.size();i++) {
					for(int j=0;j<(accountArray.size()-1);j++) {
						if(accountArrTemp.get(j).getBalance()<accountArrTemp.get(j+1).getBalance()) {
							accountArrTemp2.add(j,accountArrTemp.get(j));
							accountArrTemp.set(j,accountArrTemp.get(j+1));
							accountArrTemp.set(j+1,accountArrTemp2.get(j));
						} else {
							accountArrTemp2.add(j,accountArrTemp.get(j)); //¸¸¾à Ã¹¹øÂ° ÀÎµ¦½ºÀÎ j°¡ j+1º¸´Ù Å¬¶§ temp2°ø°£ ÁÖ±âÀ§ÇØ¼­
						}
					}
				}
			} else if(key.equals("a")||key.equals("A")||key.equals("¤±")) {
				for(int i=0;i<accountArray.size();i++) {
					for(int j=0;j<(accountArray.size()-1);j++) {
						if(accountArrTemp.get(j).getBalance()>accountArrTemp.get(j+1).getBalance()) {
							accountArrTemp2.add(j,accountArrTemp.get(j));
							accountArrTemp.set(j,accountArrTemp.get(j+1));
							accountArrTemp.set(j+1,accountArrTemp2.get(j));
						} else {
							accountArrTemp2.add(j,accountArrTemp.get(j)); //¸¸¾à Ã¹¹øÂ° ÀÎµ¦½ºÀÎ j°¡ j+1º¸´Ù ÀÛÀ»¶§ temp2°ø°£ ÁÖ±âÀ§ÇØ¼­
						}
					}
				}
			} else {
				System.out.println("Á¾·áµË´Ï´Ù.");
				return;
			}
			for(Account account : accountArrTemp) {
//				Account account = accountArrTemp.get(i);
				System.out.println(("ID : "+account.getCustomerNum())+"¹ø °í°´, °èÁÂ¹øÈ£ : "+account.getAccountNum().replaceFirst("(\\d{3})(\\d+)", "$2-$2")+", °í°´¸í : "+account.getOwner()+", ÀÜ¾× : "+formater.format(account.getBalance())+"¿ø, µî±Ş : "+account.getRank()+", °Å·¡È½¼ö : "+account.getTransactionNum());
			}
			break;
		}
	}

	//°í°´ µî±Ş Á¶Á¤ ¸Ş¼­µå
	private static void manageRank(String customerNum) {
		int index = (Integer.parseInt(customerNum)-1);
		while(true) {
			if(index<=accountArray.size()) {
				String temp = accountArray.get(index).getRank();
				System.out.println((index+1)+"¹ø("+accountArray.get(index).getAccountNum()+") °í°´´ÔÀÇ µî±ŞÀº "+temp+"ÀÔ´Ï´Ù.\nÁ¶Á¤ÇÏ°íÀÚ ÇÏ´Â ·©Å©¸¦ ÀÔ·ÂÇÏ¼¼¿ä.\n"+
									"1. White | 2. Brown | 3. Silver | 4. Gold | 5. VIP");
				String key=sc.next();
				if(key.equals("1")) {
					accountArray.get(index).setRank("White");
					System.out.println(accountArray.get(index).getCustomerNum()+"¹ø("+accountArray.get(index).getAccountNum()+")°í°´´ÔÀÇ µî±ŞÀÌ "+temp+"¿¡¼­ "+accountArray.get(index).getRank()+"·Î Á¶Á¤µÇ¾ú½À´Ï´Ù.");
					return;
				} else if (key.equals("2")) {
					accountArray.get(index).setRank("Brown");
					System.out.println(accountArray.get(index).getCustomerNum()+"¹ø("+accountArray.get(index).getAccountNum()+")°í°´´ÔÀÇ µî±ŞÀÌ "+temp+"¿¡¼­ "+accountArray.get(index).getRank()+"·Î Á¶Á¤µÇ¾ú½À´Ï´Ù.");
					return;
				} else if (key.equals("3")) {
					accountArray.get(index).setRank("Silver");
					System.out.println(accountArray.get(index).getCustomerNum()+"¹ø("+accountArray.get(index).getAccountNum()+")°í°´´ÔÀÇ µî±ŞÀÌ "+temp+"¿¡¼­ "+accountArray.get(index).getRank()+"·Î Á¶Á¤µÇ¾ú½À´Ï´Ù.");
					return;
				} else if (key.equals("4")) {
					accountArray.get(index).setRank("Gold");
					System.out.println(accountArray.get(index).getCustomerNum()+"¹ø("+accountArray.get(index).getAccountNum()+")°í°´´ÔÀÇ µî±ŞÀÌ "+temp+"¿¡¼­ "+accountArray.get(index).getRank()+"·Î Á¶Á¤µÇ¾ú½À´Ï´Ù.");
					return;
				} else if (key.equals("5")) {
					accountArray.get(index).setRank("VIP");
					System.out.println(accountArray.get(index).getCustomerNum()+"¹ø("+accountArray.get(index).getAccountNum()+")°í°´´ÔÀÇ µî±ŞÀÌ "+temp+"¿¡¼­ "+accountArray.get(index).getRank()+"·Î Á¶Á¤µÇ¾ú½À´Ï´Ù.");
					return;
				} else {
					System.out.println("Àß¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù.");
				}
				
			} else {
				System.out.println("Àß¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä : (³ª°¡±â´Â E¸¦ ´­·¯ÁÖ¼¼¿ä.)");
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
	
	//0ºÙ¿©ÁÖ±â
	public static String addZero(String accountNum, int accountNumLength) {
		String result = "";
		if (accountNumLength < accountNum.length())
			return accountNum;
		for (int i = 0; i < accountNumLength - accountNum.length(); i++)
			result = result + "0";
		return result + accountNum;
	}
	
	//println)°èÁÂ¹øÈ£¿¡ "'000'-000"ºÙ¿©ÁÖ±â - ¾Õ
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
	//°èÁÂ¹øÈ£¿¡ "000-'000'"ºÙ¿©ÁÖ±â - µÚ
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

