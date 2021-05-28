

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
			System.out.println("┌───────────────────────────────────────────────────────────┐");
			System.out.println("│ 1. 계좌 생성 │ 2. 계좌 목록 │ 3. 입급 │ 4. 출금 │ 5. 종료 │");
			System.out.println("└───────────────────────────────────────────────────────────┘");
			System.out.println("선택> ");
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
				System.out.println("지원하지 않는 기능입니다. 다시 입력해주세요.");
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
		
		while(true) {		
			System.out.println("계좌 번호 : ");
			String accountNum = sc.next();
			try {
				Account account = findAccount(accountNum); //호출
				if(account.equals(null)) {
					System.out.println("계좌가 없습니다.");
					accountNum = sc.next();
					continue;
				} else {
					System.out.println("출금액 : ");
					long money = sc.nextLong();
					while(true) {
						if(account.getBalance()>money) {
							account.setBalace(account.getBalance() - money);
							break;
						} else {
							System.out.println("잔액이 부족합니다.\n출금액을 다시 입력해주세요 :");
							money = sc.nextInt();
						}
					}
					System.out.println("처리 결과 : "+(formater.format(money))+"원 출금을 성공하였습니다.");
					System.out.println("잔액 : "+formater.format(account.getBalance())+"원");
					break;
				}	
			} catch(Exception e) {
				System.out.println("계좌가 없습니다.");
			}
		}
	}

	//입금
	private static void deposit() {
		System.out.println("┌─────┐");
		System.out.println("│ 입금│");
		System.out.println("└─────┘");
		
		while(true) {
			System.out.println("계좌 번호 : ");
			String accountNum = sc.next();
					
			Account account;
			try {
				account = findAccount(accountNum); //호출
				if(account.equals(null)) {
					System.out.println("계좌가 없습니다.");
					accountNum = sc.next();
					continue;
				} else {
					System.out.println("입금액 : ");
					long money = sc.nextLong();
					account.setBalace(account.getBalance() + money);
					System.out.println("처리 결과 : "+formater.format(money)+"원 입금을 성공하였습니다.");
					System.out.println("잔액 : "+formater.format(account.getBalance())+"원");
					break;
				}			
			} catch (Exception e) {
				System.out.println("계좌가 없습니다.");
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
		
		for(int i=0;i<accountArray.size();i++) {
			Account account = accountArray.get(i);
			System.out.println(account.getAccountNum()+"   "+account.getOwner()+"   "+formater.format(account.getBalance()));
			}

	}

	//계좌 생성 메서드
	private static void createAccount() {
		System.out.println("┌──────────┐");
		System.out.println("│ 계좌 생성│");
		System.out.println("└──────────┘");
		
		System.out.println("계좌번호 : ");
		String accountNum = sc.next();
//		boolean run = true;
		if(accountArray.size()==0) {
			generateAccount(accountNum);
			System.out.println("처리 결과 : 계좌가 생성되었습니다.");
		} else {
			while(true) {
//				for(Account a:accountArray) {
					Account account = findAccount(accountNum);
					if(account != null) {
						System.out.println("오류 : 중복된 계좌입니다, 다시 입력해주세요 : ");
						accountNum = sc.next();
						continue;
					} else {
						generateAccount(accountNum);
						System.out.println("처리 결과 : 계좌가 생성되었습니다.");
						break;
					}
//				}
			}
			
		}
	}
	
//	//계좌 중복 유무 메서드
//	private static boolean comAccount(String accountNum) {
//		for(int i=0; i<accountArray.size(); i++) {
//			String dbAccNum = accountArray.get(i).getAccountNum(); // 배열에 저장된 계좌번호를 대입
//			if(dbAccNum.equals(accountNum)) { //외부 입력계좌와 일치하면
//				return true;
//			}
//		}
//		return false;
//	}
	
	//계좌 생성 부속 메서드
	private static void generateAccount(String accountNum) {
		System.out.println("계좌주 : ");
		String owner = sc.next();
		System.out.println("초기 입금액 : ");
		long balance = sc.nextLong();
		Account newAccount = new Account(accountNum, owner, balance);
		accountArray.add(newAccount);
	}
}
