package regexproblems;

import java.util.regex.Pattern;

public class ex1 {

	public static void main(String[] args) {
		String regex = "Hello";
		String input = "Hello";

		// Pattern Matching done using matches() method
		System.out.println(input.matches(regex));
		// Pattern Matching done using Pattern.matches() method
		System.out.println(Pattern.matches(regex, input));
		/**
		 * Output: true, true
		 */

		// Regular Expression for Name Validation:
		String nameRegex = "([A-Za-z ]+)";
		// Regular Expression for Email Id Validation:
		String emailIdRegex = "([A-Za-z0-9-_]+)[@]([a-z]+)[.](com|in)";
		/*
		 * [] Bracket expressions create a character class to match a single character
		 * contained within the brackets. '_' can be used to specify a range.
		 * 
		 * [xyz] matches 'x', 'y' or 'z'. [a-z] matches any letter from 'a' to 'z'.
		 * 
		 * . Matches any single character, except a newline. Inside a bracket
		 * expression, it becomes a literal dot.
		 * 
		 * b.t matches "bat", "bRt", "b8t", etc.
		 * 
		 * [^ ] Matches a single character that is not within the brackets.
		 * 
		 * [^xyz] matches 'a', '6', etc.
		 * 
		 * I "or" expression to match alternatives.
		 * 
		 * bat|cat matches "bat" or "cat"
		 * 
		 * () Groups expressions to form sub-expressions. Also used to capture groups.
		 * 
		 * Ma(nn|tt)er matches "Matter" or "Manner"
		 * 
		 * \n Matches the nth captured sub-expression group. Groups are numbered from
		 * left to right.
		 * 
		 * ([a-z])\1 matches "dd", "hh", etc.
		 */

		/*
		 * ? Matches the preceding element zero or one time.
		 * 
		 * Ba?it matches "Bait" and "Bit"
		 * 
		 * 
		 * 
		 * -> * Matches the preceding element zero or more times. 10*1 matches "11",
		 * "1001", etc.
		 * 
		 * + Matches the preceding element one or more times.
		 * 
		 * 10+1 matches "101", "1001", etc.
		 * 
		 * {m} Matches the preceding element exactly m times.
		 * 
		 * 10{4}1 matches "100001"
		 * 
		 * {m,} Matches the preceding element m or more times.
		 * 
		 * 10{3,}1 matches "10001", "100001", "1000000001", etc.
		 * 
		 * {m,n} Matches the preceding element minimum m and maximum n times.
		 * 
		 * xy{2,3}z matches "xyyz" and "xyyyz"
		 */
	}

}
