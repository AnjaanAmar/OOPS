package mObjectClasses_Array;

public class cMobile {
int price;
String model;
public cMobile(int price,String model)
{
	this.price=price;
	this.model=model;
}
public String toString()
{
	return(price+" "+model);
}
public static void main(String[] args) 
{
	cMobile a=new cMobile(10000,"ABC");
	cMobile b=new cMobile(10000,"PQRS");
	System.out.println(a);
	System.out.println(b);
	System.out.println(a.equals(b));
}
public boolean equals(cMobile ob)
{
	if(this.price==ob.price)
		return true;
	else {
		return false;
	}
}
}