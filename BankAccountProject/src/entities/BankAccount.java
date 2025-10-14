package entities;

public class BankAccount {
	private String name;
	private int holder;
	private double balance;
	
	public BankAccount() {
		
	}
	public BankAccount(String name, int number, double balance) {
		this.name = name;
		this.holder = number;
		this.balance = balance;	
	}
	public BankAccount(String name, int number) {
		this.name = name;
		this.holder = number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return holder;
	}
	public void setNumber(int number) {
		this.holder = number;
	}
	public double getBalance() {
		return balance;
	}
	
	
	public void deposit(double balance) {
		this.balance += balance;
	}
	public void withdraw(double balance) {
		this.balance -= balance + 5.0;
	}
	public String toString() {
		return "Account data:\n" + "Account " + holder + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", balance);
	}
}
