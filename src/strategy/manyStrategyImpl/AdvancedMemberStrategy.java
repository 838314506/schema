package strategy.manyStrategyImpl;

import strategy.MemberStrategy;

public class AdvancedMemberStrategy implements MemberStrategy{

	@Override
	public double calculate(double price, int number) {
		System.out.println("�߼���Ա����ÿ����20%���Żݣ�");
		return price * 0.8 * number;
	}

}
