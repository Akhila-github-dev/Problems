package Wrapperproblems;

class Student {
	private String studentId;
	private String name;
	private String examId;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExamId() {
		return examId;
	}

	public void setExamId(String examId) {
		this.examId = examId;
	}

	public String generateExamId() {

		String namesplit[] = getName().split(" ");
		String firstname = namesplit[0].substring(0, 3);
		String lastname = namesplit[1].substring(0, 3);
		String studentid = getStudentId();
		
		String lastDigit = studentid.substring(studentid.length() - 1);
		
		int last = Integer.parseInt(lastDigit);
		int square= last*last;
		
		return firstname+"-"+lastname+":"+studentid+"-"+square;

	}

	public static void main(String[] args) {
		Student stud1 = new Student();
		Student stud2 = new Student();
		stud1.setName("John Whedon");
		stud1.setStudentId("4596");
		System.out.println(stud1.generateExamId());

		stud2.setName("Ross Stark");
		stud2.setStudentId("3412");
		System.out.println(stud2.generateExamId());
	}
}
