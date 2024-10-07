package cConstructorChaining;

public class Bike extends Vehical {
String model;
int cc;
public Bike(String brand,String color,double price,String model,int cc)
{
	super(brand,color,price);
	this.model=model;
	this.cc=cc;
}
public Bike(String brand,String color,int cc)
{
	this(brand,color,0,null,cc);
}
public void detaisB()
{
	System.out.println("Model= "+model);
	System.out.println("CC= "+cc);
}
}
