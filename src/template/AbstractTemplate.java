package template;

/**
 * 抽象模板中有抽象方法，已实现方法，钩子方法
 * 
 * 模板的关键：子类可以置换掉父类中的可变部分，但不能改变模板方法所代表的顶级逻辑
 * @author lzz
 *
 */
public abstract class AbstractTemplate {

	public void templateMethod() {
		doHookMethod();
		abstractMethod();
		concreteMethod();
	}
	
	/**
	 * 抽象方法，由子类具体实现
	 */
	protected abstract void abstractMethod();
	
	/**
	 * 钩子方法（空方法），由子类置换，可以进行扩展，抽象类中只提供一个默认的空实现
	 */
	public void doHookMethod() {
		System.out.println("before method");
	}
	
	/**
	 * 基本方法（已实现），由抽象类声明并实现，而子类并不实现和置换
	 */
	public void concreteMethod() {
		System.out.println("after method");
	}
}
