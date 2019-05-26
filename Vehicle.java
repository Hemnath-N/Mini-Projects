package AutoDealership;

public class Vehicle {

	private String brandName;
	private String modelName;
	private double modelPrice;
	
	public Vehicle(String brandName, String modelName, double modelPrice) {
		super();
		this.brandName = brandName;
		this.modelName = modelName;
		this.modelPrice = modelPrice;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public double getModelPrice() {
		return modelPrice;
	}
	public void setModelPrice(double modelPrice) {
		this.modelPrice = modelPrice;
	}
}
