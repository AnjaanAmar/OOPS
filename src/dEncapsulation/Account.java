package dEncapsulation;

import java.util.Scanner;

public class Account {
private int pin;
private long contact;
private double balance;
Scanner s=new Scanner(System.in);
public Account(int pin,long contact,double balance)
{
	this.pin=pin;
	this.contact=contact;
	this.balance=balance;
}
public void setpin()
{
	System.out.println("Enter your existing pin");
	int p=s.nextInt();
	if(p==pin) {
		System.out.println("Enter your new pin");
		pin=s.nextInt();
		System.out.println("Your pin is succesfuly updated");
	}
	else
		System.out.println("your entered the pin is wrong");
}
public void getbalance()
{
	System.out.println("Enter your pin");
	int p=s.nextInt();
	if(p==pin)
	{
		System.out.println("Your balance is "+balance);
	}
	else
		System.out.println("You are entered the wrong pin");
}
public void setcontact()
{
	System.out.println("Enter your Existing contact");
	long c=s.nextLong();
	if(c==contact)
	{
		System.out.println("Enter your new contact number");
		contact=s.nextLong();
		System.out.println("your contact is updated succesfully");
	}
	else
		System.out.println("yout entered the contact number is wrong");
}
public void getcontact()
{
	System.out.println("Enter your pin");
	int p=s.nextInt();
	if(p==pin)
	{
		System.out.println("your contact number is "+contact);
	}
	else
		System.out.println("you are enter the pin is wrong");
}
public static void main(String[] args) {
	Account ob=new Account(111,8124112731l,100000d);
	ob.setpin();
	ob.getbalance();
	ob.setcontact();
	ob.getcontact();
}
}
