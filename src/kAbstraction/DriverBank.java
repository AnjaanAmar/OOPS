package kAbstraction;

import java.util.Scanner;

public class DriverBank {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter 1:Axis 2:Sbi");
	int n=s.nextInt();
	switch (n)
	{
	case 1:
	{
		Axis a=new Axis();
		DriverBank.Select(a);
	}
	break;
	case 2:
	{
		Sbi S=new Sbi();
		DriverBank.Select(S);
	}
	break;
	default:
	{
		System.out.println("Invalid option");
	}
	}
}
public static void Select(Rbi ob)
{
	ob.VehicalLoanIntrest();
	ob.HomeLoanIntrest();
	if(ob instanceof Axis)
	{
		Axis x=(Axis)ob;
		x.display();
	}
	else
	{
		Sbi y=(Sbi)ob;
		y.display();
	}
}
}
