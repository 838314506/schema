package template;

/**
 * ����ģ�����г��󷽷�����ʵ�ַ��������ӷ���
 * 
 * ģ��Ĺؼ�����������û��������еĿɱ䲿�֣������ܸı�ģ�巽��������Ķ����߼�
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
	 * ���󷽷������������ʵ��
	 */
	protected abstract void abstractMethod();
	
	/**
	 * ���ӷ������շ��������������û������Խ�����չ����������ֻ�ṩһ��Ĭ�ϵĿ�ʵ��
	 */
	public void doHookMethod() {
		System.out.println("before method");
	}
	
	/**
	 * ������������ʵ�֣����ɳ�����������ʵ�֣������ಢ��ʵ�ֺ��û�
	 */
	public void concreteMethod() {
		System.out.println("after method");
	}
}
