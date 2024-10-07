package qCollectionsFrameWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class dShorting {
public static void main(String[] args) {
	ArrayList<Integer>a=new ArrayList();
	a.add(123);
	a.add(90);
	a.add(44);
	a.add(10);
	a.add(25);
	System.out.println("Insertion order "+a);
	Collections.reverse(a);
	System.out.println("Reverse order "+a);
	Collections.sort(a);
	System.out.println("Assending order "+a);
	Collections.reverse(a);
	System.out.println("Desending order "+a);
}
}
