package BankingDemo;

public class Withdrawals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		Accounts cust1 = new Accounts();
		cust1.Withdrawals(100.00);

				
				System.out.println("Balance is:" + cust1.getBalance());
		
		System.out.println("Thank You and Welcome again!");
}
}
