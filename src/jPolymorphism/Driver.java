package jPolymorphism;

import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter 1:Circle 2:Rectangular");
	int n=s.nextInt();
	switch (n)
	{
	case 1:
	{
		Circle c= new Circle();
		Driver.Select(c);
	}
	break;
	case 2:
	{
		Rectangular r=new Rectangular();
		Driver.Select(r);
	}
	break;
	default:
	{
		System.out.println("Invaild option");
	}
	}
}
public static void Select(Shape ob)
{
	ob.draw();
	if(ob instanceof Circle)
	{
	Circle x=(Circle)ob;
	x.feature();
	}
	else
	{
	Rectangular y=(Rectangular)ob;
	y.feature();
	}
}
}
