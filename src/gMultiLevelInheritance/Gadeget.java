package gMultiLevelInheritance;

public class Gadeget {
String brand;
int price;
public Gadeget(String brand,int price)
{
	this.brand=brand;
	this.price=price;
}
public void detailsG()
{
	System.out.println("Brand ="+brand);
	System.out.println("Price ="+price);
}
}
