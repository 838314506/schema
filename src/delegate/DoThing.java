package delegate;

import delegate.impl.A;
import delegate.impl.B;

/**
 * 将任务分配给具有同一行为的不同的人
 * @author lzz
 *
 */
public class DoThing implements I{
	I i = new A();

	@Override
	public void f() {
		i.f();
	}

	@Override
	public void g() {
		i.g();
	}

	public void a() {
		i = new A();
	}
	
	public void b() {
		i = new B();
	}
}
