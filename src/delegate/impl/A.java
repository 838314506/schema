package delegate.impl;

import delegate.I;

/**
 * 实现人A实现委派接口
 * @author lzz
 *
 */
public class A implements I{

	@Override
	public void f() {
		System.out.println("a  doing f() thing");
	}

	@Override
	public void g() {
		System.out.println("a doing g() thing");
	}

}
