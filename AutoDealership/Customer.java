package AutoDealership;

public class Customer {

	private String custName;
	private String carName;
	private String modelName;
	private double cashInHand;
	private boolean needFinance;
	
	public Customer(String custName, String carName, String modelName, double cashInHand, boolean needFinance) {
		super();
		this.custName	 = custName;
		this.carName 	 = carName;
		this.modelName 	 = modelName;
		this.cashInHand  = cashInHand;
		this.needFinance = needFinance;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public double getCashInHand() {
		return cashInHand;
	}

	public void setCashInHand(double cashInHand) {
		this.cashInHand = cashInHand;
	}

	public boolean isNeedFinance() {
		return needFinance;
	}

	public void setNeedFinance(boolean needFinance) {
		this.needFinance = needFinance;
	}

	/*
	 * @Override public String toString() { return "Customer [carName=" + carName +
	 * ", modelName=" + modelName + ", cashInHand=" + cashInHand + ", needFinance="
	 * + needFinance + "]"; }
	 */		
}
