package collection.comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapDemo2A {

	public static void main(String[] args) {
		CompLastNames cln = new CompLastNames();
		Comparator<String> comp = cln.thenComparing(new CompFirstNames());

		TreeMap<String, Double> treeMap = new TreeMap<>(comp);
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

class CompLastNames implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		int i, j;
		i = o1.lastIndexOf(' ');
		j = o2.lastIndexOf(' ');
		return o1.substring(i).compareToIgnoreCase(o2.substring(j));
	}
}

class CompFirstNames implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.compareToIgnoreCase(o2);
	}

}
