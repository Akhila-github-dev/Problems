package Listproblems;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
class Student {
	private int studentId;
	private String studentName;
	private boolean courseRegistered;

	public Student(int studentId, String studentName, boolean courseRegistered) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.courseRegistered = courseRegistered;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public boolean getCourseRegistered() {
		return courseRegistered;
	}

	public void setCourseRegistered(boolean courseRegistered) {
		this.courseRegistered = courseRegistered;
	}


	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1001, "Steve", true));
		studentList.add(new Student(1002, "Rachel", false));
		studentList.add(new Student(1003, "Monica", true));
		studentList.add(new Student(1004, "David", true));

		List<String> studentNames = new ArrayList<String>();
		// Iteration of the studentList using for-each loop
		for (Student student : studentList) {
			studentNames.add(student.getStudentName());
			System.out.println("Student ID : " + student.getStudentId());
			System.out.println("Student Name : " + student.getStudentName());
			System.out.println("Course Registered : " + student.getCourseRegistered());
		}
		System.out.println("Student Names : " + studentNames);
		
		System.out.println("============================================");
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1001, "Steve", true));
		students.add(new Student(1002, "Rachel", false));
		students.add(new Student(1003, "Monica", true));
		students.add(new Student(1004, "David", true));

		ListIterator<Student> itr = students.listIterator();
		
		System.out.println("Display the student names");
		while (itr.hasNext()) {
			System.out.println(itr.next().getStudentName());
		}

		System.out.println("Display the student names in reverse order");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous().getStudentName());
		}


	}
}
