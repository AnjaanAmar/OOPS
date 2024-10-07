package dEncapsulation;

import java.util.Scanner;

public class Student {
private int pin;
private long contact;
Scanner s=new Scanner(System.in);
public Student(int pin,long contact)
{
	this.pin=pin;
	this.contact=contact;
}
public void setpin()
{
	System.out.println("Enter your existing Pin");
	int p=s.nextInt();
	if(p==pin)
	{
		System.out.println("Enter your new pin");
		pin=s.nextInt();
		System.out.println("Your pin is succesfully created");
	}
	else
	{
		System.out.println("You have enterd the pin is wrong ");
	}
}
public void setcontact()
{
	System.out.println("Enter your Contact Number");
	long c=s.nextLong();
	if(c==contact)
	{
		System.out.println("Enter your new Contact number");
		contact=s.nextLong();
		System.out.println("Your Contact is Succesfully created");
	}
	else
	{
		System.out.println("You have enterd the contact is wrong ");
	}
}
public void getcontact()
{
	System.out.println("Enter your pin if want to check the contact number");
	int p=s.nextInt();
	if(p==pin)
	{
	System.out.println("Your registered contact number is "+contact);
	}
	else
	{
		System.out.println("Your pin is wrong so you not able to check the contact number");
	}
}
public static void main(String[] args) {
	Student ob=new Student(1112,8124112731l);
//	ob.setpin();
	ob.setcontact();
	ob.getcontact();
}
}
