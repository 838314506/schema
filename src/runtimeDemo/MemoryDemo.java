package runtimeDemo;

public class MemoryDemo {
	
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		long mem1,mem2;
		Integer someints[] = new Integer[1000];
		System.out.println("the total memory is :" + r.totalMemory());
		mem1 = r.freeMemory();
		System.out.println("initial free memory is :" + mem1);
		r.gc();
		mem1 = r.freeMemory();
		System.out.println("free memory after gc operation : " + mem1);
		
		
		for (int i = 0; i < someints.length; i++) {
			someints[i] = new Integer(i);
		}
		mem2 = r.freeMemory();
		
		System.out.println("free memory after allocation :" + mem2);
		System.out.println("memory used by allocation :" + (mem1 - mem2));
		
		for (int i = 0; i < someints.length; i++) someints[i] = null;
		
		r.gc();
		mem2 = r.freeMemory();
		System.out.println("free memory after collecting discarded Integers :" + mem2);
	}

}
