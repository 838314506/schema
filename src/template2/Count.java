package template2;

public abstract class Count {
	
	/**
	 * �����߼�����
	 * @return
	 */
	public double calculateInterest() {
		//�õ����������
		double rate = doCalculateInterestRate();
		//�õ������˺ŵ�����
		String type = doCalculateCountType();
		//��ȡ���н��
		double amount = calculateAmount(type);
		//���ؼ�����
		return amount * rate;
	}
	
	/**
	 * ���󷽷�������ʵ�������������ʵ��
	 * ����ȷ�������˻�����
	 */
	protected abstract String doCalculateCountType() ;
	
	/**
	 * ���󷽷�������ʵ�������������ʵ��
	 * ����ȷ�����������
	 */
	protected abstract double doCalculateInterestRate();
	
	/**
	 * ������������ʵ��
	 */
	private double calculateAmount(String countType) {
		return 7243.00;
	}

}
