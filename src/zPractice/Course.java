package zPractice;

import java.util.Scanner;

public class Course {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("Enter the age");
			int age=s.nextInt();
			if(age<21)
			{
				throw new InvalidAgeException("Ivalid Age");
			}
			else
			{
				System.out.println("You can register");
			}
		} 
		finally {
			System.out.println("TQ");
		}
		System.out.println("Welcome");
	}
}
