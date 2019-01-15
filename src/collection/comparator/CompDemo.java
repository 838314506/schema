package collection.comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class CompDemo {

	public static void main(String[] args) {
		Comparator<String> comparator = (o1, o2) -> o1.compareTo(o2);
			
		TreeSet<String> treeSet = new TreeSet<>(comparator
				);
		treeSet.add("a");
		treeSet.add("f");
		treeSet.add("b");
		treeSet.add("i");
		
		for (String string : treeSet) {
			System.out.println(string);
		}
		
	}
	
}
