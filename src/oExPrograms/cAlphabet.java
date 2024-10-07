package oExPrograms;

public class cAlphabet {
public static void main(String[] args) {
	String a="Amar";
	String b="Vino";
	int c=a.compareTo(b);
//	System.out.println(c);
	if(c<0)
	{
		System.out.println("Low");
	}
	else if(c>0)
	{
		System.out.println("High");
	}
	else
	{
		System.out.println("Zero");
	}
}
}
