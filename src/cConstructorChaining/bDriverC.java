package cConstructorChaining;

public class bDriverC {
public static void main(String[] args) {
	bCitizen C=new bCitizen("Amar",8124112731l,"TN",2345678);
	C.details();
	bCitizen C1=new bCitizen("Raghu",7654345678l,345678987);
	C1.details();
	bCitizen C2= new bCitizen("Avin",1234562345l);
	C2.details();
}
}
