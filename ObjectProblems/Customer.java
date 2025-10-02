package ObjectProblems;

class Customer {
	private int customerId;
	private String name;
	private String phone;

	public Customer(int id, String name, String phone) {
		// code here
		this.customerId = id;
		this.name = name;
		this.phone = phone;
	}

	public String toString() {
		// Customer-Max with ID-105

		return "Customer-" + name + " with Id- " + customerId;
		// Output should be in given format

	}
	// code equals and hashCode here

	@Override
	public boolean equals(Object cust) {
		Customer anothercust=(Customer)cust;
		if(this.customerId==anothercust.customerId && this.name.equals(anothercust.name) && this.phone.equals(anothercust.phone)) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {

		return 1+phone.hashCode()+name.hashCode();
	}

	public static void main(String[] args) {
		Customer c1 = new Customer(105, "Max", "8574637281");
		Customer c2 = new Customer(109, "Nick", "9453281756");
		Customer c3 = new Customer(109, "Nick", "9453281756");
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode()+ " "+ c3.hashCode());
		if (c2.equals(c3)) {
			System.out.println("The address objects are same!");
		} else {
			System.out.println("The address objects are different!");
		}
		
	}
}