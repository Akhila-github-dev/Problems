package stringsproblems;

public class example1 {

	private String customerName;
	private int applicableDiscount;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getApplicableDiscount() {
		return applicableDiscount;
	}

	public void setApplicableDiscount(int applicableDiscount) {
		this.applicableDiscount = applicableDiscount;
	}

	public void findDiscountAndName(String inputString) {

		String splitted[] = inputString.trim().split(":");

		if (splitted[0].equalsIgnoreCase("regular")) {
			applicableDiscount = 10;
		}

		else if (splitted[0].equalsIgnoreCase("privileged")) {
			applicableDiscount = 20;
		}
		System.out.println("Hi " + splitted[1] + " ! " + applicableDiscount + "% discount is applicable for you");

	}

	public static void main(String[] args) {
		example1 customer1 = new example1(); // regular
		example1 customer2 = new example1(); // privileged
		customer1.findDiscountAndName("Regular:Jack");
		customer2.findDiscountAndName("Privileged:Mary");
	}
}
