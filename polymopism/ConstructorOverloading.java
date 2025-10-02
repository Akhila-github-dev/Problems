package polymopism;

public class ConstructorOverloading {
	private String customerId;
	private String customerName;
	private long contactNumber;
	
	public ConstructorOverloading() {
		System.out.println("Inside parameterless constructor");
	}
	
	public ConstructorOverloading(String customerId, String customerName, long contactNumber) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		
	}
	
	public ConstructorOverloading(String customerName, long contactNumber) {
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		
	}
	
	public static void main(String[] args) throws Exception {
		/*
		 Parameterless constructor will be invoked, instance variables should
		 be initialized using setter methods
		 */
		ConstructorOverloading customerOne = new ConstructorOverloading();
		/*
		 Parameterized constructor with three parameters instance variables are
		 initialized in the constructor
		 */
		ConstructorOverloading customerTwo = new ConstructorOverloading("C1016", "Stephen Abram",
				7856341287L);
		/*
		 Parameterized constructor with two parameters instance variables
		 are initialized in the constructor
		 */
		ConstructorOverloading customerThree = new ConstructorOverloading("James Jonathan", 7828171287L);
	}
}

