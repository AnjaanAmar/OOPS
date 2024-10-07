package eSingle_Inheritance;

public class aPerson {
String name;
long contact;
public aPerson(String name,long contact)
{
	this.name=name;
	this.contact=contact;
}
public void display()
{
	System.out.println("Name ="+ name);
	System.out.println("contact ="+ contact);
}
}
