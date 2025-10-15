package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.println("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double InitialDeposit = sc.nextDouble();
			account = new Account(holder, number, InitialDeposit);
		}
		else {
			account = new Account(holder, number);
		}
		System.out.println();
		
		System.out.println(account);
		System.out.println();
		
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated " + account);
		System.out.println();
		
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated " +  account);
		
		sc.close();
	}

}
