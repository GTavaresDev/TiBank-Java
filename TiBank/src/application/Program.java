package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exception.BusinessException;

public class Program {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Enter a account data: ");
		System.out.print("Number: ");
		int number = dados.nextInt();
		dados.nextLine();
		System.out.print("Holder: ");
		String holder = dados.nextLine();
		System.out.print("Inicial balance: ");
		Double deposit = dados.nextDouble();
		System.out.print("Withdraw limit: ");
		Double limit = dados.nextDouble();
		
		System.out.println();
		Account account = new Account(number, holder, deposit, limit);
		
		System.out.print("Enter amount for withdraw: ");
		Double amount = dados.nextDouble();
		
		try {
			account.withdraw(amount);
			System.out.printf("%n New Balance: " + account);
		}
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	
		dados.close();
	}
}
