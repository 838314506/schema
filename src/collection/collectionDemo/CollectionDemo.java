package collection.collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

public class CollectionDemo {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
//		
//		boolean result = list.removeIf(t -> {
//			boolean flag = t.contains("t");
//			return flag;
//		});
//		if(result) {
//			System.out.println("ÓÐ°üº¬tµÄ×Ö·û´®£¡");
//		}
//		list.forEach(System.out::println);
		
//		list.clear();
//		System.out.println(list.isEmpty());
		
//		list.replaceAll(new UnaryOperator<String>() {
//			
//			@Override
//			public String apply(String t) {
//				return t + "l";
//			}
//		});
//		
//		list.forEach(System.out::println);
		
		ListIterator<String> ite = list.listIterator();
		
		while (ite.hasNext()) {
			String element = ite.next();
			ite.set(element + " + ");
		}
		
		list.forEach(System.out::print);
		System.out.println("===========");
		
		while (ite.hasNext()) {
			String element = ite.next();
			System.out.println(element + " ");
		}
		
		System.out.println();
		
		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasPrevious()) {
			String ele = ite.previous();
			System.out.print(ele + " ");
		}
		
		list.forEach(System.out::print);
		
	}

}
