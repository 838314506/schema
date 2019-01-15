package strategy;
/**
 * �۸��࣬����һ������Ĳ��Զ���
 * @author lzz
 *
 */
public class Price {
	
	private MemberStrategy memberStrategy;
	
	public Price(MemberStrategy memberStrategy) {
		this.memberStrategy = memberStrategy;
	}
	
	public double calculate(double bookPrice,int number) {
		return memberStrategy.calculate(bookPrice, number);
	}

}
