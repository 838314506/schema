package proxy.staticProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxyTest {
	//使用这种方法来实现代理，可以在运行时创建一个代理对象
	//但是两者都有一个共同点，必须实现共同的接口
	
	/**
	 * 还有一种cglib代理
	 * 它和动态代理的区别：
	 * 	jdk只对实现了接口的类进行代理，而不能针对 类
	 *  cglib则是为目标类生成一个子类，并覆盖其中的方法，所以目标类不能是final类
	 * @param args
	 */
	
	/**
	 * cglib和jdk哪个快？
	 * 	在jdk7及8的动态代理性能比cglib好20%左右
	 * @param args
	 */
	public static void main(String[] args) {
		Singer target = new Singer();
		ISing proxy = (ISing)Proxy.newProxyInstance(
				target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("向大家问好！");
						Object result = method.invoke(target, args);
						System.out.println("谢谢大家！");
						return result;
					}
				});
		proxy.sing();
	}
}
