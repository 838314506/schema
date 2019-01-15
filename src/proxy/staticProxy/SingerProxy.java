package proxy.staticProxy;

public class SingerProxy implements ISing{
	
	private ISing iSing;
	
	public SingerProxy(ISing iSing) {
		this.iSing = iSing;
	}

	@Override
	public void sing() {
		System.out.println("�����ʺ�");
		iSing.sing();
		System.out.println("лл���");
	}

}
