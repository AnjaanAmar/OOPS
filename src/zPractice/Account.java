package zPractice;

import java.util.Scanner;

public class Account {
int pin;
double balance;
public Account(int pin,double balance)
{
	this.pin=pin;
	this.balance=balance;
}
public void wothdrawMoney()
{
	Scanner S=new Scanner(System.in);
	System.out.println("Enter the Amount");
	double amount=S.nextDouble();
	if(balance>=amount)
	{
		System.out.println("Enter the Pin");
		int p=S.nextInt();
		if(pin==p)
		{
			System.out.println("Collect your cash");
			balance=balance-amount;
		}
		else
		{
			throw new InvalidPinException("Invalid Pin");
		}
	}
	else
	{
		throw new InsufficientBalanceException("Insufficient Balance");
	}
}
public static void main(String[] args) {
	Account a=new Account(555,20000);
	try {
		a.wothdrawMoney();
	}
	finally {
		System.out.println("Thank You");
	}
}
}
