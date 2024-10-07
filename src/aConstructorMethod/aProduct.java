package aConstructorMethod;

public class aProduct {
static String branch ="Nestlay";
String id;
double price;
String qty;
public aProduct(String i,double p,String q)
{
	id=i;
	price=p;
	qty=q;
}
public static void main(String[] args) {
	aProduct p1=new aProduct("P1234",2222,"10g");
	aProduct p2=new aProduct("P1245",1000.00,"20g");
		System.out.println(p1.price);
		System.out.println(p1.qty);
		System.out.println(p2.price);
}
}
