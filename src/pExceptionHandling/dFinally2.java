package pExceptionHandling;

public class dFinally2 {
public static void main(String[] args) {
	String s="Hello";
	try
	{
		
		System.out.println(s.concat("Hii"));
		System.out.println(s.charAt(7));
	}
	finally
	{
		System.out.println(s);
	}
	System.out.println("Okay");
}
}
