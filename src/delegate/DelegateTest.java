package delegate;

public class DelegateTest {
	public static void main(String[] args) {
		DoThing doThing = new DoThing();
		
		//����a�����������
		doThing.a();
		doThing.f();
		doThing.g();
		
		//��b�����������
		doThing.b();
		doThing.f();
		doThing.g();
	}
}
