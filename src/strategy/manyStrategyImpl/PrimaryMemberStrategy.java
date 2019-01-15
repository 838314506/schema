package strategy.manyStrategyImpl;

import strategy.MemberStrategy;

public class PrimaryMemberStrategy implements MemberStrategy{

	@Override
	public double calculate(double price,int number) {
		System.out.println("普通用户没有优惠活动！");
		return price * number;
	}

}
