package template2;

import java.util.HashMap;
import java.util.Map;

public class Client {
	
	public static void main(String[] args) {
		MoneyMarketAccount moneyMarketAccount = new MoneyMarketAccount();
		System.out.println("�����г��˺ŵ���Ϣ˰�"+moneyMarketAccount.calculateInterest());
		CDAAccount cdaAccount = new CDAAccount();
		System.out.println("�����˺ŵ���Ϣ���"+cdaAccount.calculateInterest());
		Map<String, Object> map = new HashMap<>();
		map.put("one", 1);
	}

}
