public class ReverseString {

	public static String reverseString(String input) {
		if (input.length() < 2) { // Base case 
			return input;
		}

		return reverseString(input.substring(1, input.length()))
				+ input.charAt(0);  // if it works for (n-1) the simpler case , how can i make it bigger
	}  // Step 2 and 3 can be soloved together

	public static void main(String[] args) {

		System.out.println(reverseString("sriram kumar"));

	}

}
