package iScannerClass;

import java.util.Scanner;

public class A {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter age");
	int age=s.nextInt();
	if(age<=18)
	{
		System.out.println("Minor");
	}
	else
	{
		System.out.println("Major");
	}
}
}
