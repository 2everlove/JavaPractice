package bank;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class AppMainArrayList {
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
	10. 고객 데이터 제거 시 공란이 된 고객 아이디 기존 고객으로 대체
	11.고객별 등급에 따라 출금 시 수수료 감면
 */

	private static ArrayList<Account> accountArray = new ArrayList<Account>();
	private static Scanner sc = new Scanner(System.in); 
	private static DecimalFormat formater = new DecimalFormat("###,###");
	

	public static void main(String[] args) {
		
		boolean run = true;
		
		System.out.println("                은행 프로그램 by Ahn            ");
		while(run) {
			System.out.println("┌───────────────────────────────────────────────────────────┐");
			System.out.println("│ 1. 계좌 생성 │ 2. 계좌 목록 │ 3. 입급 │ 4. 출금 │ 5. 종료 │");
			System.out.println("└───────────────────────────────────────────────────────────┘");
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
				run = false;
			} else {
				System.out.println("지원하지 않는 기능입니다. 다시 입력해주세요.");
				continue;
			}
		}
		System.out.println("프로그램 종료");		
		sc.close();
	}

	//메인 메서드 시작
	
	//출금
	private static void withdraw() {
		System.out.println("┌─────┐");
		System.out.println("│ 출금│");
		System.out.println("└─────┘");
		final int fees = 1500;
		System.out.println("계좌 번호 : ");
		String accountNum = sc.next();
		while(true) {		
			Account account = findAccount(accountNum); //호출
			try {
				if(account==null) {
					System.out.println("계좌가 없습니다. \n계좌생성을 원하시면 c를 눌러주세요 : \n다시 입력을 원하시면 r을 눌러주세요 : \n나가기를 원하시면 아무키나 눌러주세요 : ");
					String key = sc.next();
					if(key.equals("c")||key.equals("C")) {
						createAccount();
						return;				
					} else if(key.equals("r")||key.equals("R")) {
						System.out.println("계좌 번호 : ");
						accountNum = sc.next();
						continue;
							
					} else {
						System.out.println("종료되었습니다.");
						break;
					}
				} else {
					System.out.println("출금액 : ");
					long money = sc.nextLong();
					while(true) {
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
									System.out.println("잔액이 부족합니다.\n출금액을 다시 입력하려면 r을 눌러주세요 : \n종료를 원하시면 e을 입력해주세요 : ");
									String key = sc.next();
									while(true) {
										if(key.equals("e")||key.equals("E")) {
											return;
										} else if(key.equals("r")||key.equals("R")) {
											System.out.println("출금액 : ");
											money = sc.nextLong();
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
		String accountNum = sc.next();
		while(true) {	
			Account account;
			try {
				account = findAccount(accountNum); //호출
				if(account==null) {
					System.out.println("계좌가 없습니다. \n계좌생성을 원하시면 c를 눌러주세요 : \n다시 입력을 원하시면 r을 눌러주세요 : \n나가기를 원하시면 아무키나 눌러주세요 : ");
					String key = sc.next();
					if(key.equals("c")||key.equals("C")) {
						createAccount();
						return;				
					} else if(key.equals("r")||key.equals("R")) {
						System.out.println("계좌 번호 : ");
						accountNum = sc.next();
						continue;
							
					} else {
						System.out.println("종료되었습니다.");
						break;
					}
				} else {
					System.out.println("입금액 : ");
					long money = sc.nextLong();
					while(true) {
						if(money>=0) {
							account.setBalace(account.getBalance() + money);
							System.out.println("처리 결과 : "+(formater.format(money))+"원 입금을 성공하였습니다.");
							System.out.println("잔액 : "+formater.format(account.getBalance())+"원");
							return;
						} else {
							System.out.println("양수만 출금가능합니다. 다시 입력해주세요 :");
							money = sc.nextInt();
							continue;
						}
					}
				}			
			} catch (Exception e) {
				System.out.println("계좌가 없습니다. 다시 입력해주세요 : ");
				accountNum = sc.next();
				continue;
			}
		}
	}

	//계좌 비교 메서드
	private static Account findAccount(String accountNum) {
		Account account = null; //초기값 지정
		for(int i=0; i<accountArray.size(); i++) {
			String dbAccNum = accountArray.get(i).getAccountNum(); // 배열에 저장된 계좌번호를 대입
			if(dbAccNum.equals(accountNum)) { //외부 입력계좌와 일치하면
				account = accountArray.get(i);
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
		System.out.println("계좌 번호 : ");
		String accountNum = sc.next();
		final String administration = "admin";  //관리자 코드
		
		while(true) {
			if(accountNum.equals(administration)) {
				for(int i=0;i<accountArray.size();i++) {
					Account account = accountArray.get(i);
					System.out.println(("ID : "+account.getCustomerNum())+"번 고객, 계좌번호 : "+account.getAccountNum()+", 고객명 : "+account.getOwner()+", 잔액 : "+formater.format(account.getBalance())+", 등급 : "+account.getRank()+", 거래횟수 : "+account.getTransactionNum());
//					고객 ID - static 구현 , Rank 구현
				}
				System.out.println("d. 고객데이터 소거\n나가기를 원하시면 아무키나 눌러주세요.");
				String key=sc.next();
				if(key.equals("d")||key.equals("D")) {
					System.out.println("지우고자하는 고객의 번호를 입력하세요 : ");
					String customerNum = sc.next();
					while(true) {
						if(comCustomNum(customerNum)) {
							deleteData(customerNum);
							return;
						} else {
							System.out.println("계좌가 없습니다. \n계좌생성을 원하시면 c를 눌러주세요 : \n다시 입력을 원하시면 r을 눌러주세요 : \n나가기를 원하시면 아무키나 눌러주세요 : ");
							String key1 = sc.next();
							if(key1.equals("c")||key1.equals("C")) {
								createAccount();
								return;				
							} else if(key1.equals("r")||key1.equals("R")) {
								System.out.println("계좌 번호 : ");
								customerNum = sc.next();
								continue;
							} else {
								System.out.println("종료되었습니다.");
								break;
							}
						} 
					}
				} else {
					System.out.println("종료되었습니다.");
					return;
				}
			} else if(comAccount(accountNum)) {
				Account account = findAccount(accountNum);
				System.out.println(account.getAccountNum()+"   "+account.getOwner()+"   "+formater.format(account.getBalance())+"   "+account.getRank());
				break;
			} else {
				System.out.println("계좌가 없습니다. \n계좌생성을 원하시면 c를 눌러주세요 : \n다시 입력을 원하시면 r을 눌러주세요 : \n나가기를 원하시면 아무키나 눌러주세요 : ");
				String key = sc.next();
				if(key.equals("c")||key.equals("C")) {
					createAccount();
					return;				
				} else if(key.equals("r")||key.equals("R")) {
					System.out.println("계좌 번호 : ");
					accountNum = sc.next();
					continue;
				} else {
					System.out.println("종료되었습니다.");
					break;
				}
			}
		}
	}

	//계좌 생성 메서드
	private static void createAccount() {
		System.out.println("┌──────────┐");
		System.out.println("│ 계좌 생성│");
		System.out.println("└──────────┘");
		System.out.println("계좌번호 : ");
		String accountNum = sc.next();
		while(true) {
			if(accountNum.matches("^[0-9]*$")) {
				if(accountArray.size()==0) {
					generateAccount(accountNum);
					System.out.println("처리 결과 : 계좌가 생성되었습니다.");
					break;
				} else {
					while(true) {
						if(comAccount(accountNum)) {
							System.out.println("오류 : 중복된 계좌입니다, 다시 입력해주세요 : ");
							accountNum = sc.next();
							continue;
						} else {
							generateAccount(accountNum);
							System.out.println("처리 결과 : 계좌가 생성되었습니다.");
							return;
						}
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
			long dbAccNum = accountArray.get(i).getCustomerNum(); // 배열에 저장된 계좌번호를 대입
			long num = Long.parseLong(customerNum);
			if(dbAccNum==num) { //외부 입력계좌와 일치하면
				return true;
			}
		}
		return false;
	}
	
	//계좌 생성 부속 메서드
	private static void generateAccount(String accountNum) {
		System.out.println("계좌주 : ");
		String owner = sc.next();
		while(true) {
			if(owner.matches("^[ㄱ-ㅎㅏ-ㅣ가-힣]*$")||owner.matches("^[a-zA-Z]*$")) { //한글 또는 영어
				while(true){
					System.out.println("초기 입금액 : ");
					long balance = sc.nextLong();
					if(balance>0) {
						Account newAccount = new Account(accountNum, owner, balance);
						accountArray.add(newAccount);
						System.out.println(newAccount.getAccountNum()+"   "+newAccount.getOwner()+"   "+formater.format(newAccount.getBalance())+"   "+newAccount.getRank());
						return;
					} else {
						System.out.println("양수만 입력해주세요 : ");	
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
	private static void deleteData(String customerNum) {
		int index = (Integer.parseInt(customerNum)-1);
		while(true) {
			if(index<=accountArray.size()) {
				System.out.println((index+1)+"번 고객님의 데이터를 지웁니까?, y/n");
				String key=sc.next();
				if(key.equals("y")||key.equals("Y")) {
					accountArray.remove(index); //제거할 인덱스
					for(int i=index;i<accountArray.size();i++) {
						accountArray.get(i).setCustomerNum(i+1); //고객 num 공란 메꾸기
					}
					Account.setSerialNum((accountArray.size())); //신규 생성 고객 num 맞추기
					System.out.println((index+1)+"번 고객님의 데이터를 지웠습니다.");
					return;
				} else if(key.equals("n")||key.equals("N")) {
					System.out.println("취소되었습니다.");
					return;
				} else {
					System.out.println("잘못 입력하셨습니다.");
				}
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요 : (나가기는 e를 눌러주세요.)");
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
