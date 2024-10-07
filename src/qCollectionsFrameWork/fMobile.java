package qCollectionsFrameWork;

import java.util.ArrayList;

public class fMobile {
String brand;
int price;
String color;
public fMobile(String brand,int price,String color)
{
//	super();
	this.brand=brand;
	this.price=price;
	this.color=color;
}
public String toString()
{
	return brand+" "+price+" "+color;
}
public static void main(String[] args) {
	ArrayList<fMobile>x=new ArrayList();
	fMobile a=new fMobile("ASDF", 10, "Blue");
	x.add(a);
	x.add(new fMobile("FGH", 100000,"Blue"));
	for(fMobile i:x)
	{
		if(i.price>40000 && i.color.equalsIgnoreCase("Blue"))
		{
			System.out.println(i);
		}
	}
}
}
