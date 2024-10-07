package aConstructorMethod;

public class cPen {
String brand;
double price;
public cPen(String brand,double price)
{
this.brand=brand;
this.price=price;
}
public void details()
{
	System.out.println("PEN DETAILS");
	System.out.println(brand);
	System.out.println(price);
}
//public static void main(String[] args) {
//	Pen p1= new Pen("ABC",123);
//	Pen p2= new Pen("ZXC",1234);
//	p1.details();
//	p2.details();
//}
}
