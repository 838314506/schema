package collection.collectionDemo;

import java.util.Comparator;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		set.add(1);
		set.add(100);
		set.add(66);
		set.add(88);
		
		set.forEach(System.out::println);
	}
}
