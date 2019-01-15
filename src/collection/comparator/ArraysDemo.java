package collection.comparator;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
	
	public static void main(String[] args) {
		byte[] ll = new byte[] {3,9,6,2,10};
//		List<byte[]> asList = Arrays.asList(ll);
//		Arrays.sort(ll);
//		Arrays.binarySearch(ll, 2);
		//此处进行的复制是使用的深复制，所以在对拷贝后的数组进行修改后，原数组不会受到影响
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
