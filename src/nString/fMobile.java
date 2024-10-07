package nString;

public class fMobile {
String brand;
double price;
public fMobile(String brand,double price)
{
	this.brand=brand;
	this.price=price;
}
public void details()
{
	System.out.println("Brand "+brand);
	System.out.println("Price "+price);
}
public static void main(String[] args) {
	fMobile a=new fMobile("Oppo",123456);
	fMobile b=new fMobile("asdfgh",12345);
	fMobile E[]= {a,b};
	for(int i=0;i<E.length;i++)
	{
     if(E[i].brand=="Oppo")
     {
    	 E[i].details();
     }
	}
}	
}
