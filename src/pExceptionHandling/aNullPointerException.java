package pExceptionHandling;

public class aNullPointerException {
public static void main(String[] args) {
	String s=null;
	try
	{
		System.out.println(s.length());
	}
	catch (aNullPointerException ob)
	{
	
	}
	System.out.println(s);
}
}
