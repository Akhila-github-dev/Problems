package exceptionhandling;

public class Test {

	public static void main(String[] args) {
		Applicant applicant=new Applicant();
		applicant.setApplicantName("akhi");
		applicant.setPostApplied("assistant");
		applicant.setApplicantAge(22);
		Validator validator=new Validator();
		validator.validate(applicant);
	}

}
