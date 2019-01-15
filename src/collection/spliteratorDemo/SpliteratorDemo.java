package collection.spliteratorDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;

public class SpliteratorDemo {
	
	public static void main(String[] args) {
		List<Double> list = new ArrayList<>();
		list.add(1.0);
		list.add(2.0);
		list.add(3.0);
		list.add(4.0);
		
		Spliterator<Double> spliterator = list.spliterator();
		while(spliterator.tryAdvance((n) -> System.out.println(n)));
		
		System.out.println();
		
		/**
		 * 注：在这里因为迭代器已经到达迭代对象的最底部，指针指向最后一个元素，所以
		 * 再次迭代时tryAdvance()方法的返回值为false所以在list2集合中的元素为空
		 * ，也就是在List2中没有元素存在
		 */
//		spliterator = list.spliterator();
		List<Double> list2 = new ArrayList<>();
		while(spliterator.tryAdvance((n) -> list2.add(Math.sqrt(n))));
		System.out.println("this is spliterator2.");
		
		spliterator = list2.spliterator();
		spliterator.forEachRemaining((n) -> System.out.println(n));
		
	}

}
