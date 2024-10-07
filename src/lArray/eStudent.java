package lArray;

public class eStudent {
String name;
float persentage;
public eStudent(String name,float persentage)
{
	this.name=name;
	this.persentage=persentage;
}
public void display()
{
	System.out.println("Name ="+name);
	System.out.println("Persentage ="+persentage);
}
public static void main(String[] args) {
	eStudent a=new eStudent("Amar",72.4f);
	eStudent b=new eStudent("Vino",88.45f);
	eStudent c=new eStudent("Raghu",60.0f);
	eStudent d=new eStudent("Avin",50.55f);
	eStudent e=new eStudent("Kamali",40.56f);
	eStudent Arr[]= {a,b,c,d,e};
	for(int i=0;i<Arr.length;i++)
	{
		if(Arr[i].persentage>60)
		{
			Arr[i].display();
		}
	}
}
}
