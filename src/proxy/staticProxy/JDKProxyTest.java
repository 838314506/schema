package proxy.staticProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxyTest {
	//ʹ�����ַ�����ʵ�ִ�������������ʱ����һ���������
	//�������߶���һ����ͬ�㣬����ʵ�ֹ�ͬ�Ľӿ�
	
	/**
	 * ����һ��cglib����
	 * ���Ͷ�̬���������
	 * 	jdkֻ��ʵ���˽ӿڵ�����д������������ ��
	 *  cglib����ΪĿ��������һ�����࣬���������еķ���������Ŀ���಻����final��
	 * @param args
	 */
	
	/**
	 * cglib��jdk�ĸ��죿
	 * 	��jdk7��8�Ķ�̬�������ܱ�cglib��20%����
	 * @param args
	 */
	public static void main(String[] args) {
		Singer target = new Singer();
		ISing proxy = (ISing)Proxy.newProxyInstance(
				target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("�����ʺã�");
						Object result = method.invoke(target, args);
						System.out.println("лл��ң�");
						return result;
					}
				});
		proxy.sing();
	}
}
