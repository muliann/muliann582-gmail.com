package BankingDemo;

import java.util.*;

public class main {

	public static void main (String[] args) {
		
		int option = 5;
		String Name;
		int AccNumber;
		double Amount;
		double Balance;
				System.out.println("Welcome to Bilan mobile app!");
				
				
				
				do {
					
					System.out.println("Please enter either of the options below:");
					System.out.println("1.New Account");
					System.out.println("2.Deposits");
					System.out.println("3.Withdral");
					System.out.println("4.Balance");
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
						System.out.println(Name+ ",you have successfully created a new account with the Account Number:" + AccNumber+ "and an initial deposit of:" + Amount);
					}
					else {
						System.out.println("Please enter a valid initial deposit.");
					}
				
				
				case 2:
					System.out.println("AccNumber:");
					System.out.println("Password");
					System.out.println("Amount to deposit:");
					Scanner deposit = new Scanner(System.in);
					deposit.nextDouble();
					
					System.out.println("Your new balance is:");
					break;
				
				case 3:
					System.out.println("AccNumber:");
					Scanner accNumber = new Scanner(System.in);
					accNumber.nextDouble();
					System.out.println("Pin:");
					Scanner pin1 = new Scanner(System.in);
					pin1.nextDouble();
					System.out.println("Amount to withdraw:");
					Scanner withdraw = new Scanner(System.in);
					withdraw.nextDouble();
					System.out.println("New Account amount is:" );
					break;
					
				case 4:
					System.out.println("Your Account balance is:" );
					break;

				case 5:
					System.out.println("Thank you for choosing our mobile app!");
					System.out.println("Welcome Again");
					break;
					
				default:
					System.out.println("please enter any of the give options.");
					break;
					
			
		}		
				}
				while(option !=6); {
				}
	}
	}
	
	