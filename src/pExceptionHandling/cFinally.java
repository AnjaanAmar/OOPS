package pExceptionHandling;

public class cFinally {
public static void main(String[] args) {
	try
	{
		System.out.println(10+2);
		System.out.println(10/0);
		System.out.println(100/2);
	}
	catch (NullPointerException ob)
	{
		
	}
	finally
	{
		System.out.println("I will execute always");
	}
	System.out.println("heloo");
}
}
