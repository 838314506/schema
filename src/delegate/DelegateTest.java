package delegate;

public class DelegateTest {
	public static void main(String[] args) {
		DoThing doThing = new DoThing();
		
		//先由a来做这件事情
		doThing.a();
		doThing.f();
		doThing.g();
		
		//由b来做这件事情
		doThing.b();
		doThing.f();
		doThing.g();
	}
}
