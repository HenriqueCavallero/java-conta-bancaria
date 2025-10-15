package entities;

public class Account {
	private String holder;
	private int number;
	private double balance;
	
	public Account(String holder, int number, double InitialDeposit) {
		this.holder = holder;
		this.number = number;
		deposit(InitialDeposit);	
	}
	
	public Account(String holder, int number) {
		this.holder = holder;
		this.number = number;
	}
	
	public String getName() {
		return holder;
	}
	
	public void setName(String name) {
		this.holder = name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account data:\n" + "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	}
	
}
