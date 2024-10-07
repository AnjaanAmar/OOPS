package cConstructorChaining;

public class bCitizen {
String name;
long contact;
String state;
long A_Number;
public bCitizen(String name,long contact,String state,long A_Number)
{
	this(name,contact,A_Number);
	this.state=state;
}
public bCitizen(String name,long contact,long A_Number)
{
	this(name,contact);
	this.A_Number=A_Number;
}
public bCitizen(String name,long contact)
{
	this.name=name;
	this.contact=contact;
}
public void details()
{
	System.out.println("Name ="+name);
	System.out.println("Contact ="+contact);
	System.out.println("State ="+state);
	System.out.println("A.Number ="+A_Number);
}
}
