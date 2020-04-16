package BankingDemo;

import java.util.Scanner;

public class MainBanking {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = 5;
		String Name = null;
		int AccNumber=0;
		double Amount = 0;
		double Balance = 0;
				System.out.println("Welcome to Bilan mobile app!");										
				
				
					Accounts cust = new Accounts(Name, AccNumber, Balance);
					System.out.println("Please enter either of the options below:");
					System.out.println("1.New Account");
					System.out.println("2.Deposit");
					System.out.println("3.Withdraw");
					System.out.println("4.Check Balance");
					System.out.println("5.Exit");
					
					Scanner input = new Scanner( System.in);
					option= input.nextInt();

				switch (option) {

				case 1:	
					System.out.println("Please enter your First Name:");
					input.next();
					
					System.out.println("Please enter your Middle Name:");
					input.next();
					
					System.out.println("Please enter your Last Name:");
					input.next();					
					
					System.out.println("Please enter your Account Name:");
					Name = input.next();
															
					System.out.println("Account Number:");
					AccNumber= input.nextInt();
					
					System.out.println("Please enter your initial deposit( should be 1000 or more):");
					Amount=input.nextDouble();
					
					if(Amount > 1000) {
						System.out.println(Name+ ",you have successfully created a new account with the Account Number:" + AccNumber+ " and an initial deposit of:" + Amount);
					}
					else {
						System.out.println("Please enter a valid initial deposit.");
					}
					
				break;
				
				case 2:
					
					System.out.print("Name:");
					Name= input.next();
					System.out.print("AccNumber:");
					AccNumber= input.nextInt();
					System.out.print("Deposit amount:") ;
					Amount = input.nextDouble();
					cust.deposits(Amount);
					System.out.println("Your new Account Balance is:" + cust.getBalance());
					break;					
					
				case 3:
					System.out.print("Name:");
					Name= input.next();
					System.out.print("AccNumber:");
					AccNumber= input.nextInt();
					System.out.print("Withdrawal amount:" );	
					Amount = input.nextDouble();
					cust.Withdrawals(Amount);
					if(Balance >= Amount) {
						System.out.println("Your new Account Balance is:"+ cust.getBalance());
					}
				
					else {
						System.err.println("Transaction Failed!!");
						}
					
					
					break;
					
				case 4:
					System.out.print("Name:");
					Name= input.next();
					System.out.print("AccNumber:");
					AccNumber= input.nextInt();
					System.out.print(Name + ",your account balance is:" +cust.getBalance());
					break;					
		}	
				
				if(option ==5) {
					System.out.println("Thank you and welcome again!");
				}

            }
}
	
