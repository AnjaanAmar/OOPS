package jPolymorphism;

import java.util.Scanner;

public class aSwippingMcn {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter 1->Debit card 2->Credit card");
	int n=s.nextInt();
	switch(n) 
	{
	case 1:
	{
		aDebitCard d=new aDebitCard();
		aSwippingMcn.swipe(d);
	}
	break;
	case 2:
	{
		aCreditCard c=new aCreditCard();
		aSwippingMcn.swipe(c);
	}
	break;
	default :
	{
		System.out.println("invalid option");
	}
	}
}
	public static void swipe(aCard ob)//aCard ob = new aDebitCard
	{
		ob.payment();
		if(ob instanceof aDebitCard)
		{
			aDebitCard x=(aDebitCard)ob;
			x.ReduceBalance();
		}
		else 
		{
			aCreditCard y=(aCreditCard)ob;
			y.ReduceLimit();
		}
	}
}

