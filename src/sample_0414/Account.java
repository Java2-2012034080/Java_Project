package sample_0414;

public class Account {
	private int regName;
	private String name;
	private int balance;
	
	public int getRegName() {
		return regName;
	}
	public void setRegName(int regName) {
		this.regName = regName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if (balance <10000) {
			this.balance=0;
		}
		else
			this.balance = balance;
	}
	
	
	
	
}
