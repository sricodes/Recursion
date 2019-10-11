public class PalindromeCheck {

	public static boolean isPalindrome(String input) {

		if (input.length() == 1)
			return true;
		if (input.length() == 2)
			return input.charAt(0) == input.charAt(1);
		System.out.println(input);

		return isPalindrome(input.substring(1, input.length() - 1)) // substring(x,y)
																	// x in
																	// inclusive
																	// and y is
																	// exclusive
				&& (input.charAt(0) == input.charAt(input.length() - 1));

	}

	public static void main(String[] args) {

		System.out.println(isPalindrome("aabbaa"));
	}

}
