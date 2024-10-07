package aConstructorMethod;

public class dMobile {
String brand;
String model;
String color;
int price;
public dMobile(String brand,String model,String color,int price)
{
	this.brand=brand;
	this.model=model;
	this.color=color;
	this.price=price;
}
public void display()
{
	System.out.println(brand);
	System.out.println(model);
	System.out.println(color);
	System.out.println(price);
}
}
