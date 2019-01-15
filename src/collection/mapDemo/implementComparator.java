package collection.mapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class implementComparator {
	
	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>();
//		hashMap.put(6, "six");
//		hashMap.put(1, "one");
//		hashMap.put(3, "three");
//		hashMap.put(2, "two");
		hashMap.put("rose", 8);
		hashMap.put("tom", 9);
		hashMap.put("jack", 5);
		hashMap.put("jerry", 12);
		
		
		Set<Entry<String, Integer>> entrySet = hashMap.entrySet();
		
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println("the key is : " + entry.getKey());
			System.out.println("the value is : " + entry.getValue());
		}
		
		System.out.println("======================");
		
		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("rose", 8);
		treeMap.put("tom", 9);
		treeMap.put("jack", 5);
		treeMap.put("jerry", 12);
		
		Set<Entry<String, Integer>> entrySet2 = treeMap.entrySet();
		
		for (Entry<String, Integer> entry : entrySet2) {
			System.out.println("the key is : " + entry.getKey());
			System.out.println("the value is : " + entry.getValue());
		}
	}

}
