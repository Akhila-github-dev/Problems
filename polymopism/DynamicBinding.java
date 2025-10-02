package polymopism;
class DynamicBinding {

	public static void main(String[] args) {
		RegularCustomer regCust1 = new RegularCustomer();
		Customer Cust = new Customer();
		PremiumCustomer premCust1 = new PremiumCustomer();
		
		showCustomerDetails(regCust1);
		showCustomerDetails(premCust1);
		showCustomerDetails(Cust);
	}
	
	public static void showCustomerDetails(Customer customer) {
		customer.display();
	}
}

class Customer {
	public void display() {
		System.out.println("Customer is coming...");
	}
}

class RegularCustomer extends Customer {
	@Override
	public void display() {
		System.out.println("A regular customer has come");
	}
}

class PremiumCustomer extends Customer {
	@Override
	public void display() {
		System.out.println("A premium customer has come");
	}
}

