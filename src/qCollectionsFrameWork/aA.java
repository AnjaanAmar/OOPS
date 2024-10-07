package qCollectionsFrameWork;

import java.util.ArrayList;

public class aA {
public static void main(String[] args) {
	ArrayList<String>ob=new ArrayList();
	ob.add("Red");
	ob.add("Blue");
	ob.add("Green");
	ob.add("Black");
	System.out.println(ob);
	System.out.println("For Loop");
	for(int i=0;i<ob.size();i++)
	{
		System.out.println(ob.get(i));
	}
	System.out.println("For Each Loop");
	for(String i:ob)
	{
		System.out.println(i);
	}
	System.out.println("Reverse Order");
	for(int i=ob.size()-1;i>=0;i--)
	{
		System.out.println(ob.get(i));
	}
}
}
