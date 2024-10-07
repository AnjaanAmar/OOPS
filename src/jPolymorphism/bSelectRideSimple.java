package jPolymorphism;

public class bSelectRideSimple 
{
	public static void main(String[] args) 
	{
		bOla a = new bAuto(); //Upcasting
		a.ride();
		bAuto aa = (bAuto)a;//DownCasting
		aa.PaymentAuto();
		
		bOla b = new bMini();
		a.ride();
		bMini bb = (bMini)a;
		bb.paymentMini();
		
		bOla c = new bSedan();
		c.ride();
		bSedan cc = (bSedan)a;
		cc.paymentSedan();
	}
}
