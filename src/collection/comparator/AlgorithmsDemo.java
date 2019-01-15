package collection.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * ����������Collections���е�һЩ���߷��������԰����ǽ���һЩ��Լ��ϵĲ���
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
		
		//�������е�Ԫ�������
		Collections.shuffle(ll);
		
		for(Integer s : ll) {
			System.out.print(s + "  ");
		}
		
		System.out.println();
		
		System.out.println("the max value is :" + Collections.max(ll));
		System.out.println("the min value is :" + Collections.min(ll));
	}

}
