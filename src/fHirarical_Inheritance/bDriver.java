package fHirarical_Inheritance;

public class bDriver {
public static void main(String[] args) {
	bDebitCard d=new bDebitCard(123456789l,5555,1000000);
	d.details();
	d.DebitBal();
	bCredidCard c=new bCredidCard(222222222l,6666,2345324244d);
	c.details();
	c.Reducelimit();
	bCard ca=new bCard(111111111,2222);
	ca.details();
}
}
