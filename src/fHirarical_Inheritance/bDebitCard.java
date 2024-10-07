package fHirarical_Inheritance;

public class bDebitCard extends bCard{
double bal;
public bDebitCard(long cardno,int pinno,double bal)
{
	super(cardno,pinno);
	this.bal=bal;
}
public void DebitBal()
{
	System.out.println("DebitBal="+bal);
}
}
