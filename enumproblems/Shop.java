package enumproblems;

enum Category {
	MOBILE, TABLET, COMPUTER, LAPTOP
}

public class Shop {
	private double amount;
	private Category type;
	private double discount;

	Shop(double amount, Category type) {
		this.amount = amount;
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public Category getType() {
		return type;
	}

	public void checkDiscountApplicability(double amount, Category type) {
		if (amount >= 30000) {
			System.out.println("congratulations you are applicable for discount");
			this.applyDiscount(type);
		} else {

			System.out.println("Thank you for shopping, your bill amount is: " + this.getAmount());
		}
	}

	public void applyDiscount(Category type) {

		double amount2 = getAmount();
		double discount = 0;
		switch (type) {
		case MOBILE:
			if (amount2 >= 30000.0) {
				discount = 15;
			} else {
				discount = 7;
			}
			break;
		case TABLET:
			if (amount2 >= 35000.0) {
				discount = 10;
			} else {
				discount = 7;
			}
			break;
		case COMPUTER:
			if (amount2 >= 50000.0) {
				discount = 10;
			} else {
				discount = 7;
			}
			break;
		case LAPTOP:
			if (amount2 >= 35000.0) {
				discount = 8;
			} else {
				discount = 7;
			}
			break;

		}
		System.out.println("discount applicable for u is "+discount +" %");
	}

	public static void main(String[] args) {

		Shop shop = new Shop(40000.0, Category.COMPUTER);
		shop.checkDiscountApplicability(shop.getAmount(), shop.getType());

	}
}
