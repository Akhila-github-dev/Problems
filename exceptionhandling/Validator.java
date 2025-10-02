package exceptionhandling;

public class Validator {

	public void validate(Applicant applicant) {
		try {
		if(!isVaildName(applicant.getApplicantName())) {
			throw new InfyBankException("invalid application name");
		}else if(!isVaildAge(applicant.getApplicantAge())) {
			throw new InfyBankException("invalid application age");
		}else if(!isVaildPost(applicant.getPostApplied())) {
			throw new InfyBankException("invalid post");
		}
		
		System.out.println("all the values are valid");
		}catch (InfyBankException e) {
		System.out.println(e.getMessage());
		}
		
	}

	boolean isVaildName(String name) {
		if (name == null || name.isEmpty()) {
			return false;
		}
		return true;

	}

	boolean isVaildPost(String post) {
		if (post.equalsIgnoreCase("Probationary Officer") || post.equalsIgnoreCase("Assistant")
				|| post.equalsIgnoreCase("Special Cadre Officer")) {
			return true;
		}
		return false;

	}

	boolean isVaildAge(int age) {
		if (age >= 18 && age < 35) {
			return true;
		}
		return false;

	}

}
