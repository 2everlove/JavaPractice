package bank;


public class Account {
	private String owner; //°èÁÂ ¹øÈ£
	private String accountNum; //°èÁÂÁÖ
	private long balance; //ÀÜ¾×
	private String rank;
	private static long serialNum=0;
	public static long getSerialNum() {
		return serialNum;
	}
	public static void setSerialNum(long serialNum) {
		Account.serialNum = serialNum;
	}
	private long customerNum;
	private long transactionNum=0;
	
	//constructor
	public Account(String accountNum, String owner, long balance) {
		this.accountNum = accountNum;
		this.owner = owner;
		if(balance>=10000&&balance<1000000) {
			this.balance = balance;
			setRank("Brown");
		} else if(balance>=1000000&&balance<10000000) {
			this.balance = balance;
			setRank("Silver");
		} else if(balance>=10000000&&balance<100000000) {
			this.balance = balance;
			setRank("Gold");
		} else if(balance>=100000000) {
			this.balance = balance;
			setRank("VIP");
		} else {
			this.balance = balance;
			setRank("White");
		}
		serialNum++;
		customerNum=serialNum;
	}
	public Account(String accountNum) {
		this.accountNum = accountNum;
	}
	
	//get,set
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public long getBalance() {
		return balance;
	}
	public String getAccountNum() {
		return accountNum;
	}

	public void setBalace(long balance) {
		if(balance>=10000&&balance<1000000) {
			this.balance = balance;
			transactionNum++;
			setRank("Brown");
		} else if(balance>=1000000&&balance<10000000) {
			this.balance = balance;
			transactionNum++;
			setRank("Silver");
		} else if(balance>=10000000&&balance<100000000) {
			this.balance = balance;
			transactionNum++;
			setRank("Gold");
		} else if(balance>=100000000) {
			this.balance = balance;
			transactionNum++;
			setRank("VIP");
		} else {
			this.balance = balance;
			transactionNum++;
			setRank("White");
		}
		
	}	
	
	public long getTransactionNum() {
		return transactionNum;
	}
	public long getCustomerNum() {
		return customerNum;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public void setTransactionNum(long transactionNum) {
		this.transactionNum = transactionNum;
	}
	public void setCustomerNum(int customerNum) {
		this.customerNum = customerNum;
	}
	
	
}
