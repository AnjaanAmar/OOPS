package pExceptionHandling;

import java.util.Scanner;

public class bMultipleCatch {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number divisible an array element");
	int a=s.nextInt();
	int b[]= {10,20,30};
	try
	{
	for(int i=0;i<b.length;i++)
	{
		System.out.println(b[i]/a);
	}
	System.out.println("Hai");
}
	catch(ArithmeticException ob)
	{
		ob.printStackTrace();
		System.out.println("First Catch Block");
	}
	System.out.println("Hello .....");
}
}