package cloneDemo;

public class TestClone implements Cloneable{
	
	int a;
	double b;
	
	TestClone cloneTest() {
		try {
			return (TestClone) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("clone is not allow");
			return this;
		}
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("clone is not allow");
			return this;
		}
	}

}
