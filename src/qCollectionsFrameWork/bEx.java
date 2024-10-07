package qCollectionsFrameWork;

import java.util.ArrayList;

public class bEx {
public static void main(String[] args) {
	ArrayList<Object>b=new ArrayList();
	b.add("Amar");
	b.add(10);
	b.add("Vino");
	System.out.println(b);
	System.out.println(b.indexOf("Vino"));
	ArrayList<Object>c=new ArrayList();
	c.add("India");
	c.add("Aus");
	System.out.println(c);
	b.addAll(1,c);
	System.out.println(b);
}
}
