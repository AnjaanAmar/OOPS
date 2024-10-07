package pExceptionHandling;

import java.util.Scanner;

public class iUser {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a Age");
	try
	{
	int age=s.nextInt();
	if(age<21)
	{
		throw new hIvalidAgeException("Invalid Age");
	}
	else
	{
		System.out.println("You can register");
	}
	}
	finally
	{
	System.out.println("Thank You");	
	}
	System.out.println("Hello Customer");
}
}
