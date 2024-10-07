package mObjectClasses_Array;

public class bStudent_Boolean {
int id;
String name;
public bStudent_Boolean(int id,String name)
{
	this.id=id;
	this.name=name;
}
public String toString()
{
	return (id+""+name);
}
public static void main(String[] args)
{
	bStudent_Boolean a=new bStudent_Boolean(12,"Amar");
	bStudent_Boolean b=new bStudent_Boolean(10, "Vino");
	System.out.println(a);
	System.out.println(b);
	System.out.println(a.equals(b));
}
public boolean equals(bStudent_Boolean ob)
{
	if(this.id==ob.id)
	return true;
	else 
	return false;
}
}
