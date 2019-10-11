public class AllPermutations {

	// Function to print all the permutations of str
	static void printPermutn(String str, String ans) {

		// If string is empty
		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {

			// ith character of str
			char ch = str.charAt(i);

			// Rest of the string after excluding
			// the ith character
			String ros = str.substring(0, i) + str.substring(i + 1);  //substring works [0,i) i is exclusive

			// Recurvise call
			printPermutn(ros, ans + ch);
		}
	}

/*	public static String printAllPermutations(String input) {

		if (input.length() == 1)
			return input;

	String res = printAllPermutations(input
				.substring(0, input.length() - 1))
				+ input.charAt(input.length() - 1);
		System.out.println(res);
		return res;

	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		printAllPermutations("sriram");
		printPermutn("sriram", "");
		
		System.out.println("sriram".substring(0,0));
		System.out.println("*******");

	}

}
