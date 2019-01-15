package template2;

import java.util.HashMap;
import java.util.Map;

public class Client {
	
	public static void main(String[] args) {
		MoneyMarketAccount moneyMarketAccount = new MoneyMarketAccount();
		System.out.println("货币市场账号的利息税额："+moneyMarketAccount.calculateInterest());
		CDAAccount cdaAccount = new CDAAccount();
		System.out.println("定期账号的利息数额："+cdaAccount.calculateInterest());
		Map<String, Object> map = new HashMap<>();
		map.put("one", 1);
	}

}
