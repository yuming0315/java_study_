package prob05;

public class Account {
	private String accountNo;
	private int balance;
	
	public Account(String accountNo) {
		this.accountNo = accountNo;
		System.out.printf("%s 계좌가 개설되었습니다.\n",accountNo);
	}
	
	public void save(int money) {
		if(money>0) {
			setBalance(balance+money);
			System.out.printf("%s 계좌에 %d만원이 입금되었습니다.\n",accountNo,money);
		}
		else {
			System.out.println("잘못된 입력값입니다.");
		}
	}
	
	public void deposit(int money) {
		if(money>0) {
			setBalance(balance-money);
			System.out.printf("%s 계좌에 %d만원이 출금되었습니다.\n",accountNo,money);
		}
		else {
			System.out.println("잘못된 입력값입니다.");
		}
	}
	
//	public void show() {
//		System.out.printf("%s 계좌가", null);
//	}
	
	

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
