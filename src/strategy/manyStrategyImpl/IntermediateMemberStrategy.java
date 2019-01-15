package strategy.manyStrategyImpl;

import strategy.MemberStrategy;

public class IntermediateMemberStrategy implements MemberStrategy{

	@Override
	public double calculate(double price, int number) {
		System.out.println("中级会员每本书进行20%的优惠！");
		return price * 0.9 * number;
	}

}
