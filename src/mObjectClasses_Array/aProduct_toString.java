package mObjectClasses_Array;

public class aProduct_toString {
int productId;
int price;
public aProduct_toString(int productId,int price)
{
	this.productId=productId;
	this.price=price;
}
public static void main(String[] args) {
	aProduct_toString a=new aProduct_toString(1234,7000);
	System.out.println(a);
}
public String toString()
{
	return productId+"\n"+price;
}
}
