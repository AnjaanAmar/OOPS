package nString;

public class eQSpider {
public static void main(String[] args) {
	String q="Q Spider";
	for(int i=q.length()-1;i>=0;i--)
	{
		System.out.println(q.charAt(i));
	}
	String j="J Spider";
	System.out.println(q.equalsIgnoreCase(j));
	String S[]=q.split("pi");
	for(String i:S)
	{
		System.out.println(i);
	}
}
}
