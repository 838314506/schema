package strategy;
/**
 * 价格类，持有一个具体的策略对象
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
