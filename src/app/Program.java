package app;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder:");
			String holder = sc.next();
			System.out.print("Initial balance:");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit:");
			Double limit = sc.nextDouble();
			Account acc = new Account(number, holder, balance, limit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw:");
			Double withDraw = sc.nextDouble();
			acc.withdraw(withDraw);
			System.out.println("New balance: " + acc.getBalance());
			
			
			sc.close();
			
		}
		catch(DomainException e){
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error!");
		}
		
	}

}
