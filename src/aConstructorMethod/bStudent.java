package aConstructorMethod;

public class bStudent {
static String Course="SDET";
String name;
long contact;
String branch;
String mail;
public bStudent(String name,long contact,String branch,String mail)
{
	this.name=name;
	this.contact=contact;
	this.branch=branch;
	this.mail=mail;
}
public void details()
{
	System.out.println("STUDENT DETAILS");
	System.out.println("Name "+ name );
	System.out.println("Contact "+ contact);
	System.out.println("Branch "+branch);
	System.out.println("Mail "+mail);
}
public static void main(String[] args) {
	bStudent s1=new bStudent("Amar",1234567890,"qwe","anvsv@SWD");
	bStudent s2=new bStudent("vino",1234565679,"sasxs","sdfsff");
	s1.details();
	s2.details();
}
}
