package strategy.manyStrategyImpl;

import strategy.MemberStrategy;

public class IntermediateMemberStrategy implements MemberStrategy{

	@Override
	public double calculate(double price, int number) {
		System.out.println("�м���Աÿ�������20%���Żݣ�");
		return price * 0.9 * number;
	}

}
