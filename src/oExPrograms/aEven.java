package oExPrograms;

public class aEven {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		if (a[i]%2==0)
		{
			count++;
		}
	}
	System.out.println(count);
}
}
