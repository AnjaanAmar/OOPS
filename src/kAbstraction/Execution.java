package kAbstraction;

import java.util.Scanner;

public class Execution {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter 1:Bulb,Enter 2:Iron Box");
	int n=s.nextInt();
	switch(n)
	{
	case 1:
	{
		Bulb b=new Bulb();
		Execution.Connect(b);
	}
	break;
	case 2:
	{
		IronBox i=new IronBox();
		Execution.Connect(i);
	}
	break;
	default:
	{
		System.out.println("Invalid option");
	}
	}
}
public static void Connect(Eswitch ob)
{
	ob.SwitchOn();
	ob.SwitchOff();
}
}
