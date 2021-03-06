import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class AppMainArrayList3 {
/*
  구현 list
	1.계좌중복 x (method)
	2.고객번호 부여(Account.class -> Static)
	3.고객별 거래횟수(Account.class)
	4.금액별 고객 등급 부여
	5.계좌생성x -> 입출금 시 계좌생성
	6.계좌번호&입출금액에 양수만 입력
	7.계좌주(한글, 영문) 입력
	8.입출금 양수만 입력
	9.고객목록 - 관리자 모드 추가 - 고객 데이터 제거
	10.고객 데이터 제거 시 공란이 된 고객 아이디 기존 고객으로 대체
	11.고객별 등급에 따라 출금 시 수수료 감면
	12.자잘한 버그 수정(숫자(계좌번호, 입출금액)입력 란에 String 입력 시 error 대신 다시 입력하게 바꿈)
	13.고객목록 - 관리자모드- 정렬(오름차순,내림차순) 추가
	14.계좌번호 입력 시 빈 공간에 0 넣고 출력 시 000-000형태로 출력
 */

	private static ArrayList<Account> accountArray = new ArrayList<Account>();
	private static Scanner sc = new Scanner(System.in); 
	private static DecimalFormat formater = new DecimalFormat("###,###");
		
	

public static void main(String[] args) {
				
		System.out.println("                                은행 프로그램 by Ahn            ");
//		try {
			while(true) {
				System.out.println("┌───────────────────────────────────────────────────────────────────────────────────────────────┐");
				System.out.println("│ 1. 계좌 생성 │ 2. 계좌목록 │ 3. 입급 │ 4. 출금 │ 5. 계좌검색 │ 6. 계좌삭제 │ 7. 계좌정렬 │ 8. 종료 │");
				System.out.println("└───────────────────────────────────────────────────────────────────────────────────────────────┘");
				System.out.println("선택> ");
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
					searchList();
				} else if(selNum.equals("6")) {
					deleteData();
				} else if(selNum.equals("7")) {
					listSort();
				} else if(selNum.equals("8")) {
					System.out.println("프로그램 종료");
					sc.close();
					return;
				} else {
					System.out.println("지원하지 않는 기능입니다. 다시 입력해주세요.");
					continue;
				}
			}
//		}catch(Exception e) {
//			e.getMessage();
//		}finally {
//			System.out.println("프로그램 종료");
//			sc.close();
//		}
	}

	//메인 메서드 시작
	
	//출금
	private static void withdraw() {
		System.out.println("┌─────┐");
		System.out.println("│ 출금│");
		System.out.println("└─────┘");
		final int fees = 1500;
		System.out.println("계좌 번호 : ");
		String s = sc.next();
		String accountNum = addZero(s, 6);
		while(true) {		
			Account account = findAccount(accountNum); //호출
			try {
				if(account==null) {
					System.out.println("계좌가 없습니다. \n계좌생성을 원하시면 C를 눌러주세요 : \n다시 입력을 원하시면 R을 눌러주세요 : \n나가기를 원하시면 아무키나 눌러주세요 : ");
					String key = sc.next();
					if(key.equals("c")||key.equals("C")||key.equals("ㅊ")) {
						createAccount();
						return;				
					} else if(key.equals("r")||key.equals("R")||key.equals("ㄱ")) {
						System.out.println("계좌 번호 : ");
						s = sc.next();
						accountNum = addZero(s, 6);
						continue;
							
					} else {
						System.out.println("종료되었습니다.");
						break;
					}
				} else {
					System.out.println("출금액 : ");
					String temp = sc.next();
					while(true) {
						try {
							long money = Long.parseLong(temp);
							if(money>0&&temp.matches("^[0-9]*$")) {
								if(money>=0) {
									while(true) {
										if(account.getBalance()>(money+fees)) {
											if(account.getRank()=="Silver"||account.getRank()=="Gold"||account.getRank()=="VIP") {
												System.out.println("우수고객(수수료 감면)");
												account.setBalace(account.getBalance() - money);
												System.out.println("처리 결과 : "+(formater.format(money))+"원 출금을 성공하였습니다.");
												System.out.println("잔액 : "+formater.format(account.getBalance())+"원");
												return;
											} else {
												System.out.println("일반고객");
												account.setBalace(account.getBalance() - money + fees);
												System.out.println("처리 결과 : "+(formater.format(money+fees))+"원(수수료 : " +(formater.format(fees))+") 출금을 성공하였습니다.");
												System.out.println("잔액 : "+formater.format(account.getBalance())+"원");
												return;
											}
										} else {
											System.out.println("잔액이 부족합니다.\n출금액을 다시 입력하려면 R을 눌러주세요 : \n종료를 원하시면 E을 입력해주세요 : ");
											String key = sc.next();
											while(true) {
												if(key.equals("e")||key.equals("E")||key.equals("ㄷ")) {
													return;
												} else if(key.equals("r")||key.equals("R")||key.equals("ㄱ")) {
													System.out.println("출금액 : ");
													temp = sc.next();
													break;
												} else {
													System.out.println("잘못 입력하셨습니다. 다시 입력해주세요 : ");
													key = sc.next();
													continue;
												}
											}
										}
									}
								} else {
									System.out.println("양수만 출금가능합니다. 다시 입력해주세요 :");
									money = sc.nextInt();
									continue;
								}
							} else {
								System.out.println("숫자만 입력하세요 : ");
								temp = sc.next();
								continue;
							}
						} catch(Exception e) { //pareLong으로 temp의 데이터를 long형 변환할때 오류가 발생하면 여기로 옴 
							System.out.println("숫자만 입력하세요 : ");
							temp = sc.next();
							continue;
						}
					}
				}	
			} catch(Exception e) {
				System.out.println("계좌가 없습니다. 다시 입력해주세요 : ");
				accountNum = sc.next();
				continue;
			}
		}
	}

	//입금
	private static void deposit() {
		System.out.println("┌─────┐");
		System.out.println("│ 입금│");
		System.out.println("└─────┘");
		System.out.println("계좌 번호 : ");
		String s = sc.next();
		String accountNum = addZero(s, 6);
		while(true) {	
			Account account;
			try {
				account = findAccount(accountNum); //호출
				if(account==null) {
					System.out.println("계좌가 없습니다. \n계좌생성을 원하시면 C를 눌러주세요 : \n다시 입력을 원하시면 R을 눌러주세요 : \n나가기를 원하시면 아무키나 눌러주세요 : ");
					String key = sc.next();
					if(key.equals("c")||key.equals("C")||key.equals("ㅊ")) {
						createAccount();
						return;				
					} else if(key.equals("r")||key.equals("R")||key.equals("ㄱ")) {
						System.out.println("계좌 번호 : ");
						s = sc.next();
						accountNum = addZero(s, 6);
						continue;
							
					} else {
						System.out.println("종료되었습니다.");
						break;
					}
				} else {
					System.out.println("입금액 : ");
					String temp = sc.next();
					while(true) {
						try {
							long money = Long.parseLong(temp);
							if(money>0&&temp.matches("^[0-9]*$")) {
								if(money>=0) {
									account.setBalace(account.getBalance() + money);
									System.out.println("처리 결과 : "+(formater.format(money))+"원 입금을 성공하였습니다.");
									System.out.println("잔액 : "+formater.format(account.getBalance())+"원");
									return;
								} else {
									System.out.println("양수만 입금가능합니다. 다시 입력해주세요 :");
									temp = sc.next();
									continue;
								}
							} else {
								System.out.println("숫자만 입력하세요 : ");
								temp = sc.next();
								continue;
							}
						} catch(Exception e) {
							System.out.println("숫자만 입력하세요 : ");
							temp = sc.next();
							continue;
						}	
					}
				}			
			} catch (Exception e) {
				System.out.println("계좌가 없습니다. 다시 입력해주세요 : ");
				s = sc.next();
				accountNum = addZero(s, 6);
				continue;
			}
		}
	}

	//계좌 비교 메서드
	private static Account findAccount(String accountNum) {
		Account account = null; //초기값 지정
		for(Account a : accountArray) {
			String dbAccNum = a.getAccountNum(); // 배열에 저장된 계좌번호를 대입
			if(dbAccNum.equals(accountNum)) { //외부 입력계좌와 일치하면
				account = a;
				break;
			}
		}
		return account;
	}
	
	//계좌 목록 메서드
	private static void accountList() {
		System.out.println("┌──────────┐");
		System.out.println("│ 계좌 목록│");
		System.out.println("└──────────┘");
		try {
			if(accountArray.get(0) != null) {
				while(true) {
					for(int i=0;i<accountArray.size();i++) {
						Account account = accountArray.get(i);
//						System.out.println(("ID : "+account.getCustomerNum())+"번 고객, 계좌번호 : "+account.getAccountNum().replaceFirst("(//d{3})(//d{3})", "$2-$2")+", 고객명 : "+account.getOwner()+", 잔액 : "+formater.format(account.getBalance())+"원, 등급 : "+account.getRank()+", 거래횟수 : "+account.getTransactionNum());
						System.out.println("ID : "+account.getCustomerNum()+"번 고객, 계좌번호 : "+dash(account.getAccountNum())+", 고객명 : "+account.getOwner()+", 잔액 : "+formater.format(account.getBalance())+"원, 등급 : "+account.getRank()+", 거래횟수 : "+account.getTransactionNum());
//						고객 ID - static 구현 , Rank 구현
					}
					break;
				}
			} else {
				System.out.println("계좌가 없습니다. \n계좌생성을 원하시면 c를 눌러주세요 : \n나가기를 원하시면 아무키나 눌러주세요 : ");
				String key = sc.next();
				if(key.equals("c")||key.equals("C")||key.equals("ㅊ")) {
					createAccount();
					return;				
				} else {
					System.out.println("종료되었습니다.");
					return;
				}
				
			}
		}catch(Exception e) {
			System.out.println("계좌가 없습니다. \n계좌생성을 원하시면 c를 눌러주세요 : \n나가기를 원하시면 아무키나 눌러주세요 : ");
			String key = sc.next();
			if(key.equals("c")||key.equals("C")||key.equals("ㅊ")) {
				createAccount();
				return;				
			} else {
				System.out.println("종료되었습니다.");
				return;
			} 
		}
	}
		
	

	//계좌 검색 메서드
	private static void searchList() {
		System.out.println("┌──────────┐");
		System.out.println("│ 계좌 목록│");
		System.out.println("└──────────┘");
		System.out.println("계좌 번호 : ");
		String s = sc.next();
		String accountNum = addZero(s, 6);
		while(true) {
			if(accountNum.matches("^[0-9]*$")) {
				while(true) {
					if(comAccount(accountNum)) {
						Account account = findAccount(accountNum);
						System.out.println("고객님의 성함을 입력해주세요 : ");
						String owner = sc.next();
						while(true) {
							if(account.getOwner().equals(owner)) {
								System.out.println("ID : "+account.getCustomerNum()+"번 고객, 계좌번호 : "+dash(account.getAccountNum())+", 고객명 : "+account.getOwner()+", 잔액 : "+formater.format(account.getBalance())+"원, 등급 : "+account.getRank()+", 거래횟수 : "+account.getTransactionNum());
								return;
							} else {
								System.out.println("잘못 입력하셨습니다.\n다시 입력을 원하시면 r을 눌러주세요 : \n나가기를 원하시면 아무키나 눌러주세요 : ");
								String key = sc.next();
								if(key.equals("r")||key.equals("R")||key.equals("ㄱ")) {
									System.out.println("고객님의 성함을 입력해주세요 : ");
									owner = sc.next();
									continue;													
								} else {
									System.out.println("종료되었습니다.");
									return;
								}
							}
						}
					} else {
						System.out.println("계좌가 없습니다. \n계좌생성을 원하시면 c를 눌러주세요 : \n다시 입력을 원하시면 r을 눌러주세요 : \n나가기를 원하시면 아무키나 눌러주세요 : ");
						String key = sc.next();
						if(key.equals("c")||key.equals("C")||key.equals("ㅊ")) {
							createAccount();
							return;				
						} else if(key.equals("r")||key.equals("R")||key.equals("ㄱ")) {
							System.out.println("계좌 번호 : ");
							s = sc.next();
							accountNum = addZero(s, 6);
							continue;
						} else {
							System.out.println("종료되었습니다.");
							return;
						}
					}
				}
			} else {
				System.out.println("숫자를 입력해주세요");
				s = sc.next();
				accountNum = addZero(s, 6);
				continue;
			}
		}
	}

	//계좌 생성 메서드
	private static void createAccount() {
		System.out.println("┌──────────┐");
		System.out.println("│ 계좌 생성│");
		System.out.println("└──────────┘");
		System.out.println("계좌번호(6자리 이하 숫자만) : ");
		final int accountNumLength = 6; //계좌번호 길이 제한
		String accountNum = sc.next();
		while(true) {
			if(accountNum.matches("^[0-9]*$")&&accountNum.length()<=accountNumLength) { //(//d)이고, 6자리 이하일때
				String s = addZero(accountNum, 6);
				while(true) {
					if(accountNum.length()<7) {
						if(accountArray.size()==0) {
							generateAccount(s);
							System.out.println("처리 결과 : 계좌가 생성되었습니다.");
							return;
						} else {
							while(true) {
								if(findAccount(accountNum)!=null) {
									System.out.println("오류 : 중복된 계좌입니다, 다시 입력해주세요 : ");
									accountNum = sc.next();
									continue;
								} else {
									generateAccount(s);
									System.out.println("처리 결과 : 계좌가 생성되었습니다.");
									return;
								}
							}
						}
					} else if(accountNum.matches("^[0-9]*$")) {
						System.out.println("숫자를 입력해주세요 : ");
						accountNum = sc.next();
						s = addZero(accountNum, 6);
						continue;
					} else {
						System.out.println("6자리 이하로 입력해주세요 : ");
						accountNum = sc.next();
						s = addZero(accountNum, 6);
						continue;
					}
				}
			} else {
				System.out.println("숫자를 입력해주세요 : ");
				accountNum = sc.next();
				continue;
			}
		}
		
	}
	
	//계좌 중복 유무 메서드
	private static boolean comAccount(String accountNum) {
		for(int i=0; i<accountArray.size(); i++) {
			String dbAccNum = accountArray.get(i).getAccountNum(); // 배열에 저장된 계좌번호를 대입
			if(dbAccNum.equals(accountNum)) { //외부 입력계좌와 일치하면
				return true;
			}
		}
		return false;
	}
	
	//고객 번호 유무 메서드
	private static boolean comCustomNum(String customerNum) {
		for(int i=0; i<accountArray.size(); i++) {
			long dbAccNum = accountArray.get(i).getCustomerNum(); // 배열에 저장된 고객번호를 대입
			long num = Long.parseLong(customerNum);
			if(dbAccNum==num) { //외부 고객번호와 일치하면
				return true;
			}
		}
		return false;
	}
	
	//계좌 생성 부속 메서드
	private static void generateAccount(String accountNum) {
		System.out.println("계좌주(한글, 영문만) : ");
		String owner = sc.next();
		while(true) {
			if(owner.matches("^[ㄱ-ㅎㅏ-ㅣ가-힣]*$")||owner.matches("^[a-zA-Z]*$")) { //한글 또는 영어
				System.out.println("초기 입금액(양수) : ");
				String temp = sc.next();
				while(true){
					try {
						long balance = Long.parseLong(temp);
						if(balance>0&&temp.matches("^[0-9]*$")) {
							Account newAccount = new Account(accountNum, owner, balance);
							accountArray.add(newAccount);
							newAccount.getAccountNum();
//							String c = String.valueOf(Long.parseLong(newAccount.getAccountNum())).replaceFirst("(\\d{3})(^\\d{3})", "$2-$2");
							System.out.println("계좌번호 : "+dash(newAccount.getAccountNum())+", 고객명 : "+newAccount.getOwner()+", 잔액 : "+formater.format(newAccount.getBalance())+", 등급 : "+newAccount.getRank());
							return;
						} else {
							System.out.println("양수만 입력해주세요 : ");
							temp = sc.next();
							continue;
						}
					}catch(Exception e) {
//						System.out.println("("+e+")\n숫자만 입력하세요 : "); //오류값 출력
						System.out.println("숫자만 입력하세요 : ");
						temp = sc.next();
						continue;
					}
				}
			} else {
				System.out.println("[한글] 또는 [영문]을 입력해주세요 : ");
				owner = sc.next();
				continue;
			}
		}
	}
	
	//고객 데이터 제거 메서드
	private static void deleteData() {
		System.out.println("지우고자하는 고객의 번호를 입력하세요 : ");
		String customerNum = sc.next();
		while(true) {
			if(comCustomNum(customerNum)) {
				int index = (Integer.parseInt(customerNum)-1);
				while(true) {
					if(index<=accountArray.size()) {
						System.out.println((index+1)+"번 고객님의 데이터를 지웁니까?, Y/N");
						String key=sc.next();
						if(key.equals("y")||key.equals("Y")||key.equals("ㅛ")) {
							accountArray.remove(index); //제거할 인덱스
							for(int i=index;i<accountArray.size();i++) {
								accountArray.get(i).setCustomerNum(i+1); //static으로 설정된 고객 num 공란 메꾸기
							}
							Account.setSerialNum((accountArray.size())); //고객 데이터 삭제에 따른 static 고객 num을 신규 생성 고객 num에 올바르게 증가하게 만들기
							System.out.println((index+1)+"번 고객님의 데이터를 지웠습니다.");
							return;
						} else if(key.equals("n")||key.equals("N")||key.equals("ㅜ")) {
							System.out.println("취소되었습니다.");
							return;
						} else {
							System.out.println("잘못 입력하셨습니다.");
						}
					} else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요 : (나가기는 E를 눌러주세요.)");
						String key=sc.next();
						if(key.equals("e")||key.equals("E")||key.equals("ㄷ")) {
							return;
						} else {
							index = (int) sc.nextLong();
							continue;
						}
					}
				}
			} else {
				System.out.println("계좌가 없습니다. \n계좌생성을 원하시면 C를 눌러주세요 : \n다시 입력을 원하시면 R을 눌러주세요 : \n나가기를 원하시면 아무키나 눌러주세요 : ");
				String key = sc.next();
				if(key.equals("c")||key.equals("C")||key.equals("ㅊ")) {
					createAccount();
					return;				
				} else if(key.equals("r")||key.equals("R")||key.equals("ㄱ")) {
					System.out.println("계좌 번호 : ");
					customerNum = sc.next();
					continue;
				} else {
					System.out.println("종료되었습니다.");
					return;
				}
			} 
		}	
	}
	
	//금액별 고객 정렬 (오름차순, 내림차순)
	private static void listSort() {
		//기존의 ArrayList에 영향을 안줄려고 새로 만듬
		ArrayList<Account> accountArrTemp = new ArrayList<Account>(); 
		ArrayList<Account> accountArrTemp2 = new ArrayList<Account>();
		for(int k=0;k<accountArray.size();k++) {
			accountArrTemp.add(k,accountArray.get(k));
		}
		System.out.println("A. 오름차순\nD. 내림차순\n나가기를 원하시면 아무키나 눌러주세요.");
		String key = sc.next();
		while(true) {
			if(key.equals("d")||key.equals("D")||key.equals("ㅇ")) {
				for(int i=0;i<accountArray.size();i++) {
					for(int j=0;j<(accountArray.size()-1);j++) {
						if(accountArrTemp.get(j).getBalance()<accountArrTemp.get(j+1).getBalance()) {
							accountArrTemp2.add(j,accountArrTemp.get(j));
							accountArrTemp.set(j,accountArrTemp.get(j+1));
							accountArrTemp.set(j+1,accountArrTemp2.get(j));
						} else {
							accountArrTemp2.add(j,accountArrTemp.get(j)); //만약 첫번째 인덱스인 j가 j+1보다 클때 temp2공간 주기위해서
						}
					}
				}
			} else if(key.equals("a")||key.equals("A")||key.equals("ㅁ")) {
				for(int i=0;i<accountArray.size();i++) {
					for(int j=0;j<(accountArray.size()-1);j++) {
						if(accountArrTemp.get(j).getBalance()>accountArrTemp.get(j+1).getBalance()) {
							accountArrTemp2.add(j,accountArrTemp.get(j));
							accountArrTemp.set(j,accountArrTemp.get(j+1));
							accountArrTemp.set(j+1,accountArrTemp2.get(j));
						} else {
							accountArrTemp2.add(j,accountArrTemp.get(j)); //만약 첫번째 인덱스인 j가 j+1보다 작을때 temp2공간 주기위해서
						}
					}
				}
			} else {
				System.out.println("종료됩니다.");
				return;
			}
			for(int i=0;i<accountArray.size();i++) {
				Account account = accountArrTemp.get(i);
				System.out.println(("ID : "+account.getCustomerNum())+"번 고객, 계좌번호 : "+account.getAccountNum().replaceFirst("(\\d{3})(\\d+)", "$2-$2")+", 고객명 : "+account.getOwner()+", 잔액 : "+formater.format(account.getBalance())+"원, 등급 : "+account.getRank()+", 거래횟수 : "+account.getTransactionNum());
			}
			break;
		}
	}

	//0붙여주기
	public static String addZero(String accountNum, int accountNumLength) {
		String result = "";
		if (accountNumLength < accountNum.length())
			return accountNum;
		for (int i = 0; i < accountNumLength - accountNum.length(); i++)
			result = result + "0";
		return result + accountNum;
	}
	
	//println)계좌번호에 "'000'-000"붙여주기 - 앞
	private static StringBuffer dash(String accountNum) {
		StringBuffer acccountNumShow = new StringBuffer();
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
	//계좌번호에 "000-'000'"붙여주기 - 뒤
	private static StringBuffer dashInner(long Num) {
		StringBuffer acccountNumShow = new StringBuffer();
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
	
	//엑셀파일로 출력
//	private static void createBook() {
//		HSSFWorkbook workbook = new HSSFWorkbook(); // 새 엑셀 생성
//        HSSFSheet sheet = workbook.createSheet("시트명"); // 새 시트(Sheet) 생성
//        HSSFRow row = sheet.createRow(0); // 엑셀의 행은 0번부터 시작
//        HSSFCell cell = row.createCell(0); // 행의 셀은 0번부터 시작
//        cell.setCellValue("테스트 데이터"); //생성한 셀에 데이터 삽입
//        try {
//            FileOutputStream fileoutputstream = new FileOutputStream("저장할 경로/이름.xlsx");
//            workbook.write(fileoutputstream);
//            fileoutputstream.close();
//            System.out.println("엑셀파일생성성공");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("엑셀파일생성실패");
//        }
//	}

