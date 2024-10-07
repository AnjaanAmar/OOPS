package eSingle_Inheritance;

public class aStudent extends aPerson
{
int id;
String stream;
public aStudent(String name,long contact,int id,String stream)
{
	super(name,contact);
	this.id=id;
	this.stream=stream;
}
public void details()
{
	System.out.println("Id ="+id);
	System.out.println("Stream ="+stream);
}
}
