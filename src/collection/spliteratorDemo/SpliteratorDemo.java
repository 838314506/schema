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
		 * ע����������Ϊ�������Ѿ���������������ײ���ָ��ָ�����һ��Ԫ�أ�����
		 * �ٴε���ʱtryAdvance()�����ķ���ֵΪfalse������list2�����е�Ԫ��Ϊ��
		 * ��Ҳ������List2��û��Ԫ�ش���
		 */
//		spliterator = list.spliterator();
		List<Double> list2 = new ArrayList<>();
		while(spliterator.tryAdvance((n) -> list2.add(Math.sqrt(n))));
		System.out.println("this is spliterator2.");
		
		spliterator = list2.spliterator();
		spliterator.forEachRemaining((n) -> System.out.println(n));
		
	}

}
