package collection.collectionDemo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.add("tom");
		queue.add("jerry");
		
		//在队列的尾部添加一个元素，可出现重复值
		boolean result = queue.offer("tom");
		System.out.println("the result is " + result);
		
		//临时输出一下第一个元素，并且该元素不会被移除
		String peekResult = queue.peek();
		System.out.println("peekResult is " + peekResult);
		
//		queue.clear();
//		
//		//如果队列为空，报一个没有这个元素的异常
//		String elementResult = queue.element();
//		System.out.println("elementResult is " + elementResult);
		
		//临时输出一下第一个元素，并且该元素会被移除
//		String pollResult = queue.poll();
//		System.out.println("pollResult is " + pollResult);
		
		//移除元素，如果队列中为空，则会出现没有这个元素的异常
//		String removeResult = queue.remove();
//		System.out.println("removeResult is " + removeResult);
		
		queue.offer("rose");
		
		
		
		System.out.println("============");
		queue.forEach(System.out::println);
	}

}
