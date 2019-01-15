package collection.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * 该类描述了Collections类中的一些工具方法，可以帮我们进行一些针对集合的操作
 * @author lzz
 *
 */
public class AlgorithmsDemo {
	
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(-8);
		ll.add(20);
		ll.add(-20);
		ll.add(8);
		
		Comparator<Object> r = Collections.reverseOrder();
		
		Collections.sort(ll,r);
		
		for (Integer s : ll) {
			System.out.print(s + "  ");
		}
		System.out.println();
		
		//将集合中的元素随机化
		Collections.shuffle(ll);
		
		for(Integer s : ll) {
			System.out.print(s + "  ");
		}
		
		System.out.println();
		
		System.out.println("the max value is :" + Collections.max(ll));
		System.out.println("the min value is :" + Collections.min(ll));
	}

}
