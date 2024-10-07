package jPolymorphism;

public class aSwippingMachine 
{
	public static void main(String[] args) 
	{
	     aCard a = new aDebitCard();//upcasting
	     a.payment();
	     aDebitCard aa = (aDebitCard)a;//downcasting
	     aa.ReduceBalance();
	     
	     a = new aCreditCard();
	     a.payment();
	     aCreditCard bb = (aCreditCard)a;
	     bb.ReduceLimit();
	}
}
	
