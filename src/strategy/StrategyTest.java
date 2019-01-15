package strategy;

import strategy.manyStrategyImpl.AdvancedMemberStrategy;
import strategy.manyStrategyImpl.IntermediateMemberStrategy;
import strategy.manyStrategyImpl.PrimaryMemberStrategy;

/**
 * 总结策略模式：
 * 		统一行为的接口，不同的算法实现类，组织调用算法，让程序更加灵活和具有扩展性
 * 		如果是统一的行为，那么要使用抽象类
 * 优点：可以减少代码的重复性，也相应的减少了if{}else{}的使用
 * 缺点：必须知道所有的策略类，自行确定使用哪个策略，也必须对每一个策略的算法有所了解
 * 		如果策略过多，会出现相当大数量的类出现
 * @author lzz
 *
 */
public class StrategyTest {
	
	public static void main(String[] args) {
		//测试普通用户
		Price test = new Price(new PrimaryMemberStrategy());
		double result = test.calculate(18.5, 5);
		System.out.println(result);
		
		//测试中级会员
		Price testIntermediateMember = new Price(new IntermediateMemberStrategy());
		double result2 = testIntermediateMember.calculate(18.5, 5);
		System.out.println(result2);
		
		//测试高级会员
		Price testAdvancedMember = new Price(new AdvancedMemberStrategy());
		double result3 = testAdvancedMember.calculate(18.5, 5);
		System.out.println(result3);
	}

}
