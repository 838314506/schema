package collection.mapDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.lang.model.element.Element;

public class MapDemo {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		System.out.println("ͨ��map.entrySet()����������");
		
		
		for (String keySet : map.keySet()) {
			System.out.println(keySet);
		}
		
		System.out.println("ͨ��map.keySet()����������map�����е�key");
		
		
		for (Integer value : map.values()) {
			System.out.println(value);
		}
		
		System.out.println("ͨ��map.values()����������map�����е�value");
		
		Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("ͨ��iterator���������е���");
		
		List<String> list = new ArrayList<>();
		list.add("four");
		list.add("five");
		list.add("six");
		
		list.forEach(System.out::println);
	}
}
