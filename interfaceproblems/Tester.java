package interfaceproblems;

public class Tester {

	public static void main(String[] args) {
		Intern intern=new Intern(283, 77);
		intern.calcPercentage();
		Trainee trainee=new Trainee(370);
		trainee.calcPercentage();
	}
}
