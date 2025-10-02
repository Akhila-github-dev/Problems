package polymopism;

class Traveller {
	private String name;
	private String id;
	protected double fare;
	protected static final double BASE_FARE=2000;
	protected static final double SERVICE_TAX_PERCENT=11.36;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	// code as per class diagram

	public Traveller(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	public void calculateFare() {
	fare= BASE_FARE+(BASE_FARE* SERVICE_TAX_PERCENT/100);
	}

	public void displaydetails() {
		System.out.println("travller details");
		System.out.println("*****************************");
		System.out.println("traveller name "+getName());
		System.out.println("traveller  id "+getId());
		calculateFare();
		System.out.println("cost of travel "+fare);
	}

	public static void main(String[] args) {
		Traveller t=new Traveller("Priya","AQW1344321");
		t.displaydetails();
		System.out.println();
		SeniorTraveller s=new SeniorTraveller("Joey","PJAMG7755TY",70);
		s.displaydetails();
	}
}

class SeniorTraveller extends Traveller {
	public SeniorTraveller(String name, String id, int age) {
		super(name, id);
		this.age = age;
		// TODO Auto-generated constructor stub
	}

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void calculateFare() {
	if(age<50) {
		fare=-1;
	}else {
		double discount=0;
		if(age>=50 && age<=65) {
			discount=10;
		}else if(age>65) {
			discount=15;
		}
		double discountedFare = BASE_FARE-(BASE_FARE* discount/100);
		fare =discountedFare+(discountedFare*SERVICE_TAX_PERCENT/100);
	}
	}

	public void displaydetails() {
		System.out.println("senior travller details");
		System.out.println("*****************************");
		System.out.println("traveller name "+getName());
		System.out.println("traveller  id "+getId());
		calculateFare();
		if(fare ==-1) {
			System.out.println("error age below 50 not eligible");
		}else {
			System.out.println("traveller age "+age);
			System.out.println("cost of travel "+fare);
		}
	}

}
