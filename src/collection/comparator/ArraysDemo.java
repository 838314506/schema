package collection.comparator;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
	
	public static void main(String[] args) {
		byte[] ll = new byte[] {3,9,6,2,10};
//		List<byte[]> asList = Arrays.asList(ll);
//		Arrays.sort(ll);
//		Arrays.binarySearch(ll, 2);
		//�˴����еĸ�����ʹ�õ���ƣ������ڶԿ��������������޸ĺ�ԭ���鲻���ܵ�Ӱ��
		byte[] bs = Arrays.copyOf(ll, 5);
		bs[0] = 0;
		for (byte b : ll) {
			System.out.print(b + "  ");
		}
		System.out.println();
		
		for (byte b : bs) {
			System.out.print(b + "  ");
		}
		System.out.println();
		System.out.println(bs == ll);
	}

}
