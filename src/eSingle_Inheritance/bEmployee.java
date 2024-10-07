package eSingle_Inheritance;

public class bEmployee extends aPerson {
int eid;
String designation;
double salary;
public bEmployee(String name,long contact,int eid,String designation,double salary)
{
	super(name,contact);
	this.eid=eid;
	this.designation=designation;
	this.salary=salary;
}
public void profile()
{
	System.out.println("E.Id="+eid);
	System.out.println("Designation="+designation);
	System.out.println("salary="+salary);
}
}
