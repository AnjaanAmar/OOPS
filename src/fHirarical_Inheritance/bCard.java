package fHirarical_Inheritance;

public class bCard {
long cardno;
int pinno;
public bCard(long cardno,int pinno)
{
	this.cardno=cardno;
	this.pinno=pinno;
}
public void details()
{
	System.out.println("Card no="+cardno);
	System.out.println("pin no="+pinno);
}
}
