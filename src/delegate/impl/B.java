package delegate.impl;

import delegate.I;
/**
 * 实现人B实现委派接口
 * @author lzz
 *
 */
public class B implements I{

	@Override
	public void f() {
		System.out.println("b doing f() thing");
	}

	@Override
	public void g() {
		System.out.println("b doing g() thing");
	}

}
