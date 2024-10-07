package bConstructorOverLoading;

public class aProduct {
String ProductID;
String brand;
int qty;
int price;
public aProduct(String ProductID,String brand,int qty,int price)
{
	this.ProductID=ProductID;
	this.brand=brand;
	this.qty=qty;
	this.price=price;
}
public aProduct(String ProductID,String brand,int price)
{
	this.ProductID=ProductID;
	this.brand=brand;
	this.price=price;
}
public aProduct(String ProductID,String brand)
{
	this.ProductID=ProductID;
	this.brand=brand;	
}
public void profile()
{
	System.out.println("Product Details");
	System.out.println("ProductId "+ ProductID);
	System.out.println("Brand "+ brand);
	System.out.println("Qty "+qty);
	System.out.println("Price "+price);
}
public static void main(String[] args) {
	aProduct a=new aProduct("P123","ABC");
	aProduct b=new aProduct("P176","XYZ",55);
	aProduct c=new aProduct("P098","qwe",22,500);
	b.profile();
	a.profile();
	c.profile();
	a.profile();
}
}
