package strategy.manyStrategyImpl;

import strategy.MemberStrategy;

public class PrimaryMemberStrategy implements MemberStrategy{

	@Override
	public double calculate(double price,int number) {
		System.out.println("��ͨ�û�û���Żݻ��");
		return price * number;
	}

}
