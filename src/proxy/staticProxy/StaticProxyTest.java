package proxy.staticProxy;

public class StaticProxyTest {
	public static void main(String[] args) {
		//ʹ�����ִ������������� Ҫ��ǰд�������ң�����ӿڷ����仯����ô�������ʵ�ֵĽӿ�ҲҪ
		//����ά��
		ISing singer = new Singer();
		SingerProxy proxy = new SingerProxy(singer);
		proxy.sing();
	}
}
