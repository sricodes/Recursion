import java.util.ArrayList;
import java.util.List;

public class DigitPerm {

	public static void Helper(String dest, List<String> ans,
			char[] charChoices, int mainSize) {

		if (dest.length() == mainSize) { // this is same as if size == 0
			ans.add(dest);
			return;
		}

		for (char x : charChoices) {
			Helper(dest + x, ans, charChoices, mainSize); // i'll get first u do
															// the rest //
															// character you do

		}

	}

	public static List<String> genPerm(char[] charChoices, int N) {

		List<String> ans = new ArrayList<>();

		Helper("", ans, charChoices, N);

		return ans;

	}

	public static List<String> mirrorNumber(int N) {
		char[] choices = "1689".toCharArray();
		List<String> nums = new ArrayList<>();

		if (N % 2 == 0) {

			for (String half : genPerm(choices, N / 2)) {
				nums.add(half + reverse(half));
			}

		} else {

			for (String half : genPerm(choices, N / 2)) {
				for (char mid : "0123456789".toCharArray()) {
					nums.add(half + mid + reverse(half));
				}
			}

		}
		return nums;
	}

	public static String reverse(String half) {
		if (half.length() == 1)
			return half;
		return reverse(half.substring(1)) + half.charAt(0);
	}

	public static void PrintList(List l) {

		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}

	}

	public static void main(String[] args) {

		PrintList(mirrorNumber(5)); // "input string can be
									// convert to set of
									// chars to remve
									// duplicates

	}

}
