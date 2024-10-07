package hMultipleInheritance_Interface;

public class Sbi extends Rbi implements Atm {
public Sbi()
{
	System.out.println("SBI loading");
}
public void VehicalLoanIntrest()
{
	System.out.println("Vehical loan onwards");
}
public void HomeLoanIntrest()
{
	System.out.println("Home Loan onwards");
}
public void displayWish()
{
	System.out.println("Welcome to SBI");
}
public void Withdraw()
{
	System.out.println("You can withdraw");
}
public void CheckBalance()
{
	System.out.println("you can check the balance");
}
}
