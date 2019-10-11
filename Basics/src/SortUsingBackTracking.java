import java.util.HashSet;
import java.util.Set;

public class SortUsingBackTracking {

	public static void sortHelper(int[] source, int[] dest, Set<Integer> indexUsed,int destIndex) {

	}

	public static int[] sortArray(int[] input) {

		int[] res = new int[input.length];
		Set<Integer> s = new HashSet<>();

		for (int i = 0; i < input.length; i++) {
			sortHelper(input, res, s, 0);
		}

		return res;
	}

	public static void printArray(int[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
	}

	public static void main(String[] args) {
		printArray(sortArray(new int[] { 9, 8, 7, 6, 5, 4, 3, 2 }));
	}

}
