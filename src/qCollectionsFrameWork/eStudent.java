package qCollectionsFrameWork;

import java.util.ArrayList;

public class eStudent {
int id;
String name;
public eStudent(int id,String name)
{
	super();
	this.id=id;
	this.name=name;
}
public String toString()
{
	return id+" "+name;
	
}
public static void main(String[] args) {
	ArrayList<eStudent>x=new ArrayList();
	eStudent a=new eStudent(12, "Amar");
	x.add(a);
	x.add(new eStudent(122,"Vino"));
	x.add(new eStudent(44, "FGHJ"));
	for(eStudent i:x)
	{
		System.out.println(i);
	}
}
}
