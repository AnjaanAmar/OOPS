package lArray;

public class fEmployee {
String name;
double salary;
public fEmployee(String name,double salary)
{
	this.name=name;
	this.salary=salary;
}
public void display()
{
	System.out.println("Name ="+name);
	System.out.println("Salary ="+salary);
}
public static void main(String[] args) {
	fEmployee a=new fEmployee("Amar",35000);
	fEmployee b=new fEmployee("Vino",50000);
	fEmployee c=new fEmployee("Surya",70000);
	fEmployee d=new fEmployee("Sachin",90000);
	fEmployee E[]= {a,b,c,d};
	for(int i=0;i<E.length;i++)
	{
		if(E[i].salary>40000 && E[i].salary<60000)
		{
			E[i].display();
		}
	}
}
}
