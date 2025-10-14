package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder: ");
		String name = sc.nextLine();
		System.out.println("Is there na initial deposit (y/n)? ");
		String simOuNao = sc.nextLine();
		double balance = 0;
		if (simOuNao.equalsIgnoreCase("y")) {
			System.out.println("Enter initial deposit value: ");
			balance = sc.nextDouble();
		}
		
		BankAccount bankAccount = new BankAccount(name, number, balance);
		System.out.println("");
		
		System.out.println(bankAccount);
		System.out.println("");
		
		System.out.println("Enter a deposit value: ");
		double value = sc.nextDouble();
		bankAccount.deposit(value);
		System.out.println("Updated " + bankAccount);
		System.out.println("");
		
		System.out.println("Enter a withdraw value: ");
		value = sc.nextDouble();
		bankAccount.withdraw(value);
		System.out.println("Updated " +  bankAccount);
		
		sc.close();
	}

}
