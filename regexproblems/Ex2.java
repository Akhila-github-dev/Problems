package regexproblems;

public class Ex2 {

	public static void main(String[] args) {
//		"EK-860619645:IN"
		String finalRegexPatternComplete = "([A-Z]{2}[-])([\\d]{9}[:])([A-Z]{2})";

		String searchStr = "Application";
		String regexStr = "App.*";
		System.out.println(searchStr.matches(regexStr)); // Output: true

		String searchStr1 = "A%(lication";
		String regexStr1 = "A..lication";
		System.out.println(searchStr1.matches(regexStr1)); // Output: true
		String searchStr2 = "M4thematics";
		String regexStr2 = "M\\dt.*";
		System.out.println(searchStr2.matches(regexStr2)); // Output: true
		String searchStr3 = "X9Y";
		String regexStr3 = "X[4-8]Y";
		System.out.println(searchStr3.matches(regexStr3)); // Output: false
		String searchStr4 = "Fellow";
		String regexStr4 = "(Hell|Fell).*";
		System.out.println(searchStr4.matches(regexStr4)); // Output: true
		String searchStr5 = "Air line";
		String regexStr5 = "Air\\s.*";
		System.out.println(searchStr5.matches(regexStr5)); // Output: true
		String searchStr6 = "X4756Y";
		String regexStr6 = "X\\d*Y";
		System.out.println(searchStr6.matches(regexStr6)); // Output: true
		String searchStr7 = "M4N";
		String regexStr7 = "M\\d+N";
		System.out.println(searchStr7.matches(regexStr7)); // Output: true
		String searchStr8 = "M42N";
		String regexStr8 = "M\\d{3}N";
		System.out.println(searchStr8.matches(regexStr8)); // Output: false

		// Regex having three groups being Back-Referenced
		// The three groups must repeat after the ":" symbol in the String to match the
		// pattern.
		String repeatRegex = "([A-Za-z0-9]+) (\\d+) ([A-Z]+) [:] \\1 \\2 \\3";
		String repeatStr = "Tom123 9090 JERRY : Tom123 9090 JERRY";

		/*
		 * In the above example, "\\1" refers to the first group "([A-Za-z0-9])", "\\2"
		 * refers to "(\\d+)" and "\\3" refers to "([A-Z]+)". And so, the regex expects
		 * the string to have all the three groups repeat itself whenever the back
		 * referencing is done.
		 */
	}
}
