package strategy.manyStrategyImpl;

import strategy.MemberStrategy;

public class AdvancedMemberStrategy implements MemberStrategy{

	@Override
	public double calculate(double price, int number) {
		System.out.println("高级会员进行每本书20%的优惠！");
		return price * 0.8 * number;
	}

}
