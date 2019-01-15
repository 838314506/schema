package template2;

public class CDAAccount extends Count{

	@Override
	protected String doCalculateCountType() {
		return "Certificate of Deposite";
	}

	@Override
	protected double doCalculateInterestRate() {
		return 0.06;
	}

}
