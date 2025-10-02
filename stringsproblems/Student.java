package stringsproblems;

public class Student {

	private String firstName;
	private String middleName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Student change() {

		String firstName = getFirstName().trim();
		String middleName = getMiddleName().trim();
		String lastName = getLastName().trim();
		if (middleName.isBlank()) {
			middleName = "N.A";
		}
		Student student = new Student();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setMiddleName(middleName);
		return student;

	}

	public String generateInitials() {
		Student changedetails = change();

	//	System.out.println(changedetails.getFirstName().charAt(0));
		String initials =""+ changedetails.getFirstName().charAt(0)
				+ changedetails.getMiddleName().charAt(0) + changedetails.getLastName().charAt(0);
		return initials;

	}

	public static void main(String[] args) {

		Student std1 = new Student();
		std1.setFirstName("Filius  ");
		std1.setMiddleName(" ");
		std1.setLastName("Flitwich");

		System.out.println(std1.generateInitials());

	}

	/*
	 * Input(for Student) : First Name : “ Filius ” ;
	 * 
	 * Middle Name: “ ” ;
	 * 
	 * Last Name: “ Flitwich” ;
	 * 
	 * Output :FNF
	 */
}
