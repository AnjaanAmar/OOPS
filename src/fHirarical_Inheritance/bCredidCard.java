package fHirarical_Inheritance;

public class bCredidCard extends bCard {
double limit;
public bCredidCard(long cardno,int pinno,double limit)
{
	super(cardno,pinno);
	this.limit=limit;
}
public void Reducelimit()
{
	System.out.println("ReduceLimit="+limit);
}
}
