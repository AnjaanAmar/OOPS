package pExceptionHandling;

import java.util.Scanner;

public class gAccount {
	int pin;
	double balance;
	public gAccount(int pin,double balance)
	{
		this.pin=pin;
		this.balance=balance;
	}
	public void WithdrawMoney()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Amout");
		double amount=s.nextDouble();
		if(balance>=amount)
		{
			System.out.println("Enter the Pin");
			int p=s.nextInt();
			if(p==pin)
			{
				System.out.println("Collect Your Cash");
				balance=balance-amount;
				System.out.println("Available Balance is "+balance);
			}
			else
			{
				throw new fInvalidPinException("Invalid Pin");
		    }
		}
		else
		{
			throw new eInsufficientBalanceException("Insufficient Balance");
		}
	}
	public static void main(String[] args) {
		gAccount a=new gAccount(111, 10000);
		try 
		{
			a.WithdrawMoney();
		}
		finally
		{
			System.out.println("Thank You");
		}
	}
}
