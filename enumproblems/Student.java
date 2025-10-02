package enumproblems;

enum Grade {
	A, B, C, D, E;
}

public class Student {

	private Integer studentId;
	private String name;
	private Integer totalMarks;
	private Grade grade;
	//Grade is the name of enum
	private float scholarshipAmount;
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(Integer totalMarks) {
		this.totalMarks = totalMarks;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public float getScolarshipAmount() {
		return scholarshipAmount;
	}
	public void setScolarshipAmount(float scolarshipAmount) {
		this.scholarshipAmount = scolarshipAmount;
	}
	
	public void calculateGrade() {
	Integer totalMarks2 = getTotalMarks();
	
	if(totalMarks2>=250) {
		grade = Grade.A;
	}else if(totalMarks2>=200 && totalMarks2<250) {
		grade= Grade.B;
	}else if(totalMarks2>=175 && totalMarks2<200) {
		grade= Grade.C;
	}else if(totalMarks2>=150 && totalMarks2<175) {
		grade= Grade.D;
	}else {
		grade=Grade.E;
	}
		
	}
	
	public void calculateScolarshipAmount() {
//	this.calculateGrade();
	
	switch(grade) {
	case A:
		setScolarshipAmount(5000);
		break;
	case B:
		setScolarshipAmount(4000);
		break;
	case C:
		setScolarshipAmount(3000);
		break;
	case D:
		setScolarshipAmount(2000);
		break;
	case E:
		setScolarshipAmount(0);
		break;
	}
	}

    public static void main(String[] args) {
       Student student = new Student();
       student.setStudentId(1000);
       student.setName("Alvin");
       student.setTotalMarks(280);
       student.calculateGrade();
       student.calculateScolarshipAmount();
       System.out.println("Student Details");
       System.out.println("***************");
       System.out.println("Student Id : "+student.getStudentId());
       System.out.println("Name : "+student.getName());
       System.out.println("Grade : "+student.getGrade());
       System.out.println("Scholarship Amount : "+student.getScolarshipAmount());
       
    }
}
