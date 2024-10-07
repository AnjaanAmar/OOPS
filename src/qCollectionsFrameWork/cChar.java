package qCollectionsFrameWork;

import java.util.ArrayList;

public class cChar {
public static void main(String[] args) {
	ArrayList<Character>a=new ArrayList();
	a.add('a');
	a.add('w');
	a.add('e');
	a.add('r');
	System.out.println(a);
	for(char i:a)
	{
		System.out.println(i);
	}
	System.out.println(a.indexOf('w'));
	System.out.println(a.get(2));
	System.out.println(a.size());
	System.out.println(a.clear());
}
}
