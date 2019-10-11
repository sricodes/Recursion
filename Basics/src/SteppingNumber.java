import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SteppingNumber {

	public static void numHelper(int numTillNow, int appendDigit, int low,
			int high, List<Integer> l) {
		if (numTillNow > high || appendDigit < 0
				|| appendDigit > 9) {
			return;
		} else {
			l.add(numTillNow);
		}
		numTillNow = numTillNow * 10 + appendDigit;
		numHelper(numTillNow, (numTillNow % 10 - 1), low, high, l);
		numHelper(numTillNow, (numTillNow % 10 + 1), low, high, l);

	}

	public static List<Integer> countSteppingNumbers(int low, int high) {
		List<Integer> l = new ArrayList<>();

		for (int i = low; i <= 9; i++) {
			numHelper(i, i + 1, low, high, l);
			numHelper(i, i - 1, low, high, l);
		}

		Set<Integer> s = new HashSet<>();
		s.addAll(l);

		List<Integer> k = new ArrayList<>(s);
		Collections.sort(k);
		return k;
	}

	public static void main(String[] args) {

		List<Integer> m = countSteppingNumbers(0, 500);

		for (int i = 0; i < m.size(); i++) {
			System.out.println(m.get(i));
		}

	}
}
