package AutoDealership;

import java.util.Scanner;

public class AutoDealership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input  = new Scanner(System.in);
		
		System.out.println("-----Details to be filled by Customer-----");
		System.out.println("Enter your name");
		String vCustName = input.nextLine();
		System.out.println("Enter the Car Name");
		String vCarName   = input.nextLine();
		System.out.println("Enter the Model Name");
		String vModelName = input.nextLine();
		System.out.println("Enter the Cash in hand");
		double vCashInHand = input.nextDouble();
		System.out.println("Enter (true/false) if finance needed");
		boolean vNeedFinance = input.nextBoolean();
		
		System.out.println("-----Details to be filled by Employee-----");
		System.out.println("Please enter the Model Price for " + vCarName + " " + vModelName);
		double vModelPrice = input.nextDouble();
		
		Customer cust1 = new Customer(vCustName,vCarName,vModelName,vCashInHand,vNeedFinance);
		Vehicle vehicle1 = new Vehicle(vCarName,vModelName,vModelPrice);
		Employee emp1 = new Employee();
		
		emp1.checkFinance(cust1,vehicle1);
				
	}

}
