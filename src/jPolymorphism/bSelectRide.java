package jPolymorphism;

import java.util.Scanner;

public class bSelectRide 
{
    public static void main(String[] args) 
    {
	    Scanner s= new Scanner(System.in);
	    System.out.println("Enter Option 1:Auto,2:Mini,3:Sedan");
	    int a=s.nextInt();
	   switch(a)
	   {
	   case 1:
     	{
	     	bAuto A=new bAuto();
		    bSelectRide.Book(A);
     	}
        	break;
	   case 2:
	   {
	    	bMini M=new bMini();
	     	bSelectRide.Book(M);
	   }
	      break;
    	case 3:
	    {
	    	bSedan S=new bSedan();
	    	bSelectRide.Book(S);
	     }
	    break;
    	default:
	    {
		System.out.println("invalid option");
	    }
	}
   }
	public  static void Book(bOla ob)
	{
	      ob.ride();
	      if(ob instanceof bAuto)
	      {
	    	  bAuto a = (bAuto)ob;
	    	  a.PaymentAuto();
	      }
	      else if(ob instanceof bMini)
	      {
	    	  bMini b = (bMini)ob;
	    	  b.paymentMini();
	      }
	      else
	      {
	    	  bSedan c = (bSedan)ob;
	    	  c.paymentSedan();
	      }
	}
	

}
