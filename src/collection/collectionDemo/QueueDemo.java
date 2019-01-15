package collection.collectionDemo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.add("tom");
		queue.add("jerry");
		
		//�ڶ��е�β�����һ��Ԫ�أ��ɳ����ظ�ֵ
		boolean result = queue.offer("tom");
		System.out.println("the result is " + result);
		
		//��ʱ���һ�µ�һ��Ԫ�أ����Ҹ�Ԫ�ز��ᱻ�Ƴ�
		String peekResult = queue.peek();
		System.out.println("peekResult is " + peekResult);
		
//		queue.clear();
//		
//		//�������Ϊ�գ���һ��û�����Ԫ�ص��쳣
//		String elementResult = queue.element();
//		System.out.println("elementResult is " + elementResult);
		
		//��ʱ���һ�µ�һ��Ԫ�أ����Ҹ�Ԫ�ػᱻ�Ƴ�
//		String pollResult = queue.poll();
//		System.out.println("pollResult is " + pollResult);
		
		//�Ƴ�Ԫ�أ����������Ϊ�գ�������û�����Ԫ�ص��쳣
//		String removeResult = queue.remove();
//		System.out.println("removeResult is " + removeResult);
		
		queue.offer("rose");
		
		
		
		System.out.println("============");
		queue.forEach(System.out::println);
	}

}
