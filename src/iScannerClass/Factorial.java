package iScannerClass;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the Integer value");
	int a=s.nextInt();
	int n=1;
	for(int x=1;x<=a;x++)
	{
		n=n*x;
	}
	System.out.println("the factorial of "+a+" is"+n);
}
}
