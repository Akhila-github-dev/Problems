package polymopism;

class Employee2 {
	private int empId;
	private String name;
	private double salary;

	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		
		PermanentEmployee2 emp=new PermanentEmployee2(101, "anil", 10000.0,1500,3);
		emp.calculateSalary();
		ContractEmployee emp1=new ContractEmployee(102,"ankit",500.0,10);
		emp1.calculateSalary();
	}

}

class PermanentEmployee2 extends Employee2 {
	PermanentEmployee2(int employeeId, String employeeName, Double basePay,double hra, int experience) {
	
		this.hra=hra;
		this.experience=experience;
		this.basicPay=basePay;
		}

	private double basicPay;
	private double hra;
	private int experience;

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public void calculateSalary() {
		double percentageBP=0;
		if (getExperience() < 3) {
			percentageBP=0;
		} else if (getExperience() >= 3 && getExperience() < 5) {
			percentageBP=5;
		} else if (getExperience() >= 5 && getExperience() < 10) {
			percentageBP=7;
		} else if (getExperience() >= 10 ) {
			percentageBP=12;
		} 
		double salary=getBasicPay()+getHra()+percentageBP;
	
		System.out.println("permanent emp your salary is "+salary);
	}
}

class ContractEmployee extends Employee2 {
	ContractEmployee(int employeeId, String employeeName, Double wages,int hours) {
		super();
		this.wage=wages;
		this.hours=hours;
	}

	private double wage;
	private int hours;

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	public void calculateSalary() {
		double salary= getHours()*getWage();
		
		System.out.println("contract emp your salary is "+salary);
	}
}
