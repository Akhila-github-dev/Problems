package interfaceproblems;

public class Intern implements Student {
	
	private int marksSecured;
	private int projectMarks;

	@Override
	public void calcPercentage() {
		int marks=projectMarks+marksSecured;
		if(marks>400) {
			System.out.println("please enter the coorect maeks");
			return;
		}
	
		int totalmarks=  marks*100/TOTAL_MAXIMUM_MARKS;
		System.out.println("marks secured "+totalmarks);
		
	}

	public Intern(int marksSecured, int projectMarks) {
		super();
		this.marksSecured = marksSecured;
		this.projectMarks = projectMarks;
	}

}
