package aConstructorMethod;

public class Ex {
static
{
	Ex a= new Ex();
	Ex b= new Ex();
	System.out.println(a);
	System.out.println(b);
}
public static void main(String[] args) 
{
	System.out.println("main");
}
{
	System.out.println("loading");
}
public Ex()
{
	System.out.println("wait");
}
}
