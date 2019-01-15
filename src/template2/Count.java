package template2;

public abstract class Count {
	
	/**
	 * 顶级逻辑方法
	 * @return
	 */
	public double calculateInterest() {
		//得到具体的利率
		double rate = doCalculateInterestRate();
		//得到计算账号的类型
		String type = doCalculateCountType();
		//获取所有金额
		double amount = calculateAmount(type);
		//返回计算结果
		return amount * rate;
	}
	
	/**
	 * 抽象方法，具体实现留给子类进行实现
	 * 用于确定哪种账户类型
	 */
	protected abstract String doCalculateCountType() ;
	
	/**
	 * 抽象方法，具体实现留给子类进行实现
	 * 用于确定计算的利率
	 */
	protected abstract double doCalculateInterestRate();
	
	/**
	 * 基本方法，已实现
	 */
	private double calculateAmount(String countType) {
		return 7243.00;
	}

}
