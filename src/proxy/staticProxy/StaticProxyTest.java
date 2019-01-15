package proxy.staticProxy;

public class StaticProxyTest {
	public static void main(String[] args) {
		//使用这种代理，代理对象必须 要提前写出，而且，如果接口发生变化后，那么代理对象实现的接口也要
		//进行维护
		ISing singer = new Singer();
		SingerProxy proxy = new SingerProxy(singer);
		proxy.sing();
	}
}
