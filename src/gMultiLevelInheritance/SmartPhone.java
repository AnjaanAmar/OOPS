package gMultiLevelInheritance;

public class SmartPhone extends Phone{
String camera;
public SmartPhone(String brand,int price,int simslot,String batcap,String camera)
{
	super(brand,price,simslot,batcap);
	this.camera=camera;
	
}
public void detailsS()
{
	detailsG();
	detailsP();
	System.out.println("Camer"+camera);
}
}
