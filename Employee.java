package AutoDealership;

public class Employee {

	double balance;
	public void checkFinance(Customer cust1, Vehicle vehicle1) {
		
		if(cust1.isNeedFinance() == true) {
			balance = vehicle1.getModelPrice() - cust1.getCashInHand();
			if(balance <= 0) {
				System.out.println("Finance may not be required for this order");
			}else {
				System.out.println("Finance needs to be arranged for " + balance + "rupees");
			}
		}else if(cust1.getCashInHand() >= vehicle1.getModelPrice()) {
			System.out.println(vehicle1.getBrandName() + " " + vehicle1.getModelName() + " is ready to Drive");
			Invoice invoice = new Invoice();
			invoice.printInvoice(cust1, vehicle1);
		}else {
			System.out.println("Purchase cannot be done");
		}
	}
	
}
