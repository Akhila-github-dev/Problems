package regexproblems;

class WebAddressValidator {
	public boolean isValidWebAddress(String webAddress) {
		// code here
		return false;
	}

	public static void main(String[] args) {
		WebAddressValidator webAddressValidator=new WebAddressValidator();
		System.out.println(webAddressValidator.isValidWebAddress("http://www.infosys.com"));
		/*
		 * Input (Valid): "http://www.infosys.com"
		 * 
		 * Output: "You have entered a valid web address"
		 * 
		 * Input (Invalid): "http.www.infosys.au"
		 * 
		 * Output: "You have entered an invalid web address"
		 */
	}
}