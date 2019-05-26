package AutoDealership;

public class Invoice {

	Customer customer;
	Vehicle  vehicle;
	
	public void printInvoice(Customer customer,Vehicle vehicle) {
		
		System.out.println("-----INVOICE------");
		System.out.println("Customer Name: " + customer.getCustName());
		System.out.println("Car Name     : " + vehicle.getBrandName());
		System.out.println("Model Name   : " + vehicle.getModelName());
		System.out.println("Amount Paid  : " + vehicle.getModelPrice());
		System.out.println("-----THANK YOU-------");
		
	}
	
}
