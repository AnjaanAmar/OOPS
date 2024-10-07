package aConstructorMethod;

public class MethodOverLoading {
public static void change(int a)
{
	float b=a;
	System.out.println(b);
}
public static void change(char a)
{
	int b=a;
	System.out.println(b);
}
public static void change(String a)
{
	System.out.println(a+"bye");
}
public static void main(String[] args) {
	MethodOverLoading.change("Hii");
	MethodOverLoading.change(10);
	MethodOverLoading.change('Y');
}
}
