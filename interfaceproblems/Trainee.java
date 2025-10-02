package interfaceproblems;

public class Trainee implements Student {
	
	private int marksSecured;
	

	@Override
	public void calcPercentage() {
		if(marksSecured>400) {
			System.out.println("please enter the coorect maeks");
			return;
		}
		
		int totalmarks=(marksSecured *100)/TOTAL_MAXIMUM_MARKS;
		System.out.println(totalmarks);
		
	}

	public Trainee(int marksSecured) {
		super();
		this.marksSecured = marksSecured;
		

}
}
