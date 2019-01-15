package strategy;

import strategy.manyStrategyImpl.AdvancedMemberStrategy;
import strategy.manyStrategyImpl.IntermediateMemberStrategy;
import strategy.manyStrategyImpl.PrimaryMemberStrategy;

/**
 * �ܽ����ģʽ��
 * 		ͳһ��Ϊ�Ľӿڣ���ͬ���㷨ʵ���࣬��֯�����㷨���ó���������;�����չ��
 * 		�����ͳһ����Ϊ����ôҪʹ�ó�����
 * �ŵ㣺���Լ��ٴ�����ظ��ԣ�Ҳ��Ӧ�ļ�����if{}else{}��ʹ��
 * ȱ�㣺����֪�����еĲ����࣬����ȷ��ʹ���ĸ����ԣ�Ҳ�����ÿһ�����Ե��㷨�����˽�
 * 		������Թ��࣬������൱�������������
 * @author lzz
 *
 */
public class StrategyTest {
	
	public static void main(String[] args) {
		//������ͨ�û�
		Price test = new Price(new PrimaryMemberStrategy());
		double result = test.calculate(18.5, 5);
		System.out.println(result);
		
		//�����м���Ա
		Price testIntermediateMember = new Price(new IntermediateMemberStrategy());
		double result2 = testIntermediateMember.calculate(18.5, 5);
		System.out.println(result2);
		
		//���Ը߼���Ա
		Price testAdvancedMember = new Price(new AdvancedMemberStrategy());
		double result3 = testAdvancedMember.calculate(18.5, 5);
		System.out.println(result3);
	}

}
