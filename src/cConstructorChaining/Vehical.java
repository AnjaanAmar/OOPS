package cConstructorChaining;

public class Vehical {
String brand;
String color;
double price;
public Vehical(String brand,String color,double price)
{
	this(brand,price);
	this.color=color;
}
public Vehical(String brand,double price)
{
	this.brand=brand;
	this.price=price;
}
public void detailsV()
{
System.out.println("Brand ="+brand);
System.out.println("Color ="+color);
System.out.println("Price ="+price);
}
}
