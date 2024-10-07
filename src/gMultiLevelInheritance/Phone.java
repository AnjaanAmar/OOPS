package gMultiLevelInheritance;

public class Phone extends Gadeget{
int simslot;
String batcap;
public Phone(String brand,int price,int simslot,String batcap)
{
	super(brand,price);
	this.simslot=simslot;
	this.batcap=batcap;
}
public void detailsP()
{
	System.out.println("Simslot"+simslot);
	System.out.println("batcap"+batcap);
}
}
