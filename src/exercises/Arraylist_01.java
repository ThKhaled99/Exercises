package exercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist_01 {
	
	
	public static void printArrList() {
	List<String> options = new ArrayList<String>();
	options.add("jack");
	options.add("optisom");
	options.add("hackar");
	
	Iterator<String> ittrIterator = options.iterator();
	
	while (ittrIterator.hasNext()) {
		System.out.println(ittrIterator.next().toString());
	}
	}
	
}
