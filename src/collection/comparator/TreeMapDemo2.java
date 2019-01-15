package collection.comparator;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {
	
	public static void main(String[] args) {
		TreeMap<String, Double> treeMap = new TreeMap<>(new TCom());
		treeMap.put("John Doe", new Double(3434.34));
		treeMap.put("Tom Smith", new Double(123.22));
		treeMap.put("Jane Baker", new Double(1378.00));
		treeMap.put("Tod Hall", new Double(99.22));
		treeMap.put("Rblph Smith", new Double(99.22));
		treeMap.put("Ralph Smith", new Double(99.22));
		
		Set<Entry<String, Double>> entries = treeMap.entrySet();
		
		for (Entry<String, Double> entry : entries) {
			System.out.print(entry.getKey() + " ");
			System.out.println(entry.getValue());
		}
		
		System.out.println();
		
		Double balance = treeMap.get("John Doe");
		treeMap.put("John Doe", balance + 1000);
		
		System.out.println("john doe new balance : " + treeMap.get("John Doe"));
		
	}

}
