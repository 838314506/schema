package template2;

public class MoneyMarketAccount extends Count{

	@Override
	protected String doCalculateCountType() {
		return "Money Market";
	}

	@Override
	protected double doCalculateInterestRate() {
		return 0.045;
	}

}
